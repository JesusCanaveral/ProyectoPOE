/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Color;
import javax.swing.JOptionPane;
import models.Usuario;
import utils.Fonts;
import utils.Colors;
/**
 *
 * @author luz
 */
public class LoginView extends javax.swing.JFrame {
    public  static Usuario  listaUsuarios []= new Usuario[4];
    /**
 * Creates new form LoginView
     */
    public LoginView() {
        listaUsuarios[0]=new Usuario("Angel","Luz");
        listaUsuarios[1]=new Usuario("Jesus","Cañaveral");
        listaUsuarios[2]=new Usuario("Christofer","Luevanos");
        listaUsuarios[3]=new Usuario("Alvaro","Corona");
        initComponents();
        this.getContentPane().requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        titleMin2 = new components.TitleMin();
        titleClose1 = new components.TitleClose();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        customPassField1 = new components.CustomPassField();
        customTextField1 = new components.CustomTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customButton1 = new components.CustomButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/c220.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 220, -1, -1));
        jPanel2.add(titleMin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 15, 21, -1));
        jPanel2.add(titleClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 12, -1));

        jLabel2.setBackground(Colors.lightBlue);
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 0, 240, 600));

        jLabel1.setFont(Fonts.titleBig);
        jLabel1.setForeground(Colors.mediumBlue);
        jLabel1.setText("Iniciar Sesión");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 290, -1));

        customPassField1.setText("customPassField1");
        jPanel2.add(customPassField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 400, 35));

        customTextField1.setText("Ingresa tu usuario...");
        jPanel2.add(customTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 400, 35));

        jLabel3.setFont(Fonts.title);
        jLabel3.setForeground(new Color(100,100,100));
        jLabel3.setText("Nombre de usuario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 400, -1));

        jLabel4.setFont(Fonts.title);
        jLabel4.setForeground(new Color(100,100,100));
        jLabel4.setText("Contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 400, -1));

        customButton1.setText("Iniciar Sesión");
        customButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customButton1MouseClicked(evt);
            }
        });
        jPanel2.add(customButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 260, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customButton1MouseClicked
        int error=0;
        if (!customTextField1.getText().isEmpty()||customPassField1.getText().equals("")) {
            for (int i=0;i<4;i++) {
                if(customTextField1.getText().equals(listaUsuarios[i].getNombre())){
                    if (customPassField1.getText().equals(listaUsuarios[i].getContrasena())) {
                        error=0;
                        this.setVisible(false);
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new Menu().setVisible(true);
                            }
                        });
                        break;
                    }else{
                        error=1;
                        break;
                    }
                }else{
                    error=2;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, 
                            "Rellena todos los campos");
        }
        switch (error) {
            case 1:
                JOptionPane.showMessageDialog(null, 
                            "La contraseña es erronea");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, 
                            "El usuario que ingresaste no existe");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_customButton1MouseClicked
    
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.CustomButton customButton1;
    private components.CustomPassField customPassField1;
    private components.CustomTextField customTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private components.TitleClose titleClose1;
    private components.TitleMin titleMin2;
    // End of variables declaration//GEN-END:variables

}
