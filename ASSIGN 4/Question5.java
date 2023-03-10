import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Question5 {
    public static void main(String[] args) {
        new Question5();
    }

    ActionListener e=new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"You have clicked the button");
        }
    };
    public Question5() {
        JFrame f = new JFrame();
        JButton b1 = new JButton();
        b1.setText("CLICK ME");
        b1.addActionListener(e);
        f.add(b1);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}