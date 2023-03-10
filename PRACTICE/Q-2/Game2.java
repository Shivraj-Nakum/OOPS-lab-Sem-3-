import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Source -> Frame

class Game2 extends JFrame implements MouseListener,MouseMotionListener
{
    int x=0;
    int y=0;
    JLabel lbl = new JLabel("Hello");

    public Game2()
    {
        setTitle("GUI-KeyEvents");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new drawPanel());
        setVisible(true);
        this.addMouseListener(this);       //Since Our Source Is The Frame
        this.addMouseMotionListener(this); //Since Our Source Is The Frame
        add(lbl);
    }

    class drawPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {

        }
    }

    public void mousePressed(java.awt.event.MouseEvent ke){}

    public void mouseClicked(java.awt.event.MouseEvent ke){
        x = ke.getX();
        y = ke.getY();

        Graphics g =getGraphics();
        g.setColor(Color.RED);
        g.fillOval(x,y,40,40);
        lbl.setText(" ");
        lbl.setText(ke.getX()+" "+ke.getY());
    }
    public void mouseReleased(java.awt.event.MouseEvent ke){

    }
    public void mouseEntered(java.awt.event.MouseEvent ke){

    }
    public void mouseExited(java.awt.event.MouseEvent ke){

    }
    public void mouseDragged(java.awt.event.MouseEvent ke)
    {
        x = ke.getX();
        y = ke.getY();

        Graphics g =getGraphics();
        g.setColor(Color.GREEN);
        g.fillOval(x,y,40,40);

        lbl.setText("Mouse Clicked At " + x + " " + y);
    }
    public void mouseMoved(java.awt.event.MouseEvent ke)
    {
        
    }

    public static void main(String args[])
    {
        Game2 ob = new Game2();
    }
}

