package quizapp;

import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginWin extends QuizApp {

    
    ResultSet loginRS;
    
    
    public LoginWin() {
        checkConnection();
        initComponents();
    }
    
    private boolean tryLogin(String uid, String pwd){
        boolean loginStatus = false;
        
        try {
            sql = "select * from users where (UserID= ? OR Mail= ?) AND Password= ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, uid);
            ps.setString(2, uid);
            ps.setString(3, pwd);
            loginRS = ps.executeQuery();
            loginStatus = loginRS.next();
        }
        catch (Exception e) {
            System.out.println("Database not connected!");
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "<Html>Database connection unsuccesfull,<BR>"
                    + "Restart the program or contact developer.</HTML>", 
                    "Database not connected", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        return loginStatus;
    }
    
    private void fetchLoginDetails(){
        try {
            name = loginRS.getString("Name");
            sex = loginRS.getString("Sex");
            dob = loginRS.getString("DOB");
            mail = loginRS.getString("Mail");
            state = loginRS.getString("State");
            country = loginRS.getString("Country");
            highScore = loginRS.getInt("HighScore");
        } catch (SQLException ex) {
            Logger.getLogger(LoginWin.class.getName()).log(Level.SEVERE, null, ex);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "<Html>Try Again!<BR>"+ex+"</HTML>", 
                    "Fetching Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        pwdField = new javax.swing.JPasswordField();
        btnPanel = new javax.swing.JPanel();
        loginBtn = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        optionPanel = new javax.swing.JPanel();
        signUpPrompt = new javax.swing.JLabel();
        r2signUpBtn = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        Disclaimer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 600));
        setPreferredSize(new java.awt.Dimension(450, 600));

        bodyPanel.setBackground(new java.awt.Color(34, 43, 53));
        bodyPanel.setForeground(new java.awt.Color(242, 242, 242));

        titlePanel.setBackground(new java.awt.Color(34, 43, 53));
        titlePanel.setForeground(new java.awt.Color(242, 242, 242));

        titleLabel.setBackground(new java.awt.Color(60, 63, 66));
        titleLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(242, 242, 242));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("QuizApp");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        inputPanel.setBackground(new java.awt.Color(34, 43, 53));
        inputPanel.setForeground(new java.awt.Color(242, 242, 242));

        jPanel4.setBackground(new java.awt.Color(34, 43, 53));
        jPanel4.setForeground(new java.awt.Color(242, 242, 242));

        idLabel.setBackground(new java.awt.Color(60, 63, 66));
        idLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        idLabel.setForeground(new java.awt.Color(242, 242, 242));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        idLabel.setText("Username / Email:");

        idField.setBackground(new java.awt.Color(72, 75, 80));
        idField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        idField.setForeground(new java.awt.Color(242, 242, 242));
        idField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        pwdLabel.setBackground(new java.awt.Color(60, 63, 66));
        pwdLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pwdLabel.setForeground(new java.awt.Color(242, 242, 242));
        pwdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pwdLabel.setText("Password:");

        pwdField.setBackground(new java.awt.Color(72, 75, 80));
        pwdField.setForeground(new java.awt.Color(242, 242, 242));
        pwdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        inputPanel.add(jPanel4);

        btnPanel.setBackground(new java.awt.Color(34, 43, 53));
        btnPanel.setForeground(new java.awt.Color(242, 242, 242));

        loginBtn.setBackground(new java.awt.Color(60, 63, 66));
        loginBtn.setForeground(new java.awt.Color(242, 242, 242));
        loginBtn.setMaximumSize(new java.awt.Dimension(155, 30));
        loginBtn.setMinimumSize(new java.awt.Dimension(155, 30));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginBtnMouseReleased(evt);
            }
        });

        loginLabel.setBackground(new java.awt.Color(242, 242, 242));
        loginLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(242, 242, 242));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnPanel.add(loginBtn);

        optionPanel.setBackground(new java.awt.Color(34, 43, 53));
        optionPanel.setForeground(new java.awt.Color(242, 242, 242));

        signUpPrompt.setBackground(new java.awt.Color(60, 63, 66));
        signUpPrompt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        signUpPrompt.setForeground(new java.awt.Color(242, 242, 242));
        signUpPrompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpPrompt.setText("Don't have an account yet?");
        optionPanel.add(signUpPrompt);

        r2signUpBtn.setBackground(new java.awt.Color(60, 63, 66));
        r2signUpBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        r2signUpBtn.setForeground(new java.awt.Color(104, 181, 248));
        r2signUpBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r2signUpBtn.setText("Sign Up");
        r2signUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2signUpBtnMouseClicked(evt);
            }
        });
        optionPanel.add(r2signUpBtn);

        footerPanel.setBackground(new java.awt.Color(34, 43, 53));
        footerPanel.setForeground(new java.awt.Color(242, 242, 242));

        Disclaimer.setBackground(new java.awt.Color(60, 63, 66));
        Disclaimer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Disclaimer.setForeground(new java.awt.Color(242, 242, 242));
        Disclaimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Disclaimer.setText("Quiz App © Shival Gupta");
        footerPanel.add(Disclaimer);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
            .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(optionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        uid = idField.getText().trim();
        pwd = new String(pwdField.getPassword());
        
        if(tryLogin(uid, pwd)) {
            System.out.println("\n"+uid+"Logged in succesfully!");
            loginStatus=true;
            
            fetchLoginDetails();
            initHomeWin();
            homeWindow.usernameLabel.setText(name);
            
            signUpWindow.dispose();
            this.dispose();
            homeWindow.setVisible(true);
        }
        else {
            System.out.println("\nUnsuccesfull login attempt by user: "+uid);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "<Html>Invalid username or password !<BR>"
                    + "Please try again.</HTML>", 
                    "Unsuccessful Login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void pwdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdFieldActionPerformed

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseReleased
        loginBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_loginBtnMouseReleased

    private void loginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMousePressed
        loginBtn.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_loginBtnMousePressed

    private void r2signUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2signUpBtnMouseClicked
        uid = idField.getText().trim();
        pwd = new String(pwdField.getPassword());
        this.setVisible(false);
        signUpWindow.setVisible(true);
        signUpWindow.usernameField.setText(uid);
        signUpWindow.passwordField.setText(pwd);
        
    }//GEN-LAST:event_r2signUpBtnMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWin().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Variable declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Disclaimer;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JPanel footerPanel;
    public javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel optionPanel;
    public javax.swing.JPasswordField pwdField;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JLabel r2signUpBtn;
    private javax.swing.JLabel signUpPrompt;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
