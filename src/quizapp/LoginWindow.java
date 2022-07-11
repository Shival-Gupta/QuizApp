package quizapp;

import java.awt.Toolkit;
import java.sql.*;
import java.lang.String;
import javax.swing.JOptionPane;

/**
 *
 * @author sgupt
 */
public class LoginWindow extends QuizApp {

    
    public LoginWindow() {
        initComponents();
            
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp", "root", "");
            PreparedStatement ps= con.prepareStatement("select * from users");
            ResultSet rs= ps.executeQuery();
            System.out.println("Database Connected!");
        } catch (Exception e) {
            System.out.println("Database Connection Unsuccesfull!");
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "<Html>Database connection unsuccesfull,<BR>Restart the program or contact developer.</HTML>", "Database Connection Unsuccesfull", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
//        JOptionPane.showMessageDialog(null, "");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
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
        btn2Panel = new javax.swing.JPanel();
        forgetBtn = new javax.swing.JLabel();
        aboutPanel = new javax.swing.JPanel();
        Disclaimer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 380));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        body.setBackground(new java.awt.Color(34, 43, 53));
        body.setForeground(new java.awt.Color(242, 242, 242));

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
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("Username:");

        idField.setBackground(new java.awt.Color(242, 242, 242));
        idField.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        idField.setForeground(new java.awt.Color(60, 63, 66));
        idField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        pwdLabel.setBackground(new java.awt.Color(60, 63, 66));
        pwdLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pwdLabel.setForeground(new java.awt.Color(242, 242, 242));
        pwdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pwdLabel.setText("Password:");

        pwdField.setBackground(new java.awt.Color(242, 242, 242));
        pwdField.setForeground(new java.awt.Color(60, 63, 66));
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
                    .addComponent(pwdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
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
        loginBtn.setForeground(new java.awt.Color(60, 63, 66));
        loginBtn.setMaximumSize(new java.awt.Dimension(155, 30));
        loginBtn.setMinimumSize(new java.awt.Dimension(155, 30));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
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

        btn2Panel.setBackground(new java.awt.Color(34, 43, 53));
        btn2Panel.setForeground(new java.awt.Color(242, 242, 242));

        forgetBtn.setBackground(new java.awt.Color(60, 63, 66));
        forgetBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        forgetBtn.setForeground(new java.awt.Color(242, 242, 242));
        forgetBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgetBtn.setText("Forgot Password");
        btn2Panel.add(forgetBtn);

        aboutPanel.setBackground(new java.awt.Color(34, 43, 53));
        aboutPanel.setForeground(new java.awt.Color(242, 242, 242));

        Disclaimer.setBackground(new java.awt.Color(60, 63, 66));
        Disclaimer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Disclaimer.setForeground(new java.awt.Color(242, 242, 242));
        Disclaimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Disclaimer.setText("Quiz App © Shival Gupta");
        aboutPanel.add(Disclaimer);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btn2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(body);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        String uid, pwd;
        uid = idField.getText();
        pwd = new String(pwdField.getPassword());
        
        String sql = "select * from users where UserID= ? AND Password= ?";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp", "root", "");
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, uid);
            ps.setString(2, pwd);
            ResultSet rs= ps.executeQuery();
            if(rs.next()) {
                dispose();
                homeWindow.setVisible(true);
                //this.setVisible(false);
                System.out.println("\nLogin Succesfull!!"+"\tID: "+uid+"\tPWD: "+pwd);
            }
            
            else {
                System.out.println("\nUnsuccesfull Login!!"+"\tID: "+uid+"\tPWD: "+pwd);
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "<Html>Invalid username or password !<BR>Please try again.</HTML>", "Unsuccessful Login", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Exception e) {
            System.out.println("Database Connection Unsuccesfull!");
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "<Html>Database connection unsuccesfull,<BR>Restart the program or contact developer.</HTML>", "Database Connection Unsuccesfull", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void pwdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Disclaimer;
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btn2Panel;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JLabel forgetBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
