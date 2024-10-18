package leonidova;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JFrame {
    private JLabel imageLabel;
    private Timer timer;
    private int currentFrame = 0;
    private String[] frames = {"frame1.png", "frame2.png", "frame3.png", "frame4.png"};

    public Animation() {
        imageLabel = new JLabel(new ImageIcon(frames[currentFrame]));
        add(imageLabel);

        timer = new Timer(200, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                imageLabel.setIcon(new ImageIcon(frames[currentFrame]));
            }
        });

        timer.start();

        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Animation();
    }
}
