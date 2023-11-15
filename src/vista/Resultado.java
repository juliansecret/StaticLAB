
package vista;

import javax.swing.SwingUtilities;

public class Resultado extends javax.swing.JFrame {
    
    public Resultado() {
        initComponents();
   
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                txtArea_Resultado.setCaretPosition(0);
            }
        });
         
       setVisible(true); // Asegúrate de que sea visible al crear una instancia

       setResizable(false);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Principal = new javax.swing.JPanel();
        Panel_Resultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Resultado = new javax.swing.JTextArea();
        Panel_Titulo = new javax.swing.JPanel();
        label_Titulo = new javax.swing.JLabel();
        btn_Graficar = new javax.swing.JButton();
        Panel_Encabezado = new javax.swing.JPanel();
        label_Encabezado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel_Principal.setBackground(new java.awt.Color(0, 102, 102));

        Panel_Resultado.setBackground(new java.awt.Color(51, 51, 51));
        Panel_Resultado.setForeground(new java.awt.Color(255, 255, 255));
        Panel_Resultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArea_Resultado.setEditable(false);
        txtArea_Resultado.setBackground(new java.awt.Color(255, 255, 255));
        txtArea_Resultado.setColumns(20);
        txtArea_Resultado.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtArea_Resultado.setForeground(new java.awt.Color(0, 0, 0));
        txtArea_Resultado.setRows(5);
        jScrollPane1.setViewportView(txtArea_Resultado);

        Panel_Resultado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 788, 370));

        Panel_Titulo.setBackground(new java.awt.Color(0, 51, 51));

        label_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Titulo.setText("Metodo: Componentes Rectangulares");

        javax.swing.GroupLayout Panel_TituloLayout = new javax.swing.GroupLayout(Panel_Titulo);
        Panel_Titulo.setLayout(Panel_TituloLayout);
        Panel_TituloLayout.setHorizontalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_TituloLayout.setVerticalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btn_Graficar.setBackground(new java.awt.Color(51, 51, 51));
        btn_Graficar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Graficar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Graficar.setText("Graficar");
        btn_Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GraficarActionPerformed(evt);
            }
        });

        Panel_Encabezado.setBackground(new java.awt.Color(51, 51, 51));

        label_Encabezado.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label_Encabezado.setForeground(new java.awt.Color(255, 255, 255));
        label_Encabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Panel_EncabezadoLayout = new javax.swing.GroupLayout(Panel_Encabezado);
        Panel_Encabezado.setLayout(Panel_EncabezadoLayout);
        Panel_EncabezadoLayout.setHorizontalGroup(
            Panel_EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_EncabezadoLayout.setVerticalGroup(
            Panel_EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_PrincipalLayout = new javax.swing.GroupLayout(Panel_Principal);
        Panel_Principal.setLayout(Panel_PrincipalLayout);
        Panel_PrincipalLayout.setHorizontalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_PrincipalLayout.createSequentialGroup()
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_PrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel_Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addGap(694, 694, 694)
                .addComponent(btn_Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_PrincipalLayout.setVerticalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addComponent(Panel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btn_Graficar)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GraficarActionPerformed
        // BOTON DE LA GRAFICA
    
    }//GEN-LAST:event_btn_GraficarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Encabezado;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel Panel_Resultado;
    private javax.swing.JPanel Panel_Titulo;
    private javax.swing.JButton btn_Graficar;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label_Encabezado;
    private javax.swing.JLabel label_Titulo;
    public javax.swing.JTextArea txtArea_Resultado;
    // End of variables declaration//GEN-END:variables

}
