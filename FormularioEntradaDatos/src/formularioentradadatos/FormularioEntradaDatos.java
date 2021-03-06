/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioentradadatos;
import comprobacion.*;
/**
 *
 * @author alumno
 */
public class FormularioEntradaDatos extends javax.swing.JFrame {

    /**
     * Creates new form FormularioEntradaDatos
     */
    public FormularioEntradaDatos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNIF = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldLetraNIF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDomicilio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldLocalidad = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldMovil = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldFax = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario");

        jLabel1.setText("Código");

        jLabel2.setText("N.I.F.");

        jLabel3.setText("Nombre");

        jTextFieldCodigo.setName("Codigo"); // NOI18N
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyPressed(evt);
            }
        });

        jTextFieldNIF.setName("NIF"); // NOI18N
        jTextFieldNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIFActionPerformed(evt);
            }
        });
        jTextFieldNIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNIFKeyPressed(evt);
            }
        });

        jTextFieldNombre.setName("Nombre"); // NOI18N
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
        });

        jTextFieldLetraNIF.setEditable(false);
        jTextFieldLetraNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLetraNIFActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellidos");

        jTextFieldApellidos.setName("Apellidos"); // NOI18N
        jTextFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidosActionPerformed(evt);
            }
        });
        jTextFieldApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldApellidosKeyPressed(evt);
            }
        });

        jLabel5.setText("Domicilio");

        jTextFieldDomicilio.setName("Domicilio"); // NOI18N
        jTextFieldDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDomicilioActionPerformed(evt);
            }
        });
        jTextFieldDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDomicilioKeyPressed(evt);
            }
        });

        jLabel6.setText("C.P.");

        jTextFieldCP.setName("CP"); // NOI18N
        jTextFieldCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPActionPerformed(evt);
            }
        });
        jTextFieldCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCPKeyPressed(evt);
            }
        });

        jLabel7.setText("Tel");

        jTextFieldTel.setName("Tel"); // NOI18N
        jTextFieldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelActionPerformed(evt);
            }
        });
        jTextFieldTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTelKeyPressed(evt);
            }
        });

        jLabel8.setText("Localidad");

        jTextFieldLocalidad.setName("Localidad"); // NOI18N
        jTextFieldLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLocalidadActionPerformed(evt);
            }
        });
        jTextFieldLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLocalidadKeyPressed(evt);
            }
        });

        jTextFieldEmail.setName("e-mail"); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabel9.setText("e-mail");

        jLabel10.setText("Móvil");

        jTextFieldMovil.setName("Movil"); // NOI18N
        jTextFieldMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMovilActionPerformed(evt);
            }
        });
        jTextFieldMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMovilKeyPressed(evt);
            }
        });

        jLabel11.setText("Fax");

        jTextFieldFax.setName("Fax"); // NOI18N
        jTextFieldFax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFaxActionPerformed(evt);
            }
        });
        jTextFieldFax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFaxKeyPressed(evt);
            }
        });

        jLabel12.setText("Total");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTotal.setText("0");
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jButtonAceptar.setMnemonic('a');
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setMnemonic('c');
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(85, 85, 85))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldMovil)
                                        .addGap(18, 18, 18))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(199, 199, 199))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFax)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel12)))
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonAceptar)
                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldLetraNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(114, 114, 114))
                                .addComponent(jTextFieldNombre))))
                    .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLetraNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIFActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldLetraNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLetraNIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLetraNIFActionPerformed

    private void jTextFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidosActionPerformed

    private void jTextFieldDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDomicilioActionPerformed

    private void jTextFieldCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPActionPerformed

    private void jTextFieldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelActionPerformed

    private void jTextFieldLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLocalidadActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMovilActionPerformed

    private void jTextFieldFaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFaxActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed
/*
 *  Define qué hacer cuando se presiona cancelar: debe vacíar todos los textos
 *  y llevar el foco al primer campo
 */
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // pone todos los textos a un string vacío
        setAll("");
        //lleva el foco al primer campo
        jTextFieldCodigo.grabFocus();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
