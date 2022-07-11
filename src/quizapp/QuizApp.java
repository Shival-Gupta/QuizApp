package quizapp;

public class QuizApp extends javax.swing.JFrame {
    
    LoginWindow loginWindow = new LoginWindow();
    Home homeWindow = new Home();
    SignUpWindow signUpWindow = new SignUpWindow();

    public static void main(String[] args) {
        QuizApp app = new QuizApp();
        app.loginWindow.setVisible(true);
    }
    
}
