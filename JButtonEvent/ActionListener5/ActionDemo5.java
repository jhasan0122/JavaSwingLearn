package JButtonEvent.ActionListener5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDemo5 extends JFrame {
    public static void main(String[] args) {
        JFrame f=new JFrame("ActionDemo 5");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();
        c.setLayout(null);

        JButton btn1=new JButton("Red");
        JButton btn2=new JButton("Yellow");
        JButton btn3=new JButton("Blue");

        btn1.setBounds(100,100,100,50);
        btn2.setBounds(250,100,100,50);
        btn3.setBounds(400,100,100,50);

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.RED);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.YELLOW);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.BLUE);
            }
        });

    }

}
