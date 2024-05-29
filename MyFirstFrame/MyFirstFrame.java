package MyFirstFrame;

import javax.swing.*;
import java.awt.*;

public class MyFirstFrame {
    public static void main(String[] args) {
        JFrame frame =new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700,500);
//        frame.setLocation(100,50);
        frame.setBounds(100,50,700,500);
        frame.setTitle("My First Frame");

        ImageIcon icon =new ImageIcon("java-logo-vert-blk.png");
        frame.setIconImage(icon.getImage());

        Container c =frame.getContentPane();
        c.setBackground(Color.RED);

        frame.setResizable(false);

        frame.setVisible(true);
    }

}
