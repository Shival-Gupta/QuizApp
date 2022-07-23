package quizapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import quizbyavengers.QuizWin;

public class GameWin extends QuizApp {
    
    private boolean btnExitCheck=true; //Next Button
    
    private String ques, a, b, c, d, ans, selectedTopic;
    private int qid=-1, qno=0;

    public GameWin() {
        initComponents();
        nextQuestion();
    }
    
    public static String getRandom(ArrayList<String> list) {
        String r = "";
        try{
            r = list.get(new Random().nextInt(list.size()));
        }
        catch(Exception e){}
        return r;
    }
    
    private void nextQuestion(){
        try {
            selectedTopic = getRandom(topics);
            
            sql = "SELECT * FROM `questions` WHERE `Topic` = ? ORDER BY RAND() LIMIT 1;";
            ps = con.prepareStatement(sql);
            ps.setString(1, selectedTopic);
            rs = ps.executeQuery();
            
            System.out.println("Topic: "+selectedTopic);
            
            if (rs.next()){
                System.out.println("\nNext Question on "+selectedTopic+" true");
                
                qid = rs.getInt("ID");
                ques = rs.getString("Question").trim();
                a = rs.getString("Option_A").trim();
                b = rs.getString("Option_B").trim();
                c = rs.getString("Option_C").trim();
                d = rs.getString("Option_D").trim();
                ans = rs.getString("Correct_Option").trim();
                
                qno++;
                
                qNo.setText(""+qno);
                question.setText(ques);
                optionA.setText(a);
                optionB.setText(b);
                optionC.setText(c);
                optionD.setText(d);
            }
            else
                System.out.println("\nNext Question on "+selectedTopic+" false");
        }
        catch(SQLException ex) {
            System.out.println("\tError: "+ex);
            Logger.getLogger(QuizWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsBG = new javax.swing.ButtonGroup();
        bodyPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        timerPanel = new javax.swing.JPanel();
        timerLabel = new javax.swing.JLabel();
        QuestionsPanel = new javax.swing.JPanel();
        questionPanel = new javax.swing.JPanel();
        qNo = new javax.swing.JLabel();
        question = new javax.swing.JLabel();
        optionPanelA = new javax.swing.JPanel();
        oA = new javax.swing.JRadioButton();
        optionA = new javax.swing.JLabel();
        optionPanelB = new javax.swing.JPanel();
        oB = new javax.swing.JRadioButton();
        optionB = new javax.swing.JLabel();
        optionPanelC = new javax.swing.JPanel();
        oC = new javax.swing.JRadioButton();
        optionC = new javax.swing.JLabel();
        optionPanelD = new javax.swing.JPanel();
        oD = new javax.swing.JRadioButton();
        optionD = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        nextBtn = new javax.swing.JPanel();
        nextBtnLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        bodyPanel.setBackground(new java.awt.Color(34, 43, 53));
        bodyPanel.setForeground(new java.awt.Color(242, 242, 242));

        topPanel.setBackground(new java.awt.Color(34, 43, 53));
        topPanel.setForeground(new java.awt.Color(242, 242, 242));

        timerPanel.setBackground(new java.awt.Color(34, 43, 53));
        timerPanel.setForeground(new java.awt.Color(242, 242, 242));

        timerLabel.setBackground(new java.awt.Color(60, 63, 66));
        timerLabel.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(242, 242, 242));
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("99");

        javax.swing.GroupLayout timerPanelLayout = new javax.swing.GroupLayout(timerPanel);
        timerPanel.setLayout(timerPanelLayout);
        timerPanelLayout.setHorizontalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        );
        timerPanelLayout.setVerticalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap(387, Short.MAX_VALUE)
                .addComponent(timerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        QuestionsPanel.setBackground(new java.awt.Color(34, 43, 53));
        QuestionsPanel.setForeground(new java.awt.Color(242, 242, 242));

        questionPanel.setBackground(new java.awt.Color(34, 43, 53));
        questionPanel.setForeground(new java.awt.Color(242, 242, 242));

        qNo.setBackground(new java.awt.Color(60, 63, 66));
        qNo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        qNo.setForeground(new java.awt.Color(242, 242, 242));
        qNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qNo.setText("1");

        question.setBackground(new java.awt.Color(60, 63, 66));
        question.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        question.setForeground(new java.awt.Color(242, 242, 242));
        question.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        question.setText("Question");

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qNo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        optionPanelA.setBackground(new java.awt.Color(34, 43, 53));
        optionPanelA.setForeground(new java.awt.Color(242, 242, 242));
        optionPanelA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                optionPanelAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                optionPanelAMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                optionPanelAMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                optionPanelAMouseReleased(evt);
            }
        });

        oA.setBackground(new java.awt.Color(34, 43, 53));
        optionsBG.add(oA);
        oA.setForeground(new java.awt.Color(242, 242, 242));
        oA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        optionA.setBackground(new java.awt.Color(60, 63, 66));
        optionA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        optionA.setForeground(new java.awt.Color(242, 242, 242));
        optionA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        optionA.setText("Option A");

        javax.swing.GroupLayout optionPanelALayout = new javax.swing.GroupLayout(optionPanelA);
        optionPanelA.setLayout(optionPanelALayout);
        optionPanelALayout.setHorizontalGroup(
            optionPanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        optionPanelALayout.setVerticalGroup(
            optionPanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionPanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionA, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(oA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        optionPanelB.setBackground(new java.awt.Color(34, 43, 53));
        optionPanelB.setForeground(new java.awt.Color(242, 242, 242));
        optionPanelB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                optionPanelBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                optionPanelBMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                optionPanelBMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                optionPanelBMouseReleased(evt);
            }
        });

        oB.setBackground(new java.awt.Color(34, 43, 53));
        optionsBG.add(oB);
        oB.setForeground(new java.awt.Color(242, 242, 242));
        oB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        optionB.setBackground(new java.awt.Color(60, 63, 66));
        optionB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        optionB.setForeground(new java.awt.Color(242, 242, 242));
        optionB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        optionB.setText("Option B");

        javax.swing.GroupLayout optionPanelBLayout = new javax.swing.GroupLayout(optionPanelB);
        optionPanelB.setLayout(optionPanelBLayout);
        optionPanelBLayout.setHorizontalGroup(
            optionPanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        optionPanelBLayout.setVerticalGroup(
            optionPanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionPanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionB, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(oB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        optionPanelC.setBackground(new java.awt.Color(34, 43, 53));
        optionPanelC.setForeground(new java.awt.Color(242, 242, 242));
        optionPanelC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                optionPanelCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                optionPanelCMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                optionPanelCMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                optionPanelCMouseReleased(evt);
            }
        });

        oC.setBackground(new java.awt.Color(34, 43, 53));
        optionsBG.add(oC);
        oC.setForeground(new java.awt.Color(242, 242, 242));
        oC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        optionC.setBackground(new java.awt.Color(60, 63, 66));
        optionC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        optionC.setForeground(new java.awt.Color(242, 242, 242));
        optionC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        optionC.setText("Option C");

        javax.swing.GroupLayout optionPanelCLayout = new javax.swing.GroupLayout(optionPanelC);
        optionPanelC.setLayout(optionPanelCLayout);
        optionPanelCLayout.setHorizontalGroup(
            optionPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        optionPanelCLayout.setVerticalGroup(
            optionPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionPanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionC, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(oC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        optionPanelD.setBackground(new java.awt.Color(34, 43, 53));
        optionPanelD.setForeground(new java.awt.Color(242, 242, 242));
        optionPanelD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                optionPanelDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                optionPanelDMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                optionPanelDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                optionPanelDMouseReleased(evt);
            }
        });

        oD.setBackground(new java.awt.Color(34, 43, 53));
        optionsBG.add(oD);
        oD.setForeground(new java.awt.Color(242, 242, 242));
        oD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        optionD.setBackground(new java.awt.Color(60, 63, 66));
        optionD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        optionD.setForeground(new java.awt.Color(242, 242, 242));
        optionD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        optionD.setText("Option D");

        javax.swing.GroupLayout optionPanelDLayout = new javax.swing.GroupLayout(optionPanelD);
        optionPanelD.setLayout(optionPanelDLayout);
        optionPanelDLayout.setHorizontalGroup(
            optionPanelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        optionPanelDLayout.setVerticalGroup(
            optionPanelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionPanelDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionPanelDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionD, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(oD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout QuestionsPanelLayout = new javax.swing.GroupLayout(QuestionsPanel);
        QuestionsPanel.setLayout(QuestionsPanelLayout);
        QuestionsPanelLayout.setHorizontalGroup(
            QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(questionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionPanelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionPanelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionPanelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(optionPanelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        QuestionsPanelLayout.setVerticalGroup(
            QuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionsPanelLayout.createSequentialGroup()
                .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionPanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionPanelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionPanelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionPanelD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(34, 43, 53));
        bottomPanel.setForeground(new java.awt.Color(242, 242, 242));

        nextBtn.setBackground(new java.awt.Color(60, 63, 66));
        nextBtn.setForeground(new java.awt.Color(242, 242, 242));
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nextBtnMouseReleased(evt);
            }
        });

        nextBtnLabel.setBackground(new java.awt.Color(60, 63, 66));
        nextBtnLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nextBtnLabel.setForeground(new java.awt.Color(242, 242, 242));
        nextBtnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextBtnLabel.setText("NEXT");

        javax.swing.GroupLayout nextBtnLayout = new javax.swing.GroupLayout(nextBtn);
        nextBtn.setLayout(nextBtnLayout);
        nextBtnLayout.setHorizontalGroup(
            nextBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nextBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        nextBtnLayout.setVerticalGroup(
            nextBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nextBtnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addComponent(nextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QuestionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(QuestionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(bodyPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseEntered
        nextBtn.setBackground(new java.awt.Color(26, 28, 29));
        btnExitCheck=false;
    }//GEN-LAST:event_nextBtnMouseEntered

    private void nextBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseExited
        nextBtn.setBackground(new java.awt.Color(60, 63, 66));
        btnExitCheck=true;
    }//GEN-LAST:event_nextBtnMouseExited

    private void nextBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMousePressed
        nextBtn.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_nextBtnMousePressed

    private void nextBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseReleased
        if(btnExitCheck)
            nextBtn.setBackground(new java.awt.Color(60, 63, 66));
        else
            nextBtn.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_nextBtnMouseReleased

    private void optionPanelAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelAMouseEntered
        optionPanelA.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_optionPanelAMouseEntered

    private void optionPanelAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelAMouseExited
        optionPanelA.setBackground(new java.awt.Color(34, 43, 53));
    }//GEN-LAST:event_optionPanelAMouseExited

    private void optionPanelAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelAMousePressed
        optionPanelA.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_optionPanelAMousePressed

    private void optionPanelAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelAMouseReleased
        optionPanelA.setBackground(new java.awt.Color(34, 43, 53));
    }//GEN-LAST:event_optionPanelAMouseReleased

    private void optionPanelBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelBMouseEntered
        optionPanelB.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_optionPanelBMouseEntered

    private void optionPanelBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelBMouseExited
        optionPanelB.setBackground(new java.awt.Color(34, 43, 53));
    }//GEN-LAST:event_optionPanelBMouseExited

    private void optionPanelBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelBMousePressed
        optionPanelB.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_optionPanelBMousePressed

    private void optionPanelBMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelBMouseReleased
        optionPanelB.setBackground(new java.awt.Color(34, 43, 53));
    }//GEN-LAST:event_optionPanelBMouseReleased

    private void optionPanelCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelCMouseEntered
        optionPanelC.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_optionPanelCMouseEntered

    private void optionPanelCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelCMouseExited
        optionPanelC.setBackground(new java.awt.Color(34, 43, 53));
    }//GEN-LAST:event_optionPanelCMouseExited

    private void optionPanelCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelCMousePressed
        optionPanelC.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_optionPanelCMousePressed

    private void optionPanelCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelCMouseReleased
        optionPanelC.setBackground(new java.awt.Color(34, 43, 53));
    }//GEN-LAST:event_optionPanelCMouseReleased

    private void optionPanelDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelDMouseEntered
        optionPanelD.setBackground(new java.awt.Color(26, 28, 29));
    }//GEN-LAST:event_optionPanelDMouseEntered

    private void optionPanelDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelDMouseExited
        optionPanelD.setBackground(new java.awt.Color(34, 43, 53));
    }//GEN-LAST:event_optionPanelDMouseExited

    private void optionPanelDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelDMousePressed
        optionPanelD.setBackground(new java.awt.Color(17, 18, 19));
    }//GEN-LAST:event_optionPanelDMousePressed

    private void optionPanelDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionPanelDMouseReleased
        optionPanelD.setBackground(new java.awt.Color(34, 43, 53));
    }//GEN-LAST:event_optionPanelDMouseReleased

    private void nextBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseClicked
        nextQuestion();
    }//GEN-LAST:event_nextBtnMouseClicked

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
            java.util.logging.Logger.getLogger(GameWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QuestionsPanel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel nextBtn;
    private javax.swing.JLabel nextBtnLabel;
    private javax.swing.JRadioButton oA;
    private javax.swing.JRadioButton oB;
    private javax.swing.JRadioButton oC;
    private javax.swing.JRadioButton oD;
    private javax.swing.JLabel optionA;
    private javax.swing.JLabel optionB;
    private javax.swing.JLabel optionC;
    private javax.swing.JLabel optionD;
    private javax.swing.JPanel optionPanelA;
    private javax.swing.JPanel optionPanelB;
    private javax.swing.JPanel optionPanelC;
    private javax.swing.JPanel optionPanelD;
    private javax.swing.ButtonGroup optionsBG;
    private javax.swing.JLabel qNo;
    private javax.swing.JLabel question;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JPanel timerPanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
