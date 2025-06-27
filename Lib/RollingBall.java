package Lib;
import javax.swing.*;
import java.awt.*;

public class RollingBall extends JPanel {
    private int x = 0, y = 0;
    private int BALL_SIZE = 50;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x, y, BALL_SIZE, BALL_SIZE);
        g.fillArc(x, y, BALL_SIZE, BALL_SIZE, 0, 180);
    }

}

