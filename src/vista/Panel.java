
package vista;
import java.awt.BorderLayout;

public class Panel extends javax.swing.JFrame {

    public Panel() {
    
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);   
        
          //Creamos un metodo para poder cambiar de Panels dentro de JFrame
        Elemento2 panel2 = new Elemento2();
        panel2.setSize(798, 510);
        panel2.setLocation(0, 0);
        Panel_Contenido.removeAll();
        Panel_Contenido.add(panel2, BorderLayout.CENTER);
        Panel_Contenido.revalidate();
        Panel_Contenido.repaint();
        
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Principal = new javax.swing.JPanel();
        Panel_Titulo = new javax.swing.JPanel();
        label_Titulo = new javax.swing.JLabel();
        label_Nfuerzas = new javax.swing.JLabel();
        ComboBox_Numero_Fuerzas = new javax.swing.JComboBox<>();
        btn_generar = new javax.swing.JButton();
        Panel_Contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Principal.setBackground(new java.awt.Color(0, 102, 102));

        Panel_Titulo.setBackground(new java.awt.Color(0, 51, 51));

        label_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Titulo.setText("StaticLAB");

        javax.swing.GroupLayout Panel_TituloLayout = new javax.swing.GroupLayout(Panel_Titulo);
        Panel_Titulo.setLayout(Panel_TituloLayout);
        Panel_TituloLayout.setHorizontalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_TituloLayout.setVerticalGroup(
            Panel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        label_Nfuerzas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_Nfuerzas.setForeground(new java.awt.Color(255, 255, 255));
        label_Nfuerzas.setText("Numero de fuerzas: ");

        ComboBox_Numero_Fuerzas.setBackground(new java.awt.Color(51, 51, 51));
        ComboBox_Numero_Fuerzas.setForeground(new java.awt.Color(255, 255, 255));
        ComboBox_Numero_Fuerzas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));

        btn_generar.setBackground(new java.awt.Color(51, 51, 51));
        btn_generar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_generar.setForeground(new java.awt.Color(255, 255, 255));
        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        Panel_Contenido.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout Panel_ContenidoLayout = new javax.swing.GroupLayout(Panel_Contenido);
        Panel_Contenido.setLayout(Panel_ContenidoLayout);
        Panel_ContenidoLayout.setHorizontalGroup(
            Panel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        Panel_ContenidoLayout.setVerticalGroup(
            Panel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel_PrincipalLayout = new javax.swing.GroupLayout(Panel_Principal);
        Panel_Principal.setLayout(Panel_PrincipalLayout);
        Panel_PrincipalLayout.setHorizontalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(label_Nfuerzas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_Numero_Fuerzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_generar))
                    .addComponent(Panel_Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        Panel_PrincipalLayout.setVerticalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addComponent(Panel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Nfuerzas)
                    .addComponent(ComboBox_Numero_Fuerzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generar))
                .addGap(18, 18, 18)
                .addComponent(Panel_Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
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

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // CODIGO DEL BOTON GENERAR 
        
        int numeroFuerzas = Integer.parseInt(ComboBox_Numero_Fuerzas.getSelectedItem().toString());

         switch (numeroFuerzas) {
        case 2:
           fuerza2();
         
            break;
        case 3:
            fuerza3();
            
            break;
        case 4:
            fuerza4();
            
            break;
        case 5:
            fuerza5();
            

            break;
        default:
            
            
            break;
    }
   
    }//GEN-LAST:event_btn_generarActionPerformed

  
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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_Numero_Fuerzas;
    private javax.swing.JPanel Panel_Contenido;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPanel Panel_Titulo;
    private javax.swing.JButton btn_generar;
    private javax.swing.JLabel label_Nfuerzas;
    private javax.swing.JLabel label_Titulo;
    // End of variables declaration//GEN-END:variables

    
    //DECLARACION DE LAS FUNCIONES A IMPLEMENTAR
    public void fuerza2(){
            Elemento2 panel2 = new Elemento2();
            panel2.setSize(798, 510);
            panel2.setLocation(0, 0);
            Panel_Contenido.removeAll();
            Panel_Contenido.add(panel2, BorderLayout.CENTER);
            Panel_Contenido.revalidate();
            Panel_Contenido.repaint();
    }
    public void fuerza3(){
            Elemento3 panel3 = new Elemento3();
            panel3.setSize(798, 510);
            panel3.setLocation(0, 0);
            Panel_Contenido.removeAll();
            Panel_Contenido.add(panel3, BorderLayout.CENTER);
            Panel_Contenido.revalidate();
            Panel_Contenido.repaint();
    }

    public void fuerza4(){
            Elemento4 panel4 = new Elemento4();
            panel4.setSize(798, 510);
            panel4.setLocation(0, 0);
            Panel_Contenido.removeAll();
            Panel_Contenido.add(panel4, BorderLayout.CENTER);
            Panel_Contenido.revalidate();
            Panel_Contenido.repaint();
    }
public void fuerza5(){
            Elemento5 panel5 = new Elemento5();
            panel5.setSize(798, 510);
            panel5.setLocation(0, 0);
            Panel_Contenido.removeAll();
            Panel_Contenido.add(panel5, BorderLayout.CENTER);
            Panel_Contenido.revalidate();
            Panel_Contenido.repaint();
    }


}



