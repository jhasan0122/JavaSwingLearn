package Border_Layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExp {
    public static void main(String[] args) {
        JFrame f=new JFrame("Border layout");
        f.setBounds(300,200,500,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();

        JButton b1=new JButton("Page_Start");
        JButton b2=new JButton("Page_End");
        JButton b3=new JButton("Line_Start");
        JButton b4=new JButton("Center");
        JButton b5=new JButton("Line_End");

        c.add(b1, BorderLayout.PAGE_START);
        c.add(b2,BorderLayout.PAGE_END);
        c.add(b3,BorderLayout.LINE_START);
        c.add(b4,BorderLayout.CENTER);
        c.add(b5,BorderLayout.LINE_END);

        f.setVisible(true);


    }
}
