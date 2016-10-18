/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaDeOrdenadores;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class VentaDeOrdenadores extends javax.swing.JFrame {

    /**
     * Creates new form VentaDeOrdenadores
     */
    public VentaDeOrdenadores() {
        initComponents();
        jTextFieldNombre.grabFocus();
        ventas = new ArrayList<Venta>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupProc = new javax.swing.ButtonGroup();
        buttonGroupMem = new javax.swing.ButtonGroup();
        buttonGroupDisc = new javax.swing.ButtonGroup();
        buttonGroupGraf = new javax.swing.ButtonGroup();
        jRadioButtonPr0 = new javax.swing.JRadioButton();
        jRadioButtonPr1 = new javax.swing.JRadioButton();
        jRadioButtonPr2 = new javax.swing.JRadioButton();
        jRadioButtonPr3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonMem0 = new javax.swing.JRadioButton();
        jRadioButtonMem1 = new javax.swing.JRadioButton();
        jRadioButtonMem2 = new javax.swing.JRadioButton();
        jRadioButtonMem3 = new javax.swing.JRadioButton();
        jRadioButtonGra0 = new javax.swing.JRadioButton();
        jRadioButtonGra1 = new javax.swing.JRadioButton();
        jRadioButtonGra2 = new javax.swing.JRadioButton();
        jRadioButtonGra3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonDisc0 = new javax.swing.JRadioButton();
        jRadioButtonDisc1 = new javax.swing.JRadioButton();
        jRadioButtonDisc2 = new javax.swing.JRadioButton();
        jRadioButtonDisc3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxOp0 = new javax.swing.JCheckBox();
        jCheckBoxOp1 = new javax.swing.JCheckBox();
        jCheckBoxOp2 = new javax.swing.JCheckBox();
        jCheckBoxOp3 = new javax.swing.JCheckBox();
        jButtonAdd = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxLocal = new javax.swing.JComboBox();
        jTextFieldNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListResult = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Venta de Ordenadores");
        setMinimumSize(new java.awt.Dimension(750, 410));
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroupProc.add(jRadioButtonPr0);
        jRadioButtonPr0.setText("Intel i7-6700K");
        jRadioButtonPr0.setActionCommand("0");
        jRadioButtonPr0.setEnabled(false);
        jRadioButtonPr0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPr0ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonPr0, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 206, -1, -1));

        buttonGroupProc.add(jRadioButtonPr1);
        jRadioButtonPr1.setText("Intel i5-6600K");
        jRadioButtonPr1.setActionCommand("1");
        jRadioButtonPr1.setEnabled(false);
        getContentPane().add(jRadioButtonPr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 233, -1, -1));

        buttonGroupProc.add(jRadioButtonPr2);
        jRadioButtonPr2.setText("AMD AD7300");
        jRadioButtonPr2.setActionCommand("2");
        jRadioButtonPr2.setEnabled(false);
        getContentPane().add(jRadioButtonPr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 260, -1, -1));

        buttonGroupProc.add(jRadioButtonPr3);
        jRadioButtonPr3.setText("AMD A4- 3400");
        jRadioButtonPr3.setActionCommand("3");
        jRadioButtonPr3.setEnabled(false);
        getContentPane().add(jRadioButtonPr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 287, -1, -1));

        jLabel1.setText("Procesador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 183, -1, -1));

        jLabel2.setText("Memoria");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 183, -1, -1));

        buttonGroupMem.add(jRadioButtonMem0);
        jRadioButtonMem0.setText("4.0 Gb");
        jRadioButtonMem0.setActionCommand("0");
        jRadioButtonMem0.setEnabled(false);
        getContentPane().add(jRadioButtonMem0, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 206, -1, -1));

        buttonGroupMem.add(jRadioButtonMem1);
        jRadioButtonMem1.setText("8.0 Gb");
        jRadioButtonMem1.setActionCommand("1");
        jRadioButtonMem1.setEnabled(false);
        getContentPane().add(jRadioButtonMem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 233, -1, -1));

        buttonGroupMem.add(jRadioButtonMem2);
        jRadioButtonMem2.setText("16.0 Gb");
        jRadioButtonMem2.setActionCommand("2");
        jRadioButtonMem2.setEnabled(false);
        getContentPane().add(jRadioButtonMem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 260, -1, -1));

        buttonGroupMem.add(jRadioButtonMem3);
        jRadioButtonMem3.setText("32.0 Gb");
        jRadioButtonMem3.setActionCommand("3");
        jRadioButtonMem3.setEnabled(false);
        getContentPane().add(jRadioButtonMem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 287, -1, -1));

        buttonGroupGraf.add(jRadioButtonGra0);
        jRadioButtonGra0.setText("AMD Radeon R9");
        jRadioButtonGra0.setActionCommand("0");
        jRadioButtonGra0.setEnabled(false);
        jRadioButtonGra0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGra0ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonGra0, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 206, -1, -1));

        buttonGroupGraf.add(jRadioButtonGra1);
        jRadioButtonGra1.setText("AMD Radeon R7");
        jRadioButtonGra1.setActionCommand("1");
        jRadioButtonGra1.setEnabled(false);
        getContentPane().add(jRadioButtonGra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 233, -1, -1));

        buttonGroupGraf.add(jRadioButtonGra2);
        jRadioButtonGra2.setText("Nvidia GTX 1080");
        jRadioButtonGra2.setActionCommand("2");
        jRadioButtonGra2.setEnabled(false);
        getContentPane().add(jRadioButtonGra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 140, -1));

        buttonGroupGraf.add(jRadioButtonGra3);
        jRadioButtonGra3.setText("Nvidia Titan");
        jRadioButtonGra3.setActionCommand("3");
        jRadioButtonGra3.setEnabled(false);
        getContentPane().add(jRadioButtonGra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 290, 110, -1));

        jLabel3.setText("Gráfica");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 183, -1, -1));

        jLabel4.setText("Disco Duro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 183, -1, -1));

        buttonGroupDisc.add(jRadioButtonDisc0);
        jRadioButtonDisc0.setText("650 GB");
        jRadioButtonDisc0.setActionCommand("0");
        jRadioButtonDisc0.setEnabled(false);
        jRadioButtonDisc0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDisc0ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonDisc0, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 206, -1, -1));

        buttonGroupDisc.add(jRadioButtonDisc1);
        jRadioButtonDisc1.setText("1 TB");
        jRadioButtonDisc1.setActionCommand("1");
        jRadioButtonDisc1.setEnabled(false);
        getContentPane().add(jRadioButtonDisc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 233, -1, -1));

        buttonGroupDisc.add(jRadioButtonDisc2);
        jRadioButtonDisc2.setText("3 TB");
        jRadioButtonDisc2.setActionCommand("2");
        jRadioButtonDisc2.setEnabled(false);
        getContentPane().add(jRadioButtonDisc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 260, -1, -1));

        buttonGroupDisc.add(jRadioButtonDisc3);
        jRadioButtonDisc3.setText("10 TB");
        jRadioButtonDisc3.setActionCommand("3");
        jRadioButtonDisc3.setEnabled(false);
        getContentPane().add(jRadioButtonDisc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 287, -1, -1));

        jLabel5.setText("Opciones:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 183, -1, -1));

        jCheckBoxOp0.setText("Grabadora DVD");
        jCheckBoxOp0.setEnabled(false);
        jCheckBoxOp0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxOp0ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxOp0, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 206, -1, -1));

        jCheckBoxOp1.setText("Wifi");
        jCheckBoxOp1.setEnabled(false);
        getContentPane().add(jCheckBoxOp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 233, -1, -1));

        jCheckBoxOp2.setText("Sintonizador TV");
        jCheckBoxOp2.setEnabled(false);
        getContentPane().add(jCheckBoxOp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 260, -1, -1));

        jCheckBoxOp3.setText("Backup/Restore");
        jCheckBoxOp3.setEnabled(false);
        getContentPane().add(jCheckBoxOp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 283, -1, -1));

        jButtonAdd.setMnemonic('a');
        jButtonAdd.setText("Añadir");
        jButtonAdd.setEnabled(false);
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 344, 90, 30));

        jButtonBuscar.setMnemonic('b');
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setEnabled(false);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 344, 90, 30));

        jButtonEliminar.setMnemonic('e');
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 344, 100, 30));

        jButtonSalir.setMnemonic('s');
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 349, 100, -1));

        jButtonCancel.setMnemonic('c');
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 318, 100, -1));

        jLabel6.setText("Nombre del cliente:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 41, -1, -1));

        jLabel7.setText("Localidad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 112, -1, -1));

        jComboBoxLocal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Villalba", "Alpedrete", "Galapagar", "Guadarrama", "Moralzarzal" }));
        jComboBoxLocal.setEnabled(false);
        getContentPane().add(jComboBoxLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 107, -1, -1));

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 62, 285, 27));

        jListResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListResultMouseClicked(evt);
            }
        });
        jListResult.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jListResultFocusGained(evt);
            }
        });
        jListResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jListResultKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListResult);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 41, 376, 130));

        jLabel8.setText("Lista de clientes:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 14, -1, -1));

        jButton1.setMnemonic('m');
        jButton1.setText("Mostrar Ventas");
        jButton1.setActionCommand("Mostrar Ventas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 160, 30));

        jButton2.setMnemonic('g');
        jButton2.setText("Guardar Ventas");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 170, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonPr0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPr0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPr0ActionPerformed

    private void jRadioButtonDisc0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDisc0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDisc0ActionPerformed

    private void jRadioButtonGra0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGra0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonGra0ActionPerformed

    private void jCheckBoxOp0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxOp0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxOp0ActionPerformed

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
        
        if(evt.getKeyCode()==10){
            if(jTextFieldNombre.getText().matches("[A-Za-zñÑºªáéíóúÁÉÍÓÚ\\s]+")){
                iniciar();
                jButtonEliminar.setEnabled(false);
                jComboBoxLocal.grabFocus();
            }
            else{
                javax.swing.JOptionPane.showConfirmDialog(null, "nombre inválido", "Formulario incorrecto", 
                    javax.swing.JOptionPane.PLAIN_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        if(ventas.size()>0){
            if(javax.swing.JOptionPane.showConfirmDialog(null, "Tiene cambios sin guardar, ¿desea guardarlos?"
                    ,"Advertencia", javax.swing.JOptionPane.OK_OPTION)==0){
                guardar();
            }
        }
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        anadir();
        Vector<String> aux = new Vector();
        for(int i =0; i<ventas.size();i++){
            aux.add(ventas.get(i).getNombre());
        }
        jListResult.setListData(aux);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        cancelar();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jListResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListResultMouseClicked
        if(ventas.size()>0)
            seleccionarVenta(jListResult.getAnchorSelectionIndex());
    }//GEN-LAST:event_jListResultMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        eliminar(jListResult.getAnchorSelectionIndex());
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        buscar(0,jTextFieldNombre.getText());
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jListResultKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListResultKeyReleased
        if(ventas.size()>0)
            seleccionarVenta(jListResult.getAnchorSelectionIndex());
    }//GEN-LAST:event_jListResultKeyReleased

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        jButtonEliminar.setEnabled(false);
        jTextFieldNombre.setEnabled(true);
    }//GEN-LAST:event_formFocusLost

    private void jListResultFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListResultFocusGained
        
        jTextFieldNombre.setEnabled(false);
    }//GEN-LAST:event_jListResultFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentaDeOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaDeOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaDeOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaDeOrdenadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaDeOrdenadores().setVisible(true);
            }
        });
    }
 public void botonera(boolean state){
        jRadioButtonDisc0.setEnabled(state);
        jRadioButtonDisc1.setEnabled(state);
        jRadioButtonDisc2.setEnabled(state);
        jRadioButtonDisc3.setEnabled(state);
        jRadioButtonGra0.setEnabled(state);
        jRadioButtonGra1.setEnabled(state);
        jRadioButtonGra2.setEnabled(state);
        jRadioButtonGra3.setEnabled(state);
        jRadioButtonMem0.setEnabled(state);
        jRadioButtonMem1.setEnabled(state);
        jRadioButtonMem2.setEnabled(state);
        jRadioButtonMem3.setEnabled(state);
        jRadioButtonPr0.setEnabled(state);
        jRadioButtonPr1.setEnabled(state);
        jRadioButtonPr2.setEnabled(state);
        jRadioButtonPr3.setEnabled(state);
        jCheckBoxOp0.setEnabled(state);
        jCheckBoxOp1.setEnabled(state);
        jCheckBoxOp2.setEnabled(state);
        jCheckBoxOp3.setEnabled(state);
    }
    
    public void confBasica(){
        jRadioButtonDisc1.setSelected(true);
        jRadioButtonMem3.setSelected(true);
        jRadioButtonGra0.setSelected(true);
        jRadioButtonPr0.setSelected(true);
        jCheckBoxOp0.setSelected(true);
        jCheckBoxOp1.setSelected(false);
        jCheckBoxOp2.setSelected(true);
        jCheckBoxOp3.setSelected(false);
        jComboBoxLocal.setSelectedIndex(0);
    }
    
    public void iniciar(){
        
        botonera(true);
        confBasica();
        jTextFieldNombre.setEnabled(false);
        jComboBoxLocal.setEnabled(true);
        jButtonAdd.setEnabled(true);
        jButtonBuscar.setEnabled(true);
        jListResult.repaint();
        
    }
    
    public void cancelar(){
        botonera(false);
        jComboBoxLocal.setEnabled(false);
        jButtonAdd.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        jButtonEliminar.setEnabled(false);
        jTextFieldNombre.setEnabled(true);
        jTextFieldNombre.grabFocus();
        jTextFieldNombre.setText("");
    }
    
    public void anadir(){
        Venta venta = new Venta();
        String nombre = jTextFieldNombre.getText();
        int local = jComboBoxLocal.getSelectedIndex();
        int pr = 0, mem = 0, disc = 0, gra = 0;
        
        pr = Integer.parseInt(buttonGroupProc.getSelection().getActionCommand());
        mem = Integer.parseInt(buttonGroupMem.getSelection().getActionCommand());
        disc = Integer.parseInt(buttonGroupDisc.getSelection().getActionCommand());
        gra = Integer.parseInt(buttonGroupGraf.getSelection().getActionCommand());
        
                
        boolean[] checks = {jCheckBoxOp0.isSelected(),jCheckBoxOp1.isSelected(),jCheckBoxOp2.isSelected(),jCheckBoxOp3.isSelected()};
        
        venta.setNombre(nombre);
        venta.setChecks(checks);
        int[] opciones = {pr,mem,disc,gra};
        venta.setOpciones(opciones);
        venta.setLocalidad(local);
        
        ventas.add(venta);
        cancelar();
        
    }
    
    public void seleccionarVenta(int index){
        jTextFieldNombre.setText(ventas.get(index).getNombre());
        jComboBoxLocal.setSelectedIndex(ventas.get(index).getLocalidad());
        jComboBoxLocal.setEnabled(true);
        Enumeration<AbstractButton> aux;
        for(int i = 0; i< ventas.get(index).getOpciones().length; i++){
            switch(i){
                case 0:
                    aux = buttonGroupProc.getElements();
                    for(int j = 0; j <= ventas.get(index).getOpciones(0);j++)
                        aux.nextElement().setSelected(true);
                    break;
                case 1:
                    aux = buttonGroupMem.getElements();
                    for(int j = 0; j <= ventas.get(index).getOpciones(1);j++)
                        aux.nextElement().setSelected(true);
                    break;
                case 2:
                    aux = buttonGroupDisc.getElements();
                    for(int j = 0; j <= ventas.get(index).getOpciones(2);j++)
                        aux.nextElement().setSelected(true);
                    break;
                case 3:
                    aux = buttonGroupGraf.getElements();
                    for(int j = 0; j <= ventas.get(index).getOpciones(3);j++)
                        aux.nextElement().setSelected(true);
                    break;
            }
        }
        
        
        jCheckBoxOp0.setSelected(ventas.get(index).getChecks()[0]);
        jCheckBoxOp1.setSelected(ventas.get(index).getChecks()[1]);
        jCheckBoxOp2.setSelected(ventas.get(index).getChecks()[2]);
        jCheckBoxOp3.setSelected(ventas.get(index).getChecks()[3]);
        
        botonera(true);
        jButtonEliminar.setEnabled(true);
        jButtonAdd.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        
    }
    
    public void eliminar(int index){
        if(javax.swing.JOptionPane.showConfirmDialog(null, "Seguro que desea"
                + "eliminar la venta", "Confirmación de Usuario", 
                javax.swing.JOptionPane.OK_CANCEL_OPTION) == 0){
                ventas.remove(index);

            Vector<String> aux = new Vector();
            for(int i =0; i<ventas.size();i++){
                    aux.add(ventas.get(i).getNombre());
            }
            jListResult.setListData(aux);

            iniciar();
        }
        
        cancelar();
        
    }
    
    public void buscar(int inicio, String nombre){
        jButtonEliminar.setEnabled(false);
        int seleccion = 0;
        int pr = 0;
        for(int i = inicio; i< ventas.size();i++){
        
            if(ventas.get(i).getNombre().equals(nombre)){
                jListResult.setSelectedIndex(seleccion);
                seleccionarVenta(seleccion);
                if(pr==0){
                    seleccion = i;
                }
                else{
                    if(javax.swing.JOptionPane.showConfirmDialog(null,
                           "Tiene más de una entrada, ¿buscar siguiente?",
                           "Confirmación de Usuario", javax.swing.JOptionPane.YES_NO_OPTION) == 0)
                        seleccion = i;
                    else
                        i = ventas.size();
                }
                pr = 1;
                
            }
            
        }
        if(pr == 0){
            javax.swing.JOptionPane.showConfirmDialog(null,
                           "No existe el nombre de Cliente",
                           "Información", javax.swing.JOptionPane.PLAIN_MESSAGE);
            cancelar();
        }
        else{
            jListResult.setSelectedIndex(seleccion);
            seleccionarVenta(seleccion);
        }
        
        
    }
    
    public void guardar(){
        if(ventas.size()>0){
            try{
                FileOutputStream save = new FileOutputStream("ventas.dat",true);
                DataOutputStream data = new DataOutputStream(save);
                for(int i = 0; i < ventas.size(); i++){
                   data.writeUTF(ventas.get(i).getNombre());
                   data.writeInt(ventas.get(i).getLocalidad());
                   for(int j = 0; j < ventas.get(i).getOpciones().length; j++){
                       data.writeInt(ventas.get(i).getOpciones(j));
                   }
                   for(int j = 0; j < ventas.get(i).getChecks().length;j++){
                       data.writeBoolean(ventas.get(i).getChecks(j));
                   }
                }
                
                ventas.clear();
                Vector<String> aux = new Vector();
                jListResult.setListData(aux);
                
                data.close();
                save.close();
            }
            catch(IOException ex){
                javax.swing.JOptionPane.showConfirmDialog(null,
                           "Error al guardar: " + ex.getMessage() + "\nAvise a Soporte",
                           "Error!", javax.swing.JOptionPane.PLAIN_MESSAGE);
            }
            catch(Exception ex){
                javax.swing.JOptionPane.showConfirmDialog(null,
                           "Error al guardar: " + ex.getMessage() + "\nAvise a Soporte",
                           "Error!", javax.swing.JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            javax.swing.JOptionPane.showConfirmDialog(null,
                           "Lista vacía: Nada que guardar",
                           "Información", javax.swing.JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void mostrarGuardadas(){
        try{
            FileInputStream load = new FileInputStream("ventas.dat");
            DataInputStream data = new DataInputStream(load);
            boolean cont = true;
            try{
                while(cont){
                Venta aux = new Venta();
                aux.setNombre(data.readUTF());
                aux.setLocalidad(data.readInt());
                int[] opciones = new int[4];
                for(int i = 0; i<4;i++){
                    opciones[i]=data.readInt();
                }
                aux.setOpciones(opciones);
                boolean[] checks = new boolean[4];
                for(int i = 0; i < checks.length; i++){
                    checks[i] = data.readBoolean();
                }
                aux.setChecks(checks);
                ventas.add(aux);
                seleccionarVenta(ventas.indexOf(aux));
                ventas.remove(aux);
                
                cont = (javax.swing.JOptionPane.showConfirmDialog(null, 
                        "¿Desea ver el siguiente cliente?","Selección",
                        JOptionPane.YES_NO_OPTION)==0);
                }
                data.close();
                load.close();
            }catch(EOFException eof){
                javax.swing.JOptionPane.showConfirmDialog(null, "No hay más entradas"
                        ,"Información",javax.swing.JOptionPane.PLAIN_MESSAGE);
                data.close();
                load.close();
            }
            
        }catch(FileNotFoundException fnf){
            javax.swing.JOptionPane.showConfirmDialog(null,
                "No hay datos para mostrar","Sin datos",
                javax.swing.JOptionPane.PLAIN_MESSAGE);
        }catch(Exception ex){
            javax.swing.JOptionPane.showConfirmDialog(null,
                "Error al guardar: " + ex.getMessage() + "\nAvise a Soporte",
                "Error!", javax.swing.JOptionPane.PLAIN_MESSAGE);
        }
    }
 
    public ArrayList<Venta> ventas;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDisc;
    private javax.swing.ButtonGroup buttonGroupGraf;
    private javax.swing.ButtonGroup buttonGroupMem;
    private javax.swing.ButtonGroup buttonGroupProc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBoxOp0;
    private javax.swing.JCheckBox jCheckBoxOp1;
    private javax.swing.JCheckBox jCheckBoxOp2;
    private javax.swing.JCheckBox jCheckBoxOp3;
    private javax.swing.JComboBox jComboBoxLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jListResult;
    private javax.swing.JRadioButton jRadioButtonDisc0;
    private javax.swing.JRadioButton jRadioButtonDisc1;
    private javax.swing.JRadioButton jRadioButtonDisc2;
    private javax.swing.JRadioButton jRadioButtonDisc3;
    private javax.swing.JRadioButton jRadioButtonGra0;
    private javax.swing.JRadioButton jRadioButtonGra1;
    private javax.swing.JRadioButton jRadioButtonGra2;
    private javax.swing.JRadioButton jRadioButtonGra3;
    private javax.swing.JRadioButton jRadioButtonMem0;
    private javax.swing.JRadioButton jRadioButtonMem1;
    private javax.swing.JRadioButton jRadioButtonMem2;
    private javax.swing.JRadioButton jRadioButtonMem3;
    private javax.swing.JRadioButton jRadioButtonPr0;
    private javax.swing.JRadioButton jRadioButtonPr1;
    private javax.swing.JRadioButton jRadioButtonPr2;
    private javax.swing.JRadioButton jRadioButtonPr3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

}