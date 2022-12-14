/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controllers.ControllerActuator;
import java.util.UUID;
import javax.swing.JOptionPane;
import models.ActuadorTemperatura;
import utils.Fonts;
import utils.Colors;

/**
 *
 * @author Usuario
 */
public class CreateActuator extends javax.swing.JFrame {

    /**
     * Creates new form CreateDeviceGPS
     */
    public CreateActuator() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customTextField2 = new components.CustomTextField();
        customTextField4 = new components.CustomTextField();
        customChoose1 = new components.CustomChoose();
        customRadioButton1 = new components.CustomRadioButton();
        customRadioButton2 = new components.CustomRadioButton();
        customButton1 = new components.CustomButton();
        customButton2 = new components.CustomButton();
        customButton3 = new components.CustomButton();
        customButton4 = new components.CustomButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Colors.white);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(Colors.white);
        jPanel1.setForeground(Colors.white);
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(Fonts.title);
        jLabel1.setForeground(Colors.mediumBlue);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Actuador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, -1));

        jLabel2.setFont(Fonts.normal);
        jLabel2.setText("IP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(Fonts.normal);
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel4.setFont(Fonts.normal);
        jLabel4.setText("Modelo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(Fonts.normal);
        jLabel5.setText("Tipo actuador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel6.setFont(Fonts.normal);
        jLabel6.setText("Tiempo de respuesta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));
        jPanel1.add(customTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 680, -1));

        customTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(customTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 680, -1));

        customChoose1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Zigbee", "" }));
        jPanel1.add(customChoose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 680, -1));

        buttonGroup1.add(customRadioButton1);
        customRadioButton1.setText("Lento");
        customRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(customRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        buttonGroup1.add(customRadioButton2);
        customRadioButton2.setText("Rapido");
        jPanel1.add(customRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        customButton1.setText("Eliminar");
        customButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customButton1MouseClicked(evt);
            }
        });
        jPanel1.add(customButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 130, 40));

        customButton2.setText("Registrar");
        customButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customButton2MouseClicked(evt);
            }
        });
        jPanel1.add(customButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 130, 40));

        customButton3.setText("Editar");
        customButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customButton3MouseClicked(evt);
            }
        });
        jPanel1.add(customButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 130, 40));

        customButton4.setText("Buscar");
        customButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customButton4MouseClicked(evt);
            }
        });
        jPanel1.add(customButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 130, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 670, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customTextField4ActionPerformed

    private void customRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customRadioButton1ActionPerformed

    private void customButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customButton2MouseClicked

        var actuador = new ActuadorTemperatura(
                UUID.randomUUID().toString(),
                this.customTextField2.getText(),
                "apagado",
                this.customTextField4.getText(),
                this.customChoose1.getSelectedItem().toString(),
                "1.2.2.3",
                0,
                100,
                0,
                this.customRadioButton1.isSelected() ? 1 : 0,
                this.jTextArea1.getText()
        );
        ControllerActuator.add(actuador);
        JOptionPane.showMessageDialog(this, "Agregado correctamente");
        this.clear();
    }//GEN-LAST:event_customButton2MouseClicked

    private void customButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customButton4MouseClicked
        var ip = customTextField2.getText();
        var actuador = (ActuadorTemperatura) ControllerActuator.search(ip);
        if (null == actuador) {
            JOptionPane.showMessageDialog(this, "No se encuentra","No hay",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        customTextField4.setText(actuador.getNombre());
        if (actuador.getTiempoRespuesta() == 1) {
            customRadioButton1.setSelected(true);
        } else {
            customRadioButton1.setSelected(false);
        }
        customChoose1.setSelectedItem(actuador.getModelo());
        jTextArea1.setText(actuador.getTipoActuador());
    }//GEN-LAST:event_customButton4MouseClicked

    private void customButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customButton1MouseClicked
        ControllerActuator.delete(customTextField2.getText());
        JOptionPane.showMessageDialog(this, "Eliminado","Se ha eliminado", JOptionPane.INFORMATION_MESSAGE);
        clear();
    }//GEN-LAST:event_customButton1MouseClicked

    private void customButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customButton3MouseClicked
        var actuador = new ActuadorTemperatura(
                UUID.randomUUID().toString(),
                this.customTextField2.getText(),
                "apagado",
                this.customTextField4.getText(),
                this.customChoose1.getSelectedItem().toString(),
                "1.2.2.3",
                0,
                100,
                0,
                this.customRadioButton1.isSelected() ? 1 : 0,
                this.jTextArea1.getText()
        );
        ControllerActuator.edit(actuador.getIp(), actuador);
        JOptionPane.showMessageDialog(this, "Actualizado","Se ha actualizado", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_customButton3MouseClicked

    private void clear()
    {
        customTextField2.setText("");
        customTextField4.setText("");
        jTextArea1.setText("");
        customChoose1.setSelectedItem("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private components.CustomButton customButton1;
    private components.CustomButton customButton2;
    private components.CustomButton customButton3;
    private components.CustomButton customButton4;
    private components.CustomChoose customChoose1;
    private components.CustomRadioButton customRadioButton1;
    private components.CustomRadioButton customRadioButton2;
    private components.CustomTextField customTextField2;
    private components.CustomTextField customTextField4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
