package compilador;


import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LineNumbering extends JPanel {
    private static final int LINE_NUMBER_PADDING = 10; // Espaço para os números das linhas
    private final JTextArea textArea;
    private final FontMetrics fontMetrics;
    private final int lineHeight;
    private static final int FIRST_LINE_OFFSET = 5; // Deslocamento adicional para o primeiro número

    public LineNumbering(JTextArea textArea) {
        this.textArea = textArea;
        this.setOpaque(false); // Tornar o fundo transparente

        // Inicializa a fonte e as métricas de fonte
        this.fontMetrics = textArea.getFontMetrics(textArea.getFont());
        this.lineHeight = fontMetrics.getHeight();

        // Adiciona DocumentListener para atualizar a numeração quando o texto muda
        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                repaint();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                repaint();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                repaint();
            }
        });

        // Adiciona CaretListener para atualizar a numeração quando o cursor se move
        textArea.addCaretListener(e -> repaint());

        // Adiciona ComponentListener para atualizar a numeração quando o componente é redimensionado
        textArea.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                repaint();
            }
        });

        // Adiciona ChangeListener ao JScrollPane se ele existir
        SwingUtilities.invokeLater(() -> {
            JScrollPane scrollPane = (JScrollPane) SwingUtilities.getAncestorOfClass(JScrollPane.class, textArea);
            if (scrollPane != null) {
                scrollPane.getViewport().addChangeListener(e -> repaint());
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);

        // Obtém o índice da linha visível superior e inferior
        int firstVisibleLine = 0;
        try {
            firstVisibleLine = textArea.getLineOfOffset(textArea.viewToModel2D(new Point(0, 0)));
        } catch (BadLocationException ex) {
            Logger.getLogger(LineNumbering.class.getName()).log(Level.SEVERE, null, ex);
        }
        int lastVisibleLine = 0;
        try {
            lastVisibleLine = textArea.getLineOfOffset(textArea.viewToModel2D(new Point(0, getHeight())));
        } catch (BadLocationException ex) {
            Logger.getLogger(LineNumbering.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Calcula a posição vertical inicial
        int y = textArea.getInsets().top - (firstVisibleLine * lineHeight) + FIRST_LINE_OFFSET;

        // Calcula a largura do número mais longo
        int maxLineNumberWidth = fontMetrics.stringWidth(String.valueOf(lastVisibleLine + 1));

        // Desenha os números das linhas visíveis
        for (int i = firstVisibleLine; i <= lastVisibleLine; i++) {
            String lineNumberText = String.valueOf(i + 1);

            // Calcula a posição horizontal centralizada
            int textWidth = fontMetrics.stringWidth(lineNumberText);
            int x = getWidth() - LINE_NUMBER_PADDING - textWidth;

            // Calcula a posição vertical centralizada
            int textHeight = fontMetrics.getAscent() - fontMetrics.getDescent();
            int centerY = y + textHeight / 2;

            // Desenha o número da linha no centro vertical
            g2d.drawString(lineNumberText, x, centerY);

            y += lineHeight;
        }
    }

    @Override
    public Dimension getPreferredSize() {
        int lineCount = textArea.getLineCount();
        int maxLineNumberLength = String.valueOf(lineCount).length();
        int maxLineNumberWidth = fontMetrics.stringWidth("0" + String.valueOf(lineCount)); // Ajuste para o número mais largo
        int width = LINE_NUMBER_PADDING + maxLineNumberWidth; // Largura do painel
        int height = lineHeight * lineCount;
        return new Dimension(width, height);
    }
}