
package vista;

import javax.swing.JOptionPane;

public class Elemento2 extends javax.swing.JPanel {
      
    private ObtenerVectores obtenerVectores;
    
    public Elemento2() {
        initComponents();
        obtenerVectores = new ObtenerVectores();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Elemento2 = new javax.swing.JPanel();
        label_F1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_gradoF1 = new javax.swing.JLabel();
        txt_MagnitudCosF1 = new javax.swing.JTextField();
        txt_AnguloCosF1 = new javax.swing.JTextField();
        txt_MagnitudSenF1 = new javax.swing.JTextField();
        txt_MagnitudCosF2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_AnguloCosF2 = new javax.swing.JTextField();
        label_gradoF2 = new javax.swing.JLabel();
        masF1 = new javax.swing.JLabel();
        txt_MagnitudSenF2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_AnguloSenF2 = new javax.swing.JTextField();
        label_grado1F2 = new javax.swing.JLabel();
        label_grado2F2 = new javax.swing.JLabel();
        txt_AnguloSenF1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();

        Panel_Elemento2.setBackground(new java.awt.Color(51, 51, 51));

        label_F1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label_F1.setForeground(new java.awt.Color(255, 255, 255));
        label_F1.setText("F1 =");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("F2 =");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COS");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("+");

        label_gradoF1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label_gradoF1.setForeground(new java.awt.Color(255, 255, 255));
        label_gradoF1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_gradoF1.setText("°");

        txt_MagnitudCosF1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_MagnitudCosF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MagnitudCosF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MagnitudCosF1ActionPerformed(evt);
            }
        });
        txt_MagnitudCosF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_MagnitudCosF1KeyReleased(evt);
            }
        });

        txt_AnguloCosF1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_AnguloCosF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AnguloCosF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AnguloCosF1ActionPerformed(evt);
            }
        });
        txt_AnguloCosF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_AnguloCosF1KeyReleased(evt);
            }
        });

        txt_MagnitudSenF1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_MagnitudSenF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MagnitudSenF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MagnitudSenF1ActionPerformed(evt);
            }
        });
        txt_MagnitudSenF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_MagnitudSenF1KeyReleased(evt);
            }
        });

        txt_MagnitudCosF2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_MagnitudCosF2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_MagnitudCosF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MagnitudCosF2ActionPerformed(evt);
            }
        });
        txt_MagnitudCosF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_MagnitudCosF2KeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("COS");

        txt_AnguloCosF2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_AnguloCosF2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AnguloCosF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_AnguloCosF2KeyReleased(evt);
            }
        });

        label_gradoF2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label_gradoF2.setForeground(new java.awt.Color(255, 255, 255));
        label_gradoF2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_gradoF2.setText("°");

        masF1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        masF1.setForeground(new java.awt.Color(255, 255, 255));
        masF1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masF1.setText("+");

        txt_MagnitudSenF2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_MagnitudSenF2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SEN");

        txt_AnguloSenF2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_AnguloSenF2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        label_grado1F2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label_grado1F2.setForeground(new java.awt.Color(255, 255, 255));
        label_grado1F2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_grado1F2.setText("°");

        label_grado2F2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label_grado2F2.setForeground(new java.awt.Color(255, 255, 255));
        label_grado2F2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_grado2F2.setText("°");

        txt_AnguloSenF1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_AnguloSenF1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AnguloSenF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AnguloSenF1ActionPerformed(evt);
            }
        });
        txt_AnguloSenF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_AnguloSenF1KeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("SEN");

        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_calcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Elemento2Layout = new javax.swing.GroupLayout(Panel_Elemento2);
        Panel_Elemento2.setLayout(Panel_Elemento2Layout);
        Panel_Elemento2Layout.setHorizontalGroup(
            Panel_Elemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Elemento2Layout.createSequentialGroup()
                .addGroup(Panel_Elemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_Elemento2Layout.createSequentialGroup()
                        .addGap(630, 630, 630)
                        .addComponent(btn_limpiar))
                    .addGroup(Panel_Elemento2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label_F1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_MagnitudCosF1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txt_AnguloCosF1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(label_gradoF1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(masF1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_MagnitudSenF1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt_AnguloSenF1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_grado1F2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_Elemento2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(Panel_Elemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_calcular, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_Elemento2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_MagnitudCosF2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_AnguloCosF2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(label_gradoF2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txt_MagnitudSenF2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txt_AnguloSenF2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_grado2F2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        Panel_Elemento2Layout.setVerticalGroup(
            Panel_Elemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Elemento2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_limpiar)
                .addGap(32, 32, 32)
                .addGroup(Panel_Elemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_MagnitudCosF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AnguloCosF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MagnitudSenF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AnguloSenF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_Elemento2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(Panel_Elemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_F1)
                            .addComponent(jLabel3)
                            .addComponent(label_gradoF1)
                            .addComponent(masF1)
                            .addComponent(jLabel14)
                            .addComponent(label_grado1F2))))
                .addGap(42, 42, 42)
                .addGroup(Panel_Elemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_MagnitudCosF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AnguloCosF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MagnitudSenF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_AnguloSenF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_Elemento2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(Panel_Elemento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(label_gradoF2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(label_grado2F2))))
                .addGap(85, 85, 85)
                .addComponent(btn_calcular)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Elemento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Elemento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_MagnitudCosF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MagnitudCosF1ActionPerformed
    }//GEN-LAST:event_txt_MagnitudCosF1ActionPerformed

    private void txt_MagnitudCosF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MagnitudCosF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MagnitudCosF2ActionPerformed

    private void txt_MagnitudCosF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MagnitudCosF1KeyReleased
        // CAMPO CON EL EVENTO IMPLEMENTADO
        //Obtenner valores
        String magnitudCOS_F1 = txt_MagnitudCosF1.getText();
        //Duplicar valores
        txt_MagnitudSenF1.setText(magnitudCOS_F1);
      
    }//GEN-LAST:event_txt_MagnitudCosF1KeyReleased

    private void txt_AnguloSenF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AnguloSenF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AnguloSenF1ActionPerformed

    private void txt_MagnitudSenF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MagnitudSenF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MagnitudSenF1ActionPerformed

    private void txt_AnguloCosF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AnguloCosF1ActionPerformed
       
    }//GEN-LAST:event_txt_AnguloCosF1ActionPerformed

    private void txt_AnguloSenF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AnguloSenF1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AnguloSenF1KeyReleased

    private void txt_MagnitudSenF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MagnitudSenF1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MagnitudSenF1KeyReleased

    private void txt_AnguloCosF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AnguloCosF1KeyReleased
        //CAMPO DE CON EL EVENTO ASIGNADO
        
        //Obtenner valores
        String anguloCOS_F1 = txt_AnguloCosF1.getText();
        //Duplicar valores
        txt_AnguloSenF1.setText(anguloCOS_F1);
        
        
    }//GEN-LAST:event_txt_AnguloCosF1KeyReleased

    private void txt_MagnitudCosF2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_MagnitudCosF2KeyReleased
       //CAMPO F2 CON EL EVENTO IMPLEMENTADO
       //Obtenner valores
        String magnitudCOS_F2 = txt_MagnitudCosF2.getText();
        //Duplicar valores
        txt_MagnitudSenF2.setText(magnitudCOS_F2);
    }//GEN-LAST:event_txt_MagnitudCosF2KeyReleased

    private void txt_AnguloCosF2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_AnguloCosF2KeyReleased
        //CAMPOS F2 CON EL EVENTO ASIGNADO:
         //Obtenner valores
        String anguloCOS_F2 = txt_AnguloCosF2.getText();
        //Duplicar valores
        txt_AnguloSenF2.setText(anguloCOS_F2);
    }//GEN-LAST:event_txt_AnguloCosF2KeyReleased

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
    try{
        
          // PASAR DATOS PARA GRAFICACION
             double angulo1 = Double.parseDouble(txt_AnguloCosF1.getText());
            double angulo2 = Double.parseDouble(txt_AnguloCosF2.getText());
            double[] angulos = { angulo1, angulo2 };

            // Obtener una instancia de Resultado
            Resultado resultadoFrame = new Resultado();
            resultadoFrame.recibirAngulos(angulos);
            resultadoFrame.setVisible(true); // Mostrar el marco Resultado 

            // Obten los valores de magnitudes y ángulos de F1 y F2
            double magnitudF1 = Double.parseDouble(txt_MagnitudCosF1.getText());
            double anguloF1 = Double.parseDouble(txt_AnguloCosF1.getText());
            double magnitudF2 = Double.parseDouble(txt_MagnitudCosF2.getText());
            double anguloF2 = Double.parseDouble(txt_AnguloCosF2.getText());
            // Calcula la resultante y el ángulo
            double resultante = calcularResultante(magnitudF1, anguloF1, magnitudF2, anguloF2);
            double anguloResultante = calcularAnguloResultante(anguloF1, anguloF2, magnitudF1, magnitudF2);

            // Genera la explicación detallada
            String explicacion = generarExplicacion(magnitudF1, anguloF1, magnitudF2, anguloF2);

            //GENERAR PANEL RESULTADO
            resultadoFrame.label_Encabezado.setText("Resultante = " + resultante + "                        Angulo = " + anguloResultante);
            resultadoFrame.txtArea_Resultado.setText(explicacion);
            resultadoFrame.setVisible(true);
            
     
            
        } catch (DatosIncompletosException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Datos Incompletos", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numericos válidos.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    


    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // BOTON LIMPIAR
        txt_AnguloCosF1.setText("");
        txt_AnguloCosF2.setText("");
        txt_AnguloSenF1.setText("");
        txt_AnguloSenF2.setText("");
        txt_MagnitudCosF1.setText("");
        txt_MagnitudCosF2.setText("");
        txt_MagnitudSenF1.setText("");
        txt_MagnitudSenF2.setText("");

    }//GEN-LAST:event_btn_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Elemento2;
    public javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel label_F1;
    private javax.swing.JLabel label_grado1F2;
    private javax.swing.JLabel label_grado2F2;
    private javax.swing.JLabel label_gradoF1;
    private javax.swing.JLabel label_gradoF2;
    private javax.swing.JLabel masF1;
    public javax.swing.JTextField txt_AnguloCosF1;
    public javax.swing.JTextField txt_AnguloCosF2;
    public javax.swing.JTextField txt_AnguloSenF1;
    public javax.swing.JTextField txt_AnguloSenF2;
    public javax.swing.JTextField txt_MagnitudCosF1;
    public javax.swing.JTextField txt_MagnitudCosF2;
    public javax.swing.JTextField txt_MagnitudSenF1;
    public javax.swing.JTextField txt_MagnitudSenF2;
    // End of variables declaration//GEN-END:variables

    //IMPLEMENTACION DE METODOS
   private double calcularResultante(double magnitudF1, double anguloF1, double magnitudF2, double anguloF2) {
    double resultado = Math.sqrt(Math.pow(magnitudF1 * Math.cos(Math.toRadians(anguloF1)) + magnitudF2 * Math.cos(Math.toRadians(anguloF2)), 2)
            + Math.pow(magnitudF1 * Math.sin(Math.toRadians(anguloF1)) + magnitudF2 * Math.sin(Math.toRadians(anguloF2)), 2));
   
    String redondeo = String.format("%.2f", resultado);
        double resultante = Double.parseDouble(redondeo);
        
    return resultante;
}
   
   private String generarExplicacion(double magnitudF1, double anguloF1, double magnitudF2, double anguloF2) {
    StringBuilder explicacion = new StringBuilder("                                                                                             Procedimiento para calcular la resultante y el angulo:\n\n");

    // Paso 1: Obtener los valores de magnitudes y ángulos de F1 y F2
    explicacion.append("Paso 1: Obtener los valores de magnitudes y ángulos de F1 y F2.\n");
    explicacion.append(" \n - Magnitud de F1: ").append(magnitudF1).append("\n");
    explicacion.append("  - Ángulo de F1: ").append(anguloF1).append(" grados\n");
    explicacion.append("  - Magnitud de F2: ").append(magnitudF2).append("\n");
    explicacion.append("  - Ángulo de F2: ").append(anguloF2).append(" grados\n\n");

    // Paso 2: Separamos las fuerzas en sus componentes X y Y
    double componenteX_F1 = magnitudF1 * Math.cos(Math.toRadians(anguloF1));
    double componenteY_F1 = magnitudF1 * Math.sin(Math.toRadians(anguloF1));
    double componenteX_F2 = magnitudF2 * Math.cos(Math.toRadians(anguloF2));
    double componenteY_F2 = magnitudF2 * Math.sin(Math.toRadians(anguloF2));
    
    
    explicacion.append("Paso 2: Separamos las fuerzas en sus componentes X y Y.\n");
        explicacion.append("  \n- F1 (Componente X): ").append(magnitudF1).append(" * cos\n");
    explicacion.append("  - F2 (Componente X): ").append(magnitudF2).append(" * cos\n\n");
    explicacion.append("  - F1 (Componente Y): ").append(magnitudF1).append(" * sin\n");
    explicacion.append("  - F2 (Componente Y): ").append(magnitudF2).append(" * sin\n\n");

    // Paso 3: Multiplicamos las magnitudes y los ángulos por sus componentes X y Y
    explicacion.append("Paso 3: Multiplicamos las magnitudes y los angulos por sus componentes X (coseno) y Y (seno).\n");
    explicacion.append("  \n- F1 (Componente X): ").append(magnitudF1).append(" * cos(").append(anguloF1).append(") = ").append(componenteX_F1).append("\n");
    explicacion.append("  - F2 (Componente X): ").append(magnitudF2).append(" * cos(").append(anguloF2).append(") = ").append(componenteX_F2).append("\n\n");
    explicacion.append("  - F1 (Componente Y): ").append(magnitudF1).append(" * sin(").append(anguloF1).append(") = ").append(componenteY_F1).append("\n");
    explicacion.append("  - F2 (Componente Y): ").append(magnitudF2).append(" * sin(").append(anguloF2).append(") = ").append(componenteY_F2).append("\n\n");

    // Paso 4: Se suman los componentes X y los componentes Y
    double componenteXTotal = componenteX_F1 + componenteX_F2;
    double componenteYTotal = componenteY_F1 + componenteY_F2;
    explicacion.append("Paso 4: Se suman los componentes X y los componentes Y.\n");
    explicacion.append("  \n- Total Componente X:  (").append(componenteX_F1).append(" + ").append(componenteX_F2).append(" ) = ").append(componenteXTotal).append("\n\n");
    explicacion.append("  - Total Componente Y: (").append(componenteY_F1).append(" + ").append(componenteY_F2).append(") = ").append(componenteYTotal).append("\n\n");

    // Paso 5: Se implementa el teorema de Pitagoras 
    double resultado = Math.sqrt(Math.pow(componenteXTotal, 2) + Math.pow(componenteYTotal, 2));

    explicacion.append("Paso 5: Aplicacion  del teorema de Pitagoras usando los valores de la suma de los componentes X y Y.\n");
    explicacion.append("  \n- Componente X al cuadrado: ").append(Double.toString(Math.pow(componenteXTotal, 2))).append("\n");
    explicacion.append("  - Componente Y al cuadrado: ").append(Double.toString(Math.pow(componenteYTotal, 2))).append("\n");
    explicacion.append("  - Suma de los cuadrados: ").append(Double.toString(Math.pow(componenteXTotal, 2) + Math.pow(componenteYTotal, 2))).append("\n");
    explicacion.append("  - Aplicamos raiz cuadrada: ").append(Double.toString(resultado)).append("\n\n");

    // Paso 6: Calcular y mostrar el angulo de la resultante
    explicacion.append("Paso 6: Calcular y mostrar el angulo de la resultante.\n");

    double anguloRadianes = Math.atan2(componenteYTotal, componenteXTotal);

    explicacion.append("  \n- El angulo de la resultante se calcula utilizando la función de arco tangente: θ = atan(Ry / Rx)\n");
    explicacion.append("    Ry = ").append(componenteYTotal).append("\n");
    explicacion.append("    Rx = ").append(componenteXTotal).append("\n");

    double anguloGrados = Math.toDegrees(anguloRadianes);
    explicacion.append("  \n-θ = atan(").append(componenteYTotal).append(" / ").append(componenteXTotal).append(") = ").append(anguloGrados).append(" grados.\n\n");
    explicacion.append("  -El ángulo de la resultante = ").append(anguloGrados).append(" grados.\n\n");
    explicacion.append("Resultado final: ").append(resultado).append("\n");
    
    
    return explicacion.toString();
    }
   
   private double calcularAnguloResultante(double anguloF1, double anguloF2, double magnitudF1, double magnitudF2) {
    // Calcula las componentes X e Y de cada fuerza
    double componenteX_F1 = magnitudF1 * Math.cos(Math.toRadians(anguloF1));
    double componenteY_F1 = magnitudF1 * Math.sin(Math.toRadians(anguloF1));
    double componenteX_F2 = magnitudF2 * Math.cos(Math.toRadians(anguloF2));
    double componenteY_F2 = magnitudF2 * Math.sin(Math.toRadians(anguloF2));

    // Suma las componentes X y Y
    double componenteXTotal = componenteX_F1 + componenteX_F2;
    double componenteYTotal = componenteY_F1 + componenteY_F2;

    // Calcula el angulo en radianes
    double anguloRadianes = Math.atan2(componenteYTotal, componenteXTotal);

    // Convierte el angulo de radianes a grados
    double anguloGrados = Math.toDegrees(anguloRadianes);

       String redondeo = String.format("%.2f", anguloGrados);
        double angulo = Double.parseDouble(redondeo);

        return angulo;
}

   public class DatosIncompletosException extends RuntimeException {
    public DatosIncompletosException(String message) {
        super(message);
    }
}


    
}
