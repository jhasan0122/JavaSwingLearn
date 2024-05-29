package WelcomeScreenJWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreenJWindowExp extends JFrame {
    WelcomeScreenJWindowExp()
    {
        displayWelcomeScreen();
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label=new JLabel("Welcome to Java Programming");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);

//        setVisible(true);
    }

    private void displayWelcomeScreen() {
        final JWindow w=new JWindow(this);
        w.setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        w.setVisible(true);

        JPanel panel=new JPanel();
        w.add(panel);

        String impagePath="F:\\JAVA\\JavaSwingProject\\untitled\\src\\WelcomeScreenJWindow\\337-3378323_twitter-facebook-youtube-twitch-twitter-square-logo-png.png";
        JLabel label=new JLabel(new ImageIcon(impagePath));
        panel.setBackground(Color.white);
        panel.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);


        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JProgressBar progressBar=new JProgressBar(0,100);
        progressBar.setForeground(Color.ORANGE);
        w.add(BorderLayout.PAGE_END,progressBar);

        timer=new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=progressBar.getValue();
                if(x==100)
                {
                    w.dispose();
                    WelcomeScreenJWindowExp.this.setVisible(true);
                    timer.stop();
                }
                else
                {
                    progressBar.setValue(x+4);

                }
            }
        });
        timer.start();
    }

    Timer timer;

    public static void main(String[] args) {

        new WelcomeScreenJWindowExp();
    }
}
