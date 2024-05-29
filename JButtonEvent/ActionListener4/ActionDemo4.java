package JButtonEvent.ActionListener4;

import javax.swing.*;
import java.awt.*;

public class ActionDemo4 {
    public static Container c;
    public static void main(String[] args) {

        JFrame frame=new JFrame("ActionDemo");
        frame.setBounds(100,100,700,500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c=frame.getContentPane();
        c.setLayout(null);

        JButton red=new JButton("Red");
        JButton yellow=new JButton("Yellow");
        JButton green=new JButton("Green");

        red.setBounds(100,100,100,50);
        yellow.setBounds(250,100,100,50);
        green.setBounds(400,100,100,50);

        c.add(red);
        c.add(yellow);
        c.add(green);

        red.addActionListener(new RedClass());
        yellow.addActionListener(new YellowClass());
        green.addActionListener(new greenClass());
        frame.setVisible(true);
    }
}
