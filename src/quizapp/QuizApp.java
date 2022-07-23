package quizapp;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

public class QuizApp extends javax.swing.JFrame{
    
    public static void main(String[] args) {
        loginWindow.setVisible(true);
    }
    
    public static LoginWin loginWindow = new LoginWin();
    public static SignUpWin signUpWindow = new SignUpWin();
    public static HomeWin homeWindow;
    public static GameWin gameWindow;
    
    public static String sql = "";
    public static Connection con;
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static String uid = "userID", pwd = "", name = "Username", sex = "N", dob = "", mail = "", state = "", country = "";
    public static int highScore = 0;
    public static boolean loginStatus=false;
    
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    
    public static ArrayList<String> topics = new ArrayList<String>();
    public int nQ;
    
    public static void initHomeWin(){
        homeWindow = new HomeWin();
    }
    
    public static void initGameWin(){
        gameWindow = new GameWin();
    }
    
    public static void checkConnection(){
        try {
            sql = "select * from users";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizapp", "root", "");
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("Database Connected!");
        }
        catch (Exception e) {
            System.out.println("Database Connection Unsuccesfull!");
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "<Html>Database connection unsuccesfull,<BR>"
                    + "Restart the program or contact developer.</HTML>", 
                    "Database Connection Unsuccesfull", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
}
