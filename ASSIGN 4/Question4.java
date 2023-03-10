import javax.swing.*;

class Question4 { 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Question 4");
        frame.setSize(300, 300);
        frame.add(new JTextField("Hello, World"));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}