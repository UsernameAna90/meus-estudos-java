package olamundoswing;

public class OlaMundoSwing extends javax.swing.JFrame {

    //Cria novo form chamado "OlaMundoSwing"
    public OlaMundoSwing() {
        //Inicializa os componentes da janela gráfica criados automaticamente no código gerado pelo forms
        initComponents();
    }
    
    //Código gerado pelo forms editor para configurar janela gráfica 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensagem = new javax.swing.JLabel();
        btnClique = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        lblMensagem.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 153, 153));
        lblMensagem.setText("A mensagem aparecerá aqui!");

        btnClique.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClique.setForeground(new java.awt.Color(204, 0, 51));
        btnClique.setText("Gerar mensagem!");
        btnClique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblMensagem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnClique)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblMensagem)
                .addGap(51, 51, 51)
                .addComponent(btnClique, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cria um evento ao se clicar no botão "btnClique"
    private void btnCliqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliqueActionPerformed
        //Implime o texto "Olá Mundo! ao se clicar no botão btnClique"
        lblMensagem.setText("Olá Mundo!");
    }//GEN-LAST:event_btnCliqueActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(OlaMundoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OlaMundoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OlaMundoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OlaMundoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Cria e mostra a janela gráfica pré-configurada
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlaMundoSwing().setVisible(true);
            }
        });
    }

    // Variáveis que inselerem elementos "label" e "button" na janela gráfica
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClique;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
