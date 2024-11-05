package Solution;

import javax.swing.*;
import java.awt.*;

public class Unhappy extends JFrame
{
    public Unhappy()
    {
        super("Unhappy Face");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        
        // Set up for unhappy face
        g.setColor(Color.RED);
        
        // Draw face circle
        g.fillOval(100, 100, 200, 200);

        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(150, 150, 20, 20); // Left eye
        g.fillOval(230, 150, 20, 20); // Right eye
        
        // Draw mouth (frown)
        g.drawArc(150, 210, 100, 50, 0, 180);
    }

    public static void main(String[] args)
    {
        new Unhappy();
    }
}
