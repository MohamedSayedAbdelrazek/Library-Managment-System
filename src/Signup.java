/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DESKTOP-VNBO47I
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Signup extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form Signup
     */
    public Signup() {
        super("Sign Up");
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        conn = javaconnect.ConnecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comBoxSec = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAns = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtConPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comBoxSec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comBoxSec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[Choose Your Security Qusetion]", "What was the name of your first school?", "What is the name of your favorite animal?", "What was your childhood nickname?", "What is the title of your favorite childhood book?" }));
        comBoxSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxSecActionPerformed(evt);
            }
        });
        getContentPane().add(comBoxSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 300, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("UserName");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Security Question");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Answer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 200, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 200, -1));

        txtAns.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnsActionPerformed(evt);
            }
        });
        getContentPane().add(txtAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 200, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-go-back-15.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, -1, -1));

        btnCreate.setBackground(new java.awt.Color(255, 255, 204));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-create-15.png"))); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        txtPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 200, 30));

        txtConPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtConPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 200, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icooo.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Off-White-FV9702.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 530, 510));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_resized_image.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        setSize(new java.awt.Dimension(1380, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comBoxSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxSecActionPerformed
        // TODO add your handling code here:
        if (comBoxSec.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please Select a Security Question");
        } else {
            txtAns.grabFocus();
        }

    }//GEN-LAST:event_comBoxSecActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
        if (txtUser.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter Username.");
        } else {
            txtName.grabFocus();
        }
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
        if (txtName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter Name.");
        } else {
            comBoxSec.grabFocus();
        }
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnsActionPerformed
        // TODO add your handling code here:
        if (txtAns.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter Answer.");
        } else {
            txtPass.grabFocus();
        }
    }//GEN-LAST:event_txtAnsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login op = new Login();
        op.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String userName = txtUser.getText();
        String Name = txtName.getText();
        String Pass2 = txtPass.getText();
        String Pass = passwordUtilities.hashPassword(Pass2);
        String sec_Q = (String) comBoxSec.getSelectedItem();
        String Answer = txtAns.getText();
        String hashedAnswer = passwordUtilities.hashPassword(Answer);

        if (userName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter Username.");
            txtUser.grabFocus();
        } else if (Name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter Name.");
            txtName.grabFocus();
        } else if (comBoxSec.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please Select a Security Question");
            comBoxSec.grabFocus();
        } else if (Answer.trim().isEmpty()) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter Answer.");
            txtAns.grabFocus();
        } else if (txtPass.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter Password.");
            txtPass.grabFocus();
        }else if(txtPass.getText().length()<8){
        JOptionPane.showMessageDialog(Signup.this, "Please Enter Password greater or equal 8!");
        } else if (!txtPass.getText().equals(txtConPass.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!");
            txtConPass.grabFocus();
        } else {
            String sql = "insert into account (userName,name,password,sec_question,answer)values(?,?,?,?,?)";
            boolean f = false;
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, userName);
                pst.setString(2, Name);
                pst.setString(3, Pass);
                pst.setString(4, sec_Q);
                pst.setString(5, hashedAnswer);
                int updatedRows = pst.executeUpdate();
                if (updatedRows > 0) {
                    f = true;
                    JOptionPane.showMessageDialog(this, "Account created Successfully please login. ");
                    setVisible(false);
                    Login ob = new Login();
                    ob.setVisible(true);
                }

                //if(rs.next())f=true;
            } catch (SQLException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Username has already exist, try again.");
            }

        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
        if (txtPass.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter Pass.");
        } else if (txtPass.getText().length() < 8) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter Password greater or equal 8 ");

        } else {
            txtConPass.grabFocus();
        }
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtConPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConPassActionPerformed
        // TODO add your handling code here:
        if (txtConPass.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(Signup.this, "Please Enter the confirm Pass.");
        } else {
            btnCreate.doClick();
        }
    }//GEN-LAST:event_txtConPassActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> comBoxSec;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAns;
    private javax.swing.JPasswordField txtConPass;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
