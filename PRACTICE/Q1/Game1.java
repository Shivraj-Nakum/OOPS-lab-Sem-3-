import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Game1 implements KeyListener
{
    JFrame myFrame;
    int x;
    int y;
   
    public void initGUI()
    {
        myFrame = new JFrame();
        x= 50;
        y = 50;
        myFrame.setTitle("GUI KEY EVENT");
        myFrame.setSize(300,300);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setContentPane(new drawPanel());
        myFrame.addKeyListener(this);
        myFrame.setVisible(true);
        

    }
    
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyChar() == 'W'||e.getKeyChar() == 'w')
        {
            if(y>0)
            {
                y-=10;
                myFrame.repaint();  
            }

        }
        if(e.getKeyChar() == 'A'|| e.getKeyChar() == 'a')
        {
            if(x>0)
            {
                x-=10;
                myFrame.repaint();
            }

        }
        if(e.getKeyChar() == 'D'|| e.getKeyChar() == 'd')
        {
            if(x<240)
            {
                x+=10;
                myFrame.repaint();
            }

        }
        if(e.getKeyChar() == 'S'|| e.getKeyChar() == 's')
        {
            if(y<240)
            {
                y+=10;
                myFrame.repaint();
            }

        }
    }
    
    public void keyTyped(KeyEvent e){}

    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            y-=20;
            myFrame.repaint();  
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            y+=20;
            myFrame.repaint();  
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            x+=20;
            myFrame.repaint();  
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            x-=20;
            myFrame.repaint();  
        }
    }
    class drawPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            g.setColor(Color.BLUE);
            g.fillOval(x,y,60,40);
        }
    }
    public Game1()
    {
        initGUI();
    }
    public static void main(String[] args) {
        Game1 ap = new Game1();
    }
} 
