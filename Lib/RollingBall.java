package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollingBall extends JPanel implements ActionListener {
    private int x = 0, y = 0;
    private int BALL_SIZE = 50;
    private int start_angle = 0;

    public RollingBall(){
        Timer timer = new Timer(30, this);
        timer.start();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        y = (getHeight() - BALL_SIZE)/2;
        
        g.drawOval(x, y, BALL_SIZE, BALL_SIZE);
        g.fillArc(x, y, BALL_SIZE, BALL_SIZE, start_angle, 180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x-2;
        if(x < -BALL_SIZE) x = getWidth()+BALL_SIZE;
        start_angle += 2;
        repaint();
    }

}

