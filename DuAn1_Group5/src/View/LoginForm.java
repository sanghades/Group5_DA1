/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DomainModels.TaiKhoanModel;
import Repository.DangNhapRepository;
import javax.swing.JOptionPane;

/**
 *
 * @author sangh
 */
public class LoginForm extends javax.swing.JFrame {
    private DangNhapRepository impl = new DangNhapRepository();
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        txtError = new javax.swing.JTextField();
        txtLoi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(435, 430));

        jPanel3.setPreferredSize(new java.awt.Dimension(435, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Meat Poly");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(435, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-google-24.png"))); // NOI18N
        jButton1.setText("Log in with Google");
        jButton1.setPreferredSize(new java.awt.Dimension(300, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        jPanel1.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(435, 150));

        jPanel6.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel6.setLayout(new java.awt.BorderLayout(4, 4));

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
        });
        jPanel6.add(txtUser, java.awt.BorderLayout.CENTER);

        jLabel2.setText("Username:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel7.setLayout(new java.awt.BorderLayout(4, 4));

        jLabel3.setText("Password:");
        jPanel7.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });
        jPanel7.add(txtPass, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel7);

        jPanel8.setPreferredSize(new java.awt.Dimension(300, 20));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jCheckBox1.setText("Remember me");
        jPanel8.add(jCheckBox1, java.awt.BorderLayout.WEST);

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Forgot your password?");
        jLabel4.setToolTipText("");
        jPanel8.add(jLabel4, java.awt.BorderLayout.EAST);

        jPanel5.add(jPanel8);

        jPanel1.add(jPanel5);

        jPanel9.setPreferredSize(new java.awt.Dimension(435, 100));

        jButton2.setText("Login");
        jButton2.setPreferredSize(new java.awt.Dimension(300, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoi))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 430));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/D.png"))); // NOI18N
        jPanel2.add(jLabel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String user = txtUser.getText();
        String pass = txtPass.getText();
        TaiKhoanModel tk = impl.dangNhap(user, pass);
        try {
            if (user.equalsIgnoreCase(tk.getUsername()) && pass.equalsIgnoreCase(tk.getPassWorld()) && tk.getChucVu().equalsIgnoreCase("nv")) {
                this.dispose();
                HomeForNv v = new HomeForNv();
                v.setVisible(true);
            } else if (user.equalsIgnoreCase(tk.getUsername()) && pass.equalsIgnoreCase(tk.getPassWorld()) && tk.getChucVu().equalsIgnoreCase("ql")) {
                this.dispose();
                Home q = new Home();
                q.setVisible(true);
            }
        } catch (Exception e) {
            String txt = "Lỗi đăng nhập! Tài khoản hoặc mật khẩu không chính xác.";
    JOptionPane.showMessageDialog(this, txt);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtErrorActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        // TODO add your handling code here:
        if (!txtUser.getText().isEmpty() || !txtPass.getText().isEmpty()) {
            txtError.setText("");
        }
        if (txtPass.getText().isEmpty()) {
            txtLoi.setText("Không được để trống");
        }
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        // TODO add your handling code here:
        if (!txtUser.getText().isEmpty() || !txtPass.getText().isEmpty()) {
            txtError.setText("");
        }
        if (txtPass.getText().isEmpty()) {
            txtLoi.setText("Không được để trống");
        }
    }//GEN-LAST:event_txtPassKeyReleased

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtError;
    private javax.swing.JLabel txtLoi;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
