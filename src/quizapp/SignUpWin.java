package quizapp;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SignUpWin extends QuizApp {

    public SignUpWin() {
        initComponents();
    }
    
    void fetchValues(){
        uid = usernameField.getText().trim();
        pwd = new String(passwordField.getPassword());
        name = nameField.getText().trim();
        dob = sdf.format(dobDateChooser.getDate()).trim();
        mail = mailField.getText().trim();
        state = stateField.getText().trim();
        country = countryField.getText().trim();
        if(maleRBtn.isSelected())
            sex = "M";
        else if(femaleRBtn.isSelected())
            sex = "F";
        else
            sex = "N";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexGroup = new javax.swing.ButtonGroup();
        body = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        inputPanel = new javax.swing.JPanel();
        namePanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        mailPanel = new javax.swing.JPanel();
        mailLabel = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        sexPanel = new javax.swing.JPanel();
        sexLabel = new javax.swing.JLabel();
        maleRBtn = new javax.swing.JRadioButton();
        femaleRBtn = new javax.swing.JRadioButton();
        naRBtn = new javax.swing.JRadioButton();
        dobPanel = new javax.swing.JPanel();
        dobLabel = new javax.swing.JLabel();
        dobDateChooser = new com.toedter.calendar.JDateChooser();
        statePanel = new javax.swing.JPanel();
        stateLabel = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        countryPanel = new javax.swing.JPanel();
        countryLabel = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        usernamePanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        btnPanel = new javax.swing.JPanel();
        signUpBtn = new javax.swing.JPanel();
        signUpLabel = new javax.swing.JLabel();
        optionPanel = new javax.swing.JPanel();
        loginPrompt = new javax.swing.JLabel();
        r2loginBtn = new javax.swing.JLabel();
        aboutPanel = new javax.swing.JPanel();
        Disclaimer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        body.setBackground(new java.awt.Color(34, 43, 53));
        body.setForeground(new java.awt.Color(242, 242, 242));

        titlePanel.setBackground(new java.awt.Color(34, 43, 53));
        titlePanel.setForeground(new java.awt.Color(242, 242, 242));

        titleLabel.setBackground(new java.awt.Color(60, 63, 66));
        titleLabel.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(242, 242, 242));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("QuizApp");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        inputPanel.setBackground(new java.awt.Color(34, 43, 53));
        inputPanel.setForeground(new java.awt.Color(242, 242, 242));
        inputPanel.setLayout(new java.awt.GridLayout(0, 1));

        namePanel.setBackground(new java.awt.Color(34, 43, 53));
        namePanel.setForeground(new java.awt.Color(242, 242, 242));

        nameLabel.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText("     Name:");

        nameField.setBackground(new java.awt.Color(242, 242, 242));
        nameField.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        nameField.setForeground(new java.awt.Color(0, 0, 0));
        nameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        inputPanel.add(namePanel);

        mailPanel.setBackground(new java.awt.Color(34, 43, 53));
        mailPanel.setForeground(new java.awt.Color(242, 242, 242));

        mailLabel.setBackground(new java.awt.Color(60, 63, 66));
        mailLabel.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(242, 242, 242));
        mailLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mailLabel.setText("     Mail:");

        mailField.setBackground(new java.awt.Color(242, 242, 242));
        mailField.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        mailField.setForeground(new java.awt.Color(0, 0, 0));
        mailField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mailPanelLayout = new javax.swing.GroupLayout(mailPanel);
        mailPanel.setLayout(mailPanelLayout);
        mailPanelLayout.setHorizontalGroup(
            mailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mailField, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        mailPanelLayout.setVerticalGroup(
            mailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mailPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(mailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.add(mailPanel);

        sexPanel.setBackground(new java.awt.Color(34, 43, 53));
        sexPanel.setForeground(new java.awt.Color(242, 242, 242));

        sexLabel.setBackground(new java.awt.Color(60, 63, 66));
        sexLabel.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        sexLabel.setForeground(new java.awt.Color(242, 242, 242));
        sexLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sexLabel.setText("     Sex:");

        maleRBtn.setBackground(new java.awt.Color(34, 43, 53));
        sexGroup.add(maleRBtn);
        maleRBtn.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        maleRBtn.setForeground(new java.awt.Color(242, 242, 242));
        maleRBtn.setSelected(true);
        maleRBtn.setText("Male");
        maleRBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maleRBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        maleRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRBtnActionPerformed(evt);
            }
        });

        femaleRBtn.setBackground(new java.awt.Color(34, 43, 53));
        sexGroup.add(femaleRBtn);
        femaleRBtn.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        femaleRBtn.setForeground(new java.awt.Color(242, 242, 242));
        femaleRBtn.setText("Female");
        femaleRBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        femaleRBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        femaleRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRBtnActionPerformed(evt);
            }
        });

        naRBtn.setBackground(new java.awt.Color(34, 43, 53));
        sexGroup.add(naRBtn);
        naRBtn.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        naRBtn.setForeground(new java.awt.Color(242, 242, 242));
        naRBtn.setText("Prefer not to say");
        naRBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        naRBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        naRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naRBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sexPanelLayout = new javax.swing.GroupLayout(sexPanel);
        sexPanel.setLayout(sexPanelLayout);
        sexPanelLayout.setHorizontalGroup(
            sexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sexPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maleRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(naRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        sexPanelLayout.setVerticalGroup(
            sexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sexPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(sexPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(naRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(femaleRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sexLabel)
                    .addComponent(maleRBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        inputPanel.add(sexPanel);

        dobPanel.setBackground(new java.awt.Color(34, 43, 53));
        dobPanel.setForeground(new java.awt.Color(242, 242, 242));

        dobLabel.setBackground(new java.awt.Color(60, 63, 66));
        dobLabel.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(242, 242, 242));
        dobLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dobLabel.setText("     Date of Birth:");

        dobDateChooser.setBackground(new java.awt.Color(242, 242, 242));
        dobDateChooser.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout dobPanelLayout = new javax.swing.GroupLayout(dobPanel);
        dobPanel.setLayout(dobPanelLayout);
        dobPanelLayout.setHorizontalGroup(
            dobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dobPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dobDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        dobPanelLayout.setVerticalGroup(
            dobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dobPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(dobPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dobDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        inputPanel.add(dobPanel);

        statePanel.setBackground(new java.awt.Color(34, 43, 53));
        statePanel.setForeground(new java.awt.Color(242, 242, 242));

        stateLabel.setBackground(new java.awt.Color(60, 63, 66));
        stateLabel.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        stateLabel.setForeground(new java.awt.Color(242, 242, 242));
        stateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stateLabel.setText("     State:");

        stateField.setBackground(new java.awt.Color(242, 242, 242));
        stateField.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        stateField.setForeground(new java.awt.Color(0, 0, 0));
        stateField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        stateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statePanelLayout = new javax.swing.GroupLayout(statePanel);
        statePanel.setLayout(statePanelLayout);
        statePanelLayout.setHorizontalGroup(
            statePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateField, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        statePanelLayout.setVerticalGroup(
            statePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(statePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stateLabel)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.add(statePanel);

        countryPanel.setBackground(new java.awt.Color(34, 43, 53));
        countryPanel.setForeground(new java.awt.Color(242, 242, 242));

        countryLabel.setBackground(new java.awt.Color(60, 63, 66));
        countryLabel.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        countryLabel.setForeground(new java.awt.Color(242, 242, 242));
        countryLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        countryLabel.setText("     Country:");

        countryField.setBackground(new java.awt.Color(242, 242, 242));
        countryField.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        countryField.setForeground(new java.awt.Color(0, 0, 0));
        countryField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        countryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout countryPanelLayout = new javax.swing.GroupLayout(countryPanel);
        countryPanel.setLayout(countryPanelLayout);
        countryPanelLayout.setHorizontalGroup(
            countryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(countryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countryField, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        countryPanelLayout.setVerticalGroup(
            countryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(countryPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(countryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.add(countryPanel);

        usernamePanel.setBackground(new java.awt.Color(34, 43, 53));
        usernamePanel.setForeground(new java.awt.Color(242, 242, 242));

        usernameLabel.setBackground(new java.awt.Color(60, 63, 66));
        usernameLabel.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(242, 242, 242));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usernameLabel.setText("     Username:");

        usernameField.setBackground(new java.awt.Color(242, 242, 242));
        usernameField.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        usernameField.setForeground(new java.awt.Color(0, 0, 0));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.add(usernamePanel);

        passwordPanel.setBackground(new java.awt.Color(34, 43, 53));
        passwordPanel.setForeground(new java.awt.Color(242, 242, 242));

        passwordLabel.setBackground(new java.awt.Color(60, 63, 66));
        passwordLabel.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(242, 242, 242));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLabel.setText("     Password:");

        passwordField.setBackground(new java.awt.Color(242, 242, 242));
        passwordField.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.add(passwordPanel);

        btnPanel.setBackground(new java.awt.Color(34, 43, 53));
        btnPanel.setForeground(new java.awt.Color(242, 242, 242));

        signUpBtn.setBackground(new java.awt.Color(60, 63, 66));
        signUpBtn.setForeground(new java.awt.Color(242, 242, 242));
        signUpBtn.setMaximumSize(new java.awt.Dimension(155, 30));
        signUpBtn.setMinimumSize(new java.awt.Dimension(155, 30));
        signUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signUpBtnMouseReleased(evt);
            }
        });

        signUpLabel.setBackground(new java.awt.Color(242, 242, 242));
        signUpLabel.setFont(new java.awt.Font("Myanmar Text", 1, 16)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(242, 242, 242));
        signUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpLabel.setText("Sign Up");

        javax.swing.GroupLayout signUpBtnLayout = new javax.swing.GroupLayout(signUpBtn);
        signUpBtn.setLayout(signUpBtnLayout);
        signUpBtnLayout.setHorizontalGroup(
            signUpBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpBtnLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(signUpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        signUpBtnLayout.setVerticalGroup(
            signUpBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signUpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        btnPanel.add(signUpBtn);

        optionPanel.setBackground(new java.awt.Color(34, 43, 53));
        optionPanel.setForeground(new java.awt.Color(242, 242, 242));

        loginPrompt.setBackground(new java.awt.Color(60, 63, 66));
        loginPrompt.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        loginPrompt.setForeground(new java.awt.Color(242, 242, 242));
        loginPrompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginPrompt.setText("Already have an account?");
        optionPanel.add(loginPrompt);

        r2loginBtn.setBackground(new java.awt.Color(60, 63, 66));
        r2loginBtn.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        r2loginBtn.setForeground(new java.awt.Color(104, 181, 248));
        r2loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r2loginBtn.setText("Login");
        r2loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2loginBtnMouseClicked(evt);
            }
        });
        optionPanel.add(r2loginBtn);

        aboutPanel.setBackground(new java.awt.Color(34, 43, 53));
        aboutPanel.setForeground(new java.awt.Color(242, 242, 242));

        Disclaimer.setBackground(new java.awt.Color(60, 63, 66));
        Disclaimer.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        Disclaimer.setForeground(new java.awt.Color(242, 242, 242));
        Disclaimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Disclaimer.setText("Quiz App © Shival Gupta");
        aboutPanel.add(Disclaimer);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(aboutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(body);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void mailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailFieldActionPerformed

    private void stateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateFieldActionPerformed

    private void countryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void r2loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2loginBtnMouseClicked
        uid = usernameField.getText().trim();
        pwd = new String(passwordField.getPassword());
        this.setVisible(false);
        loginWindow.setVisible(true);
        loginWindow.idField.setText(uid);
        loginWindow.pwdField.setText(pwd);

    }//GEN-LAST:event_r2loginBtnMouseClicked

    private void signUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseClicked
        fetchValues();
        try {
            rs.close();
            ps.close();
            
            sql = "INSERT INTO users VALUES('"+name+"' ,"+highScore+" ,'"+mail+"' ,'"+sex+"' ,'"+dob+"' ,'"+state+"' ,'"+country+"' ,'"+uid+"' ,'"+pwd+"');";
            
            ps = con.prepareStatement(sql);
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "New User Added");
                this.dispose();
                loginWindow.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SignUpWin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: "+ex, "Error Signing Up", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_signUpBtnMouseClicked

    private void signUpBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseEntered
        signUpBtn.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_signUpBtnMouseEntered

    private void signUpBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseExited
        signUpBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_signUpBtnMouseExited

    private void signUpBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMousePressed
        signUpBtn.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_signUpBtnMousePressed

    private void signUpBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBtnMouseReleased
        signUpBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_signUpBtnMouseReleased

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void femaleRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRBtnActionPerformed

    private void naRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naRBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naRBtnActionPerformed

    private void maleRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUpWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpWin().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Variable declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Disclaimer;
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JPanel countryPanel;
    private com.toedter.calendar.JDateChooser dobDateChooser;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JPanel dobPanel;
    private javax.swing.JRadioButton femaleRBtn;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel loginPrompt;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JPanel mailPanel;
    private javax.swing.JRadioButton maleRBtn;
    private javax.swing.JRadioButton naRBtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel namePanel;
    private javax.swing.JPanel optionPanel;
    public javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JLabel r2loginBtn;
    private javax.swing.ButtonGroup sexGroup;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JPanel sexPanel;
    private javax.swing.JPanel signUpBtn;
    private javax.swing.JLabel signUpLabel;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JPanel statePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    public javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel usernamePanel;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>         
}