/*
 * 
 *  Los textField llaman todos al método "siguiente" con su código tecleado
 *  y el siguiente textField como parámetros
 * 
 */
    private void jTextFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyPressed

        siguiente(evt.getKeyCode(),jTextFieldNIF);
        
    }//GEN-LAST:event_jTextFieldCodigoKeyPressed

    private void jTextFieldNIFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNIFKeyPressed
        
        siguiente(evt.getKeyCode(),jTextFieldNombre);
        
    }//GEN-LAST:event_jTextFieldNIFKeyPressed

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
        
        siguiente(evt.getKeyCode(),jTextFieldApellidos);
        
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jTextFieldApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidosKeyPressed
        
        siguiente(evt.getKeyCode(),jTextFieldDomicilio);
        
    }//GEN-LAST:event_jTextFieldApellidosKeyPressed

    private void jTextFieldDomicilioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDomicilioKeyPressed
        
        siguiente(evt.getKeyCode(),jTextFieldCP);
        
    }//GEN-LAST:event_jTextFieldDomicilioKeyPressed

    private void jTextFieldCPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCPKeyPressed
        siguiente(evt.getKeyCode(),jTextFieldLocalidad);
    }//GEN-LAST:event_jTextFieldCPKeyPressed

    private void jTextFieldLocalidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLocalidadKeyPressed
        siguiente(evt.getKeyCode(),jTextFieldTel);
    }//GEN-LAST:event_jTextFieldLocalidadKeyPressed

    private void jTextFieldTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelKeyPressed
        siguiente(evt.getKeyCode(),jTextFieldMovil);
    }//GEN-LAST:event_jTextFieldTelKeyPressed

    private void jTextFieldMovilKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMovilKeyPressed
        siguiente(evt.getKeyCode(),jTextFieldFax);
    }//GEN-LAST:event_jTextFieldMovilKeyPressed

    private void jTextFieldFaxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFaxKeyPressed
        siguiente(evt.getKeyCode(),jTextFieldEmail);
    }//GEN-LAST:event_jTextFieldFaxKeyPressed
    /**
     * función a realizar al apretar botón aceptar: debe validar todos los
     * campos y llamar una ventana nueva si son válidos,
     * si no son válidos llevará el foco al primer equivocado.
     * 
     */
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        //el campo código se verifica con sus condiciones particulares
        if(jTextFieldCodigo.getText().length()<=6 && jTextFieldCodigo.getText().matches("[0-9a-zA-Z]*")){
            while(jTextFieldCodigo.getText().length()<6){
                jTextFieldCodigo.setText("0".concat(jTextFieldCodigo.getText()));
            }
            if(comprobarTodo()){
                jTextFieldLetraNIF.setText(letraNIF(Integer.parseInt(jTextFieldNIF.getText())));
                javax.swing.JOptionPane.showConfirmDialog(null, "Formulario insertado correctamente", "Formulario correcto", 
                javax.swing.JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            noValida(jTextFieldCodigo);
        }
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioEntradaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEntradaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEntradaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEntradaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEntradaDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDomicilio;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFax;
    private javax.swing.JTextField jTextFieldLetraNIF;
    private javax.swing.JTextField jTextFieldLocalidad;
    private javax.swing.JTextField jTextFieldMovil;
    private javax.swing.JTextField jTextFieldNIF;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables

    //función para setear todos los TextFields del formulario al mismo valor
    //usada para el reinicio
    private void setAll(String string){
        jTextFieldNombre.setText(string);
        jTextFieldApellidos.setText(string);
        jTextFieldCP.setText(string);
        jTextFieldCodigo.setText(string);
        jTextFieldDomicilio.setText(string);
        jTextFieldEmail.setText(string);
        jTextFieldFax.setText(string);
        jTextFieldLetraNIF.setText(string);
        jTextFieldLocalidad.setText(string);
        jTextFieldMovil.setText(string);
        jTextFieldNIF.setText(string);
        jTextFieldNombre.setText(string);
        jTextFieldTel.setText(string);
        jTextFieldTotal.setText(string);
    }
    
    /**
     * función para avanzar al siguiente item del formulario al presionar
     * la tecla Intro
     * @param keyCode keyCode de la tecla presionada
     * @param next indica el siguiente elemento del formulario
     */
    private void siguiente(int keyCode,javax.swing.JTextField next){
        if(keyCode==10){
            next.grabFocus();
        }
    }
    
    private boolean comprobarTodo(){
        if (Comprobar.comprobarCampo("NIF",jTextFieldNIF.getText())){
            if(Comprobar.comprobarCampo("Nombre", jTextFieldNombre.getText())){
                if(Comprobar.comprobarCampo("Apellidos", jTextFieldApellidos.getText())){
                    if(Comprobar.comprobarCampo("Domicilio", jTextFieldDomicilio.getText())){
                        if(Comprobar.comprobarCampo("CP", jTextFieldCP.getText())){
                            if(Comprobar.comprobarCampo("Localidad", jTextFieldLocalidad.getText())){
                                if(Comprobar.comprobarCampo("Tel", jTextFieldTel.getText())){
                                    if(Comprobar.comprobarCampo("Tel", jTextFieldMovil.getText())){
                                        if(Comprobar.comprobarCampo("Tel", jTextFieldFax.getText())){
                                            if(Comprobar.comprobarCampo("Email", jTextFieldEmail.getText())){
                                                return true;
                                            }
                                            else{
                                                noValida(jTextFieldEmail);
                                                return false;
                                            }
                                        }
                                        else{
                                            noValida(jTextFieldFax);
                                            return false;
                                        }
                                    }
                                    else{
                                        noValida(jTextFieldMovil);
                                        return false;
                                    }
                                }
                                else{
                                    noValida(jTextFieldTel);
                                    return false;
                                }
                            }
                            else{
                                noValida(jTextFieldLocalidad);
                                return false;
                            }
                        }
                        else{
                            noValida(jTextFieldCP);
                            return false;
                        }
                    }
                    else{
                        noValida(jTextFieldDomicilio);
                        return false;
                    }
                }
                else{
                    noValida(jTextFieldApellidos);
                    return false;
                }
            }
            else{
                noValida(jTextFieldNombre);
                return false; 
            }
        }
        else{
            noValida(jTextFieldNIF);
            return false;
        }
    }
   
    private static void noValida(javax.swing.JTextField campo){
        String mensaje = "Hay un error en el campo " + campo.getName();
        javax.swing.JOptionPane.showConfirmDialog(null, mensaje, "Formulario incorrecto", 
                javax.swing.JOptionPane.PLAIN_MESSAGE);
        campo.grabFocus();
        campo.selectAll();
    }
    
    private static String letraNIF(Integer dni){
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = dni % 23;
        Character letra = juegoCaracteres.charAt(modulo);
        return letra.toString(); 
    }

}

