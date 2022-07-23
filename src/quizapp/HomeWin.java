package quizapp;

public class HomeWin extends QuizApp {

    public HomeWin() {
        initComponents();
        
    }
    
    private void getTopics(){
        topics.clear();
        
        if(t1.isSelected())
            topics.add("c");
        if(t2.isSelected())
            topics.add("c++");
        if(t3.isSelected())
            topics.add("c#");
        if(t4.isSelected())
            topics.add("python");
        if(t5.isSelected())
            topics.add("java");
        if(t6.isSelected())
            topics.add("kotlin");
        if(t7.isSelected())
            topics.add("swift");
        if(t8.isSelected())
            topics.add("mysql");
        if(t9.isSelected())
            topics.add("html");
        if(t10.isSelected())
            topics.add("css");
        if(t11.isSelected())
            topics.add("js");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        analyticsLabel = new javax.swing.JLabel();
        analyticsSeperator = new javax.swing.JSeparator();
        bestScoreLabel = new javax.swing.JLabel();
        bestScoreField = new javax.swing.JLabel();
        timeSpentLabel = new javax.swing.JLabel();
        timeSpentField = new javax.swing.JLabel();
        lastPlayedLabel = new javax.swing.JLabel();
        lastPlayedField = new javax.swing.JLabel();
        latestScoreLabel = new javax.swing.JLabel();
        lastestScoreField = new javax.swing.JLabel();
        midPanel = new javax.swing.JPanel();
        leaderboardPanel = new javax.swing.JPanel();
        leaderboardQLabel = new javax.swing.JLabel();
        leaderboardSeparator = new javax.swing.JSeparator();
        headingsPanel = new javax.swing.JPanel();
        rankLabel0 = new javax.swing.JLabel();
        nameLabel0 = new javax.swing.JLabel();
        scoreLabel0 = new javax.swing.JLabel();
        userPanel1 = new javax.swing.JPanel();
        rankLabel11 = new javax.swing.JLabel();
        nameLabel11 = new javax.swing.JLabel();
        scoreLabel11 = new javax.swing.JLabel();
        userPanel2 = new javax.swing.JPanel();
        rankLabel12 = new javax.swing.JLabel();
        nameLabel12 = new javax.swing.JLabel();
        scoreLabel12 = new javax.swing.JLabel();
        userPanel3 = new javax.swing.JPanel();
        rankLabel13 = new javax.swing.JLabel();
        nameLabel13 = new javax.swing.JLabel();
        scoreLabel13 = new javax.swing.JLabel();
        userPanel4 = new javax.swing.JPanel();
        rankLabel14 = new javax.swing.JLabel();
        nameLabel14 = new javax.swing.JLabel();
        scoreLabel14 = new javax.swing.JLabel();
        userPanel5 = new javax.swing.JPanel();
        rankLabel15 = new javax.swing.JLabel();
        nameLabel15 = new javax.swing.JLabel();
        scoreLabel15 = new javax.swing.JLabel();
        userPanel6 = new javax.swing.JPanel();
        rankLabel16 = new javax.swing.JLabel();
        nameLabel16 = new javax.swing.JLabel();
        scoreLabel16 = new javax.swing.JLabel();
        userPanel7 = new javax.swing.JPanel();
        rankLabel17 = new javax.swing.JLabel();
        nameLabel17 = new javax.swing.JLabel();
        scoreLabel17 = new javax.swing.JLabel();
        userPanel8 = new javax.swing.JPanel();
        rankLabel18 = new javax.swing.JLabel();
        nameLabel18 = new javax.swing.JLabel();
        scoreLabel18 = new javax.swing.JLabel();
        userPanel9 = new javax.swing.JPanel();
        rankLabel19 = new javax.swing.JLabel();
        nameLabel19 = new javax.swing.JLabel();
        scoreLabel19 = new javax.swing.JLabel();
        userPanel10 = new javax.swing.JPanel();
        rankLabel20 = new javax.swing.JLabel();
        nameLabel20 = new javax.swing.JLabel();
        scoreLabel20 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        topicsPanel = new javax.swing.JPanel();
        topicsLabel = new javax.swing.JLabel();
        topicsSeperator = new javax.swing.JSeparator();
        t1 = new javax.swing.JCheckBox();
        t2 = new javax.swing.JCheckBox();
        t3 = new javax.swing.JCheckBox();
        t4 = new javax.swing.JCheckBox();
        t5 = new javax.swing.JCheckBox();
        t6 = new javax.swing.JCheckBox();
        t7 = new javax.swing.JCheckBox();
        t8 = new javax.swing.JCheckBox();
        t9 = new javax.swing.JCheckBox();
        t10 = new javax.swing.JCheckBox();
        t11 = new javax.swing.JCheckBox();
        nQPanel = new javax.swing.JPanel();
        nQLabel = new javax.swing.JLabel();
        nQField = new javax.swing.JTextField();
        bottomPanel = new javax.swing.JPanel();
        startQuizBtn = new javax.swing.JPanel();
        startQuizLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setPreferredSize(new java.awt.Dimension(1100, 650));

        bodyPanel.setBackground(new java.awt.Color(34, 43, 53));

        topPanel.setBackground(new java.awt.Color(34, 43, 53));

        userIcon.setFont(userIcon.getFont().deriveFont(userIcon.getFont().getSize()+5f));
        userIcon.setForeground(new java.awt.Color(242, 242, 242));
        userIcon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userIcon.setText("👤");

        usernameLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(242, 242, 242));
        usernameLabel.setText("Username");
        usernameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        usernameLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(34, 43, 53));
        mainPanel.setMinimumSize(new java.awt.Dimension(999, 500));
        mainPanel.setPreferredSize(new java.awt.Dimension(999, 500));
        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.LINE_AXIS));

        leftPanel.setBackground(new java.awt.Color(34, 43, 53));

        userPanel.setBackground(new java.awt.Color(60, 63, 66));
        userPanel.setForeground(new java.awt.Color(242, 242, 242));

        analyticsLabel.setBackground(new java.awt.Color(60, 63, 66));
        analyticsLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        analyticsLabel.setForeground(new java.awt.Color(242, 242, 242));
        analyticsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        analyticsLabel.setText("ANALYTICS");
        analyticsLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        analyticsLabel.setMaximumSize(new java.awt.Dimension(104, 29));
        analyticsLabel.setMinimumSize(new java.awt.Dimension(104, 29));

        analyticsSeperator.setBackground(new java.awt.Color(0, 0, 1));
        analyticsSeperator.setForeground(new java.awt.Color(0, 0, 1));

        bestScoreLabel.setBackground(new java.awt.Color(60, 63, 66));
        bestScoreLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        bestScoreLabel.setForeground(new java.awt.Color(242, 242, 242));
        bestScoreLabel.setText("Your Best Score:");

        bestScoreField.setBackground(new java.awt.Color(60, 63, 66));
        bestScoreField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        bestScoreField.setForeground(new java.awt.Color(242, 242, 242));
        bestScoreField.setText("0");

        timeSpentLabel.setBackground(new java.awt.Color(60, 63, 66));
        timeSpentLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        timeSpentLabel.setForeground(new java.awt.Color(242, 242, 242));
        timeSpentLabel.setText("Total Time Spent:");

        timeSpentField.setBackground(new java.awt.Color(60, 63, 66));
        timeSpentField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        timeSpentField.setForeground(new java.awt.Color(242, 242, 242));
        timeSpentField.setText("0 min");

        lastPlayedLabel.setBackground(new java.awt.Color(60, 63, 66));
        lastPlayedLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lastPlayedLabel.setForeground(new java.awt.Color(242, 242, 242));
        lastPlayedLabel.setText("Last Played on:");

        lastPlayedField.setBackground(new java.awt.Color(60, 63, 66));
        lastPlayedField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lastPlayedField.setForeground(new java.awt.Color(242, 242, 242));
        lastPlayedField.setText("-");

        latestScoreLabel.setBackground(new java.awt.Color(60, 63, 66));
        latestScoreLabel.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        latestScoreLabel.setForeground(new java.awt.Color(242, 242, 242));
        latestScoreLabel.setText("Your Latest Score:");

        lastestScoreField.setBackground(new java.awt.Color(60, 63, 66));
        lastestScoreField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lastestScoreField.setForeground(new java.awt.Color(242, 242, 242));
        lastestScoreField.setText("-");

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analyticsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(analyticsSeperator)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bestScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeSpentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(lastPlayedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(latestScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bestScoreField, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastPlayedField, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(lastestScoreField, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(timeSpentField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addComponent(analyticsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(analyticsSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bestScoreLabel)
                    .addComponent(bestScoreField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeSpentLabel)
                    .addComponent(timeSpentField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastPlayedLabel)
                    .addComponent(lastPlayedField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latestScoreLabel)
                    .addComponent(lastestScoreField))
                .addGap(0, 352, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(leftPanel);

        midPanel.setBackground(new java.awt.Color(34, 43, 53));

        leaderboardPanel.setBackground(new java.awt.Color(60, 63, 66));
        leaderboardPanel.setForeground(new java.awt.Color(242, 242, 242));

        leaderboardQLabel.setBackground(new java.awt.Color(60, 63, 66));
        leaderboardQLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        leaderboardQLabel.setForeground(new java.awt.Color(242, 242, 242));
        leaderboardQLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        leaderboardQLabel.setText("LEADERBOARD");
        leaderboardQLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        leaderboardQLabel.setMaximumSize(new java.awt.Dimension(112, 29));
        leaderboardQLabel.setMinimumSize(new java.awt.Dimension(112, 29));
        leaderboardQLabel.setPreferredSize(new java.awt.Dimension(112, 29));

        leaderboardSeparator.setBackground(new java.awt.Color(0, 0, 1));
        leaderboardSeparator.setForeground(new java.awt.Color(0, 0, 1));

        headingsPanel.setBackground(new java.awt.Color(60, 63, 66));
        headingsPanel.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel0.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel0.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel0.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel0.setText("Rank");

        nameLabel0.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel0.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel0.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel0.setText("Name");

        scoreLabel0.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel0.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel0.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel0.setText("Score");

        javax.swing.GroupLayout headingsPanelLayout = new javax.swing.GroupLayout(headingsPanel);
        headingsPanel.setLayout(headingsPanelLayout);
        headingsPanelLayout.setHorizontalGroup(
            headingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingsPanelLayout.createSequentialGroup()
                .addComponent(rankLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headingsPanelLayout.setVerticalGroup(
            headingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingsPanelLayout.createSequentialGroup()
                .addGroup(headingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel0)
                    .addComponent(nameLabel0)
                    .addComponent(scoreLabel0))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel1.setBackground(new java.awt.Color(60, 63, 66));
        userPanel1.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel11.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel11.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel11.setText("1");

        nameLabel11.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel11.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel11.setText("Name");

        scoreLabel11.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel11.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel11.setText("0");

        javax.swing.GroupLayout userPanel1Layout = new javax.swing.GroupLayout(userPanel1);
        userPanel1.setLayout(userPanel1Layout);
        userPanel1Layout.setHorizontalGroup(
            userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel1Layout.createSequentialGroup()
                .addComponent(rankLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel1Layout.setVerticalGroup(
            userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel1Layout.createSequentialGroup()
                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel11)
                    .addComponent(nameLabel11)
                    .addComponent(scoreLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel2.setBackground(new java.awt.Color(60, 63, 66));
        userPanel2.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel12.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel12.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel12.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel12.setText("2");

        nameLabel12.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel12.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel12.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel12.setText("Name");

        scoreLabel12.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel12.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel12.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel12.setText("0");

        javax.swing.GroupLayout userPanel2Layout = new javax.swing.GroupLayout(userPanel2);
        userPanel2.setLayout(userPanel2Layout);
        userPanel2Layout.setHorizontalGroup(
            userPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel2Layout.createSequentialGroup()
                .addComponent(rankLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel2Layout.setVerticalGroup(
            userPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel2Layout.createSequentialGroup()
                .addGroup(userPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel12)
                    .addComponent(nameLabel12)
                    .addComponent(scoreLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel3.setBackground(new java.awt.Color(60, 63, 66));
        userPanel3.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel13.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel13.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel13.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel13.setText("3");

        nameLabel13.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel13.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel13.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel13.setText("Name");

        scoreLabel13.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel13.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel13.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel13.setText("0");

        javax.swing.GroupLayout userPanel3Layout = new javax.swing.GroupLayout(userPanel3);
        userPanel3.setLayout(userPanel3Layout);
        userPanel3Layout.setHorizontalGroup(
            userPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel3Layout.createSequentialGroup()
                .addComponent(rankLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel3Layout.setVerticalGroup(
            userPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel3Layout.createSequentialGroup()
                .addGroup(userPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel13)
                    .addComponent(nameLabel13)
                    .addComponent(scoreLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel4.setBackground(new java.awt.Color(60, 63, 66));
        userPanel4.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel14.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel14.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel14.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel14.setText("4");

        nameLabel14.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel14.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel14.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel14.setText("Name");

        scoreLabel14.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel14.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel14.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel14.setText("0");

        javax.swing.GroupLayout userPanel4Layout = new javax.swing.GroupLayout(userPanel4);
        userPanel4.setLayout(userPanel4Layout);
        userPanel4Layout.setHorizontalGroup(
            userPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel4Layout.createSequentialGroup()
                .addComponent(rankLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel4Layout.setVerticalGroup(
            userPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel4Layout.createSequentialGroup()
                .addGroup(userPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel14)
                    .addComponent(nameLabel14)
                    .addComponent(scoreLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel5.setBackground(new java.awt.Color(60, 63, 66));
        userPanel5.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel15.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel15.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel15.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel15.setText("5");

        nameLabel15.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel15.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel15.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel15.setText("Name");

        scoreLabel15.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel15.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel15.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel15.setText("0");

        javax.swing.GroupLayout userPanel5Layout = new javax.swing.GroupLayout(userPanel5);
        userPanel5.setLayout(userPanel5Layout);
        userPanel5Layout.setHorizontalGroup(
            userPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel5Layout.createSequentialGroup()
                .addComponent(rankLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel5Layout.setVerticalGroup(
            userPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel5Layout.createSequentialGroup()
                .addGroup(userPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel15)
                    .addComponent(nameLabel15)
                    .addComponent(scoreLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel6.setBackground(new java.awt.Color(60, 63, 66));
        userPanel6.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel16.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel16.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel16.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel16.setText("6");

        nameLabel16.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel16.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel16.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel16.setText("Name");

        scoreLabel16.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel16.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel16.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel16.setText("0");

        javax.swing.GroupLayout userPanel6Layout = new javax.swing.GroupLayout(userPanel6);
        userPanel6.setLayout(userPanel6Layout);
        userPanel6Layout.setHorizontalGroup(
            userPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel6Layout.createSequentialGroup()
                .addComponent(rankLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel6Layout.setVerticalGroup(
            userPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel6Layout.createSequentialGroup()
                .addGroup(userPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel16)
                    .addComponent(nameLabel16)
                    .addComponent(scoreLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel7.setBackground(new java.awt.Color(60, 63, 66));
        userPanel7.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel17.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel17.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel17.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel17.setText("7");

        nameLabel17.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel17.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel17.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel17.setText("Name");

        scoreLabel17.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel17.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel17.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel17.setText("0");

        javax.swing.GroupLayout userPanel7Layout = new javax.swing.GroupLayout(userPanel7);
        userPanel7.setLayout(userPanel7Layout);
        userPanel7Layout.setHorizontalGroup(
            userPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel7Layout.createSequentialGroup()
                .addComponent(rankLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel7Layout.setVerticalGroup(
            userPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel7Layout.createSequentialGroup()
                .addGroup(userPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel17)
                    .addComponent(nameLabel17)
                    .addComponent(scoreLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel8.setBackground(new java.awt.Color(60, 63, 66));
        userPanel8.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel18.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel18.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel18.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel18.setText("8");

        nameLabel18.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel18.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel18.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel18.setText("Name");

        scoreLabel18.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel18.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel18.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel18.setText("0");

        javax.swing.GroupLayout userPanel8Layout = new javax.swing.GroupLayout(userPanel8);
        userPanel8.setLayout(userPanel8Layout);
        userPanel8Layout.setHorizontalGroup(
            userPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel8Layout.createSequentialGroup()
                .addComponent(rankLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel8Layout.setVerticalGroup(
            userPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel8Layout.createSequentialGroup()
                .addGroup(userPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel18)
                    .addComponent(nameLabel18)
                    .addComponent(scoreLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel9.setBackground(new java.awt.Color(60, 63, 66));
        userPanel9.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel19.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel19.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel19.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel19.setText("9");

        nameLabel19.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel19.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel19.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel19.setText("Name");

        scoreLabel19.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel19.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel19.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel19.setText("0");

        javax.swing.GroupLayout userPanel9Layout = new javax.swing.GroupLayout(userPanel9);
        userPanel9.setLayout(userPanel9Layout);
        userPanel9Layout.setHorizontalGroup(
            userPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel9Layout.createSequentialGroup()
                .addComponent(rankLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel9Layout.setVerticalGroup(
            userPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel9Layout.createSequentialGroup()
                .addGroup(userPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel19)
                    .addComponent(nameLabel19)
                    .addComponent(scoreLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel10.setBackground(new java.awt.Color(60, 63, 66));
        userPanel10.setForeground(new java.awt.Color(242, 242, 242));

        rankLabel20.setBackground(new java.awt.Color(60, 63, 66));
        rankLabel20.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        rankLabel20.setForeground(new java.awt.Color(242, 242, 242));
        rankLabel20.setText("10");

        nameLabel20.setBackground(new java.awt.Color(60, 63, 66));
        nameLabel20.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nameLabel20.setForeground(new java.awt.Color(242, 242, 242));
        nameLabel20.setText("Name");

        scoreLabel20.setBackground(new java.awt.Color(60, 63, 66));
        scoreLabel20.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        scoreLabel20.setForeground(new java.awt.Color(242, 242, 242));
        scoreLabel20.setText("0");

        javax.swing.GroupLayout userPanel10Layout = new javax.swing.GroupLayout(userPanel10);
        userPanel10.setLayout(userPanel10Layout);
        userPanel10Layout.setHorizontalGroup(
            userPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel10Layout.createSequentialGroup()
                .addComponent(rankLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userPanel10Layout.setVerticalGroup(
            userPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanel10Layout.createSequentialGroup()
                .addGroup(userPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel20)
                    .addComponent(nameLabel20)
                    .addComponent(scoreLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout leaderboardPanelLayout = new javax.swing.GroupLayout(leaderboardPanel);
        leaderboardPanel.setLayout(leaderboardPanelLayout);
        leaderboardPanelLayout.setHorizontalGroup(
            leaderboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaderboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leaderboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leaderboardQLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leaderboardSeparator)
                    .addComponent(headingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leaderboardPanelLayout.setVerticalGroup(
            leaderboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaderboardPanelLayout.createSequentialGroup()
                .addComponent(leaderboardQLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(leaderboardSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout midPanelLayout = new javax.swing.GroupLayout(midPanel);
        midPanel.setLayout(midPanelLayout);
        midPanelLayout.setHorizontalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leaderboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        midPanelLayout.setVerticalGroup(
            midPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leaderboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(midPanel);

        rightPanel.setBackground(new java.awt.Color(34, 43, 53));

        topicsPanel.setBackground(new java.awt.Color(60, 63, 66));
        topicsPanel.setForeground(new java.awt.Color(242, 242, 242));

        topicsLabel.setBackground(new java.awt.Color(60, 63, 66));
        topicsLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        topicsLabel.setForeground(new java.awt.Color(242, 242, 242));
        topicsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topicsLabel.setText("TOPICS");
        topicsLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        topicsLabel.setMaximumSize(new java.awt.Dimension(55, 29));
        topicsLabel.setMinimumSize(new java.awt.Dimension(55, 29));
        topicsLabel.setPreferredSize(new java.awt.Dimension(55, 29));

        topicsSeperator.setBackground(new java.awt.Color(0, 0, 1));
        topicsSeperator.setForeground(new java.awt.Color(0, 0, 1));

        t1.setBackground(new java.awt.Color(60, 63, 66));
        t1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t1.setForeground(new java.awt.Color(242, 242, 242));
        t1.setText("C");

        t2.setBackground(new java.awt.Color(60, 63, 66));
        t2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t2.setForeground(new java.awt.Color(242, 242, 242));
        t2.setText("C++");

        t3.setBackground(new java.awt.Color(60, 63, 66));
        t3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t3.setForeground(new java.awt.Color(242, 242, 242));
        t3.setText("C#");

        t4.setBackground(new java.awt.Color(60, 63, 66));
        t4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t4.setForeground(new java.awt.Color(242, 242, 242));
        t4.setText("Python");

        t5.setBackground(new java.awt.Color(60, 63, 66));
        t5.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t5.setForeground(new java.awt.Color(242, 242, 242));
        t5.setText("Java");

        t6.setBackground(new java.awt.Color(60, 63, 66));
        t6.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t6.setForeground(new java.awt.Color(242, 242, 242));
        t6.setText("Kotlin");

        t7.setBackground(new java.awt.Color(60, 63, 66));
        t7.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t7.setForeground(new java.awt.Color(242, 242, 242));
        t7.setText("Swift");

        t8.setBackground(new java.awt.Color(60, 63, 66));
        t8.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t8.setForeground(new java.awt.Color(242, 242, 242));
        t8.setText("MySQL");

        t9.setBackground(new java.awt.Color(60, 63, 66));
        t9.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t9.setForeground(new java.awt.Color(242, 242, 242));
        t9.setText("HTML");

        t10.setBackground(new java.awt.Color(60, 63, 66));
        t10.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t10.setForeground(new java.awt.Color(242, 242, 242));
        t10.setText("CSS");

        t11.setBackground(new java.awt.Color(60, 63, 66));
        t11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        t11.setForeground(new java.awt.Color(242, 242, 242));
        t11.setText("JS (Java Script)");

        javax.swing.GroupLayout topicsPanelLayout = new javax.swing.GroupLayout(topicsPanel);
        topicsPanel.setLayout(topicsPanelLayout);
        topicsPanelLayout.setHorizontalGroup(
            topicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topicsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t11, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(t7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topicsSeperator)
                    .addComponent(topicsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        topicsPanelLayout.setVerticalGroup(
            topicsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topicsPanelLayout.createSequentialGroup()
                .addComponent(topicsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(topicsSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        nQPanel.setBackground(new java.awt.Color(60, 63, 66));
        nQPanel.setForeground(new java.awt.Color(242, 242, 242));

        nQLabel.setBackground(new java.awt.Color(60, 63, 66));
        nQLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nQLabel.setForeground(new java.awt.Color(242, 242, 242));
        nQLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nQLabel.setText("Number of Questions");

        nQField.setBackground(new java.awt.Color(72, 75, 80));
        nQField.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        nQField.setForeground(new java.awt.Color(242, 242, 242));
        nQField.setText("10");
        nQField.setMaximumSize(new java.awt.Dimension(70, 29));
        nQField.setMinimumSize(new java.awt.Dimension(64, 29));
        nQField.setPreferredSize(new java.awt.Dimension(64, 29));

        javax.swing.GroupLayout nQPanelLayout = new javax.swing.GroupLayout(nQPanel);
        nQPanel.setLayout(nQPanelLayout);
        nQPanelLayout.setHorizontalGroup(
            nQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nQPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nQLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nQField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nQPanelLayout.setVerticalGroup(
            nQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nQPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nQLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nQField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(nQPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(topicsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topicsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nQPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(rightPanel);

        bottomPanel.setBackground(new java.awt.Color(34, 43, 53));
        bottomPanel.setMinimumSize(new java.awt.Dimension(999, 40));
        bottomPanel.setPreferredSize(new java.awt.Dimension(999, 40));

        startQuizBtn.setBackground(new java.awt.Color(60, 63, 66));
        startQuizBtn.setForeground(new java.awt.Color(242, 242, 242));
        startQuizBtn.setMaximumSize(new java.awt.Dimension(155, 30));
        startQuizBtn.setMinimumSize(new java.awt.Dimension(155, 30));
        startQuizBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startQuizBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startQuizBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startQuizBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                startQuizBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                startQuizBtnMouseReleased(evt);
            }
        });

        startQuizLabel.setBackground(new java.awt.Color(242, 242, 242));
        startQuizLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        startQuizLabel.setForeground(new java.awt.Color(242, 242, 242));
        startQuizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startQuizLabel.setText("Begin Quiz");

        javax.swing.GroupLayout startQuizBtnLayout = new javax.swing.GroupLayout(startQuizBtn);
        startQuizBtn.setLayout(startQuizBtnLayout);
        startQuizBtnLayout.setHorizontalGroup(
            startQuizBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startQuizBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startQuizLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        startQuizBtnLayout.setVerticalGroup(
            startQuizBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startQuizBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startQuizLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startQuizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addComponent(startQuizBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startQuizBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMouseClicked
        getTopics();
        initGameWin();
        nQ = Integer.parseInt(nQField.getText());
        this.dispose();
        gameWindow.setVisible(true);
        
    }//GEN-LAST:event_startQuizBtnMouseClicked

    private void startQuizBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMouseEntered
        startQuizBtn.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_startQuizBtnMouseEntered

    private void startQuizBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMouseExited
        startQuizBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_startQuizBtnMouseExited

    private void startQuizBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMousePressed
        startQuizBtn.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_startQuizBtnMousePressed

    private void startQuizBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startQuizBtnMouseReleased
        startQuizBtn.setBackground(new java.awt.Color(60, 63, 66));
    }//GEN-LAST:event_startQuizBtnMouseReleased

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analyticsLabel;
    private javax.swing.JSeparator analyticsSeperator;
    private javax.swing.JLabel bestScoreField;
    private javax.swing.JLabel bestScoreLabel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel headingsPanel;
    private javax.swing.JLabel lastPlayedField;
    private javax.swing.JLabel lastPlayedLabel;
    private javax.swing.JLabel lastestScoreField;
    private javax.swing.JLabel latestScoreLabel;
    private javax.swing.JPanel leaderboardPanel;
    private javax.swing.JLabel leaderboardQLabel;
    private javax.swing.JSeparator leaderboardSeparator;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel midPanel;
    private javax.swing.JTextField nQField;
    private javax.swing.JLabel nQLabel;
    private javax.swing.JPanel nQPanel;
    private javax.swing.JLabel nameLabel0;
    private javax.swing.JLabel nameLabel11;
    private javax.swing.JLabel nameLabel12;
    private javax.swing.JLabel nameLabel13;
    private javax.swing.JLabel nameLabel14;
    private javax.swing.JLabel nameLabel15;
    private javax.swing.JLabel nameLabel16;
    private javax.swing.JLabel nameLabel17;
    private javax.swing.JLabel nameLabel18;
    private javax.swing.JLabel nameLabel19;
    private javax.swing.JLabel nameLabel20;
    private javax.swing.JLabel rankLabel0;
    private javax.swing.JLabel rankLabel11;
    private javax.swing.JLabel rankLabel12;
    private javax.swing.JLabel rankLabel13;
    private javax.swing.JLabel rankLabel14;
    private javax.swing.JLabel rankLabel15;
    private javax.swing.JLabel rankLabel16;
    private javax.swing.JLabel rankLabel17;
    private javax.swing.JLabel rankLabel18;
    private javax.swing.JLabel rankLabel19;
    private javax.swing.JLabel rankLabel20;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel scoreLabel0;
    private javax.swing.JLabel scoreLabel11;
    private javax.swing.JLabel scoreLabel12;
    private javax.swing.JLabel scoreLabel13;
    private javax.swing.JLabel scoreLabel14;
    private javax.swing.JLabel scoreLabel15;
    private javax.swing.JLabel scoreLabel16;
    private javax.swing.JLabel scoreLabel17;
    private javax.swing.JLabel scoreLabel18;
    private javax.swing.JLabel scoreLabel19;
    private javax.swing.JLabel scoreLabel20;
    private javax.swing.JPanel startQuizBtn;
    private javax.swing.JLabel startQuizLabel;
    private javax.swing.JCheckBox t1;
    private javax.swing.JCheckBox t10;
    private javax.swing.JCheckBox t11;
    private javax.swing.JCheckBox t2;
    private javax.swing.JCheckBox t3;
    private javax.swing.JCheckBox t4;
    private javax.swing.JCheckBox t5;
    private javax.swing.JCheckBox t6;
    private javax.swing.JCheckBox t7;
    private javax.swing.JCheckBox t8;
    private javax.swing.JCheckBox t9;
    private javax.swing.JLabel timeSpentField;
    private javax.swing.JLabel timeSpentLabel;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel topicsLabel;
    private javax.swing.JPanel topicsPanel;
    private javax.swing.JSeparator topicsSeperator;
    private javax.swing.JLabel userIcon;
    private javax.swing.JPanel userPanel;
    private javax.swing.JPanel userPanel1;
    private javax.swing.JPanel userPanel10;
    private javax.swing.JPanel userPanel2;
    private javax.swing.JPanel userPanel3;
    private javax.swing.JPanel userPanel4;
    private javax.swing.JPanel userPanel5;
    private javax.swing.JPanel userPanel6;
    private javax.swing.JPanel userPanel7;
    private javax.swing.JPanel userPanel8;
    private javax.swing.JPanel userPanel9;
    public javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
