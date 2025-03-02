package compilador;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import compilador.LineNumbering;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



/**
 *
 * @author Usuario
 */
public class Interface extends javax.swing.JFrame {

 private File arquivoAtual; 
    private boolean arquivoAlterado = false;

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        configureKeyBindings();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        Scroll = new javax.swing.JScrollPane();
        Divisao = new javax.swing.JSplitPane();
        scrollEntrada = new javax.swing.JScrollPane();
        entrada = new javax.swing.JTextArea();
        scrollSaida = new javax.swing.JScrollPane();
        saida = new javax.swing.JTextArea();
        barraDeFeramentas = new javax.swing.JToolBar();
        novo = new javax.swing.JButton();
        abrir = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        copiar = new javax.swing.JButton();
        colar = new javax.swing.JButton();
        recortar = new javax.swing.JButton();
        compilar = new javax.swing.JButton();
        equipe = new javax.swing.JButton();
        statusBar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 600));

        painelPrincipal.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(910, 600));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(910, 600));
        painelPrincipal.setLayout(new java.awt.BorderLayout());

        Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Scroll.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        Scroll.setMinimumSize(new java.awt.Dimension(900, 25));
        Scroll.setPreferredSize(null);

        Divisao.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        Divisao.setResizeWeight(0.5);
        Divisao.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        Divisao.setMinimumSize(new java.awt.Dimension(900, 25));
        Divisao.setPreferredSize(null);

        scrollEntrada.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollEntrada.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollEntrada.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        scrollEntrada.setMinimumSize(new java.awt.Dimension(900, 25));
        scrollEntrada.setPreferredSize(null);

        entrada.setColumns(20);
        entrada.setRows(5);
        entrada.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        entrada.setMinimumSize(new java.awt.Dimension(900, 25));
        entrada.setPreferredSize(null);
        scrollEntrada.setViewportView(entrada);
        entrada.getAccessibleContext().setAccessibleParent(painelPrincipal);

        Divisao.setTopComponent(scrollEntrada);

        scrollSaida.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollSaida.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollSaida.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        scrollSaida.setMinimumSize(new java.awt.Dimension(900, 25));
        scrollSaida.setPreferredSize(null);

        saida.setEditable(false);
        saida.setColumns(20);
        saida.setRows(5);
        saida.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        saida.setMinimumSize(new java.awt.Dimension(900, 25));
        saida.setPreferredSize(null);
        scrollSaida.setViewportView(saida);

        Divisao.setRightComponent(scrollSaida);

        Scroll.setViewportView(Divisao);

        painelPrincipal.add(Scroll, java.awt.BorderLayout.CENTER);
        // Adiciona LineNumbering ao scrollEntrada
        lineNumberingEntrada = new LineNumbering(entrada);
        scrollEntrada.setRowHeaderView(lineNumberingEntrada);

        // Adiciona LineNumbering ao scrollSaida
        lineNumberingSaida = new LineNumbering(saida);
        scrollSaida.setRowHeaderView(lineNumberingSaida);

        barraDeFeramentas.setRollover(true);
        barraDeFeramentas.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        barraDeFeramentas.setMinimumSize(new java.awt.Dimension(900, 70));
        barraDeFeramentas.setPreferredSize(new java.awt.Dimension(900, 70));

        novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/registro.png"))); // NOI18N
        novo.setText("novo [ctrl-n]");
        novo.setFocusable(false);
        novo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novo.setIconTextGap(-1);
        novo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });
        barraDeFeramentas.add(novo);

        abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/abrir.png"))); // NOI18N
        abrir.setText(" abrir [ctrl-o]");
        abrir.setFocusable(false);
        abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        abrir.setIconTextGap(-1);
        abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        barraDeFeramentas.add(abrir);

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        salvar.setText("salvar [ctrl-s]");
        salvar.setBorderPainted(false);
        salvar.setFocusable(false);
        salvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salvar.setIconTextGap(-1);
        salvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        barraDeFeramentas.add(salvar);

        copiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/copiar.png"))); // NOI18N
        copiar.setText("copiar [ctrl-c]");
        copiar.setFocusable(false);
        copiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        copiar.setIconTextGap(-1);
        copiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        barraDeFeramentas.add(copiar);

        colar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/colar.png"))); // NOI18N
        colar.setText("colar [ctrl-v]");
        colar.setFocusable(false);
        colar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        colar.setIconTextGap(-1);
        colar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        colar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colarActionPerformed(evt);
            }
        });
        barraDeFeramentas.add(colar);

        recortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/recortar.png"))); // NOI18N
        recortar.setText(" recortar [ctrl-x]");
        recortar.setFocusable(false);
        recortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        recortar.setIconTextGap(-1);
        recortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        recortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recortarActionPerformed(evt);
            }
        });
        barraDeFeramentas.add(recortar);

        compilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/compilar.png"))); // NOI18N
        compilar.setText("compilar [F7]");
        compilar.setFocusable(false);
        compilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compilar.setIconTextGap(-1);
        compilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilarActionPerformed(evt);
            }
        });
        barraDeFeramentas.add(compilar);

        equipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/equipe.png"))); // NOI18N
        equipe.setText(" equipe [F1]");
        equipe.setFocusable(false);
        equipe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        equipe.setIconTextGap(-1);
        equipe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        equipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipeActionPerformed(evt);
            }
        });
        barraDeFeramentas.add(equipe);

        painelPrincipal.add(barraDeFeramentas, java.awt.BorderLayout.PAGE_START);
        barraDeFeramentas.getAccessibleContext().setAccessibleParent(entrada);

        statusBar.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        statusBar.setMinimumSize(new java.awt.Dimension(900, 25));
        statusBar.setPreferredSize(new java.awt.Dimension(900, 25));
        painelPrincipal.add(statusBar, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(painelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void configureKeyBindings() {
    javax.swing.InputMap inputMap = painelPrincipal.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
    javax.swing.ActionMap actionMap = painelPrincipal.getActionMap();

    // Associando Ctrl+N ao botão "Novo"
    inputMap.put(javax.swing.KeyStroke.getKeyStroke("control N"), "novoAction");
    actionMap.put("novoAction", new javax.swing.AbstractAction() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            novoActionPerformed(evt);
        }
    });

    // Associando Ctrl+O ao botão "Abrir"
    inputMap.put(javax.swing.KeyStroke.getKeyStroke("control O"), "abrirAction");
    actionMap.put("abrirAction", new javax.swing.AbstractAction() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            abrirActionPerformed(evt);
        }
    });

    // Associando Ctrl+S ao botão "Salvar"
    inputMap.put(javax.swing.KeyStroke.getKeyStroke("control S"), "salvarAction");
    actionMap.put("salvarAction", new javax.swing.AbstractAction() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            salvarActionPerformed(evt);
        }
    });

    // Associando Ctrl+C ao botão "Copiar"
    inputMap.put(javax.swing.KeyStroke.getKeyStroke("control C"), "copiarAction");
    actionMap.put("copiarAction", new javax.swing.AbstractAction() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            copiarActionPerformed(evt);
        }
    });

    // Associando Ctrl+V ao botão "Colar"
    inputMap.put(javax.swing.KeyStroke.getKeyStroke("control V"), "colarAction");
    actionMap.put("colarAction", new javax.swing.AbstractAction() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            colarActionPerformed(evt);
        }
    });

    // Associando Ctrl+X ao botão "Recortar"
    inputMap.put(javax.swing.KeyStroke.getKeyStroke("control X"), "recortarAction");
    actionMap.put("recortarAction", new javax.swing.AbstractAction() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            recortarActionPerformed(evt);
        }
    });

    // Associando F7 ao botão "Compilar"
    inputMap.put(javax.swing.KeyStroke.getKeyStroke("F7"), "compilarAction");
    actionMap.put("compilarAction", new javax.swing.AbstractAction() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            compilarActionPerformed(evt);
        }
    });

    // Associando F1 ao botão "Equipe"
    inputMap.put(javax.swing.KeyStroke.getKeyStroke("F1"), "equipeAction");
    actionMap.put("equipeAction", new javax.swing.AbstractAction() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            equipeActionPerformed(evt);
        }
    });
}
    
    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
       entrada.setText("");       
    saida.setText("");         
    arquivoAtual = null;      
    statusBar.setText("");     
    }//GEN-LAST:event_novoActionPerformed

    private void colarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colarActionPerformed
         entrada.paste();
    }//GEN-LAST:event_colarActionPerformed

    private void compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compilarActionPerformed

    private void equipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipeActionPerformed
        JOptionPane.showMessageDialog(this, "Desenvolvido por:\nYuri Gralha\nRicardo Sasse", 
                                  "Informações da Equipe", 
                                  JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_equipeActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
      JFileChooser fileChooser = new JFileChooser();
    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try {
            entrada.setText(java.nio.file.Files.readString(file.toPath()));  
            saida.setText("");                                               
            arquivoAtual = file;                                             
            statusBar.setText("Arquivo: " + file.getName() + " | Caminho: " + file.getAbsolutePath()); 
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao abrir o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_abrirActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
    if (arquivoAtual == null) { // Caso seja um novo arquivo
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            arquivoAtual = fileChooser.getSelectedFile();
        } else {
            return; // Se o usuário cancelar, não faz nada e mantém o estado anterior
        }
    }
    try (FileWriter writer = new FileWriter(arquivoAtual)) {
        writer.write(entrada.getText());   // Salva o conteúdo do editor no arquivo
        saida.setText("");                 // Limpa a área de mensagens
        if (arquivoAtual != null) {
            statusBar.setText("Arquivo salvo: " + arquivoAtual.getName() + " | Caminho: " + arquivoAtual.getAbsolutePath()); // Atualiza a barra de status
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_salvarActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
    entrada.copy();
    }//GEN-LAST:event_copiarActionPerformed

    private void recortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recortarActionPerformed
         entrada.cut();
    }//GEN-LAST:event_recortarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane Divisao;
    private LineNumbering lineNumberingEntrada;
    private LineNumbering lineNumberingSaida;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JButton abrir;
    private javax.swing.JToolBar barraDeFeramentas;
    private javax.swing.JButton colar;
    private javax.swing.JButton compilar;
    private javax.swing.JButton copiar;
    private javax.swing.JTextArea entrada;
    private javax.swing.JButton equipe;
    private javax.swing.JButton novo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JButton recortar;
    private javax.swing.JTextArea saida;
    private javax.swing.JButton salvar;
    private LineNumbering lineNumbering;
    private javax.swing.JScrollPane scrollEntrada;
    private javax.swing.JScrollPane scrollSaida;
    private javax.swing.JLabel statusBar;
    // End of variables declaration//GEN-END:variables

}
