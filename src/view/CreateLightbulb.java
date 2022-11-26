/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import utils.Fonts;
import utils.Colors;

/**
 *
 * @author Usuario
 */
public class CreateLightbulb extends javax.swing.JFrame {

    /**
     * Creates new form CreateDeviceGPS
     */
    public CreateLightbulb() {
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
        jLabel6 = new javax.swing.JLabel();
        customTextField2 = new components.CustomTextField();
        customTextField4 = new components.CustomTextField();
        customChoose1 = new components.CustomChoose();
        customButton1 = new components.CustomButton();
        customButton2 = new components.CustomButton();
        customButton3 = new components.CustomButton();
        customButton4 = new components.CustomButton();
        customTextField5 = new components.CustomTextField();
        jLabel7 = new javax.swing.JLabel();
        customTextField6 = new components.CustomTextField();

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
        jLabel1.setText("Registro de Focos");
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

        jLabel6.setFont(Fonts.normal);
        jLabel6.setText("Intensidad maxima");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));
        jPanel1.add(customTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 680, -1));

        customTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(customTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 680, -1));

        customChoose1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Zigbee", " " }));
        jPanel1.add(customChoose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 680, -1));

        customButton1.setText("Eliminar");
        jPanel1.add(customButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 130, 40));

        customButton2.setText("Registrar");
        jPanel1.add(customButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 130, 40));

        customButton3.setText("Editar");
        jPanel1.add(customButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 130, 40));

        customButton4.setText("Buscar");
        jPanel1.add(customButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 130, 40));

        customTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(customTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 680, -1));

        jLabel7.setFont(Fonts.normal);
        jLabel7.setText("Potencia de consumo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        customTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(customTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 680, -1));

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

    private void customTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customTextField5ActionPerformed

    private void customTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateLightbulb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateLightbulb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateLightbulb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateLightbulb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateLightbulb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private components.CustomButton customButton1;
    private components.CustomButton customButton2;
    private components.CustomButton customButton3;
    private components.CustomButton customButton4;
    private components.CustomChoose customChoose1;
    private components.CustomTextField customTextField2;
    private components.CustomTextField customTextField4;
    private components.CustomTextField customTextField5;
    private components.CustomTextField customTextField6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
