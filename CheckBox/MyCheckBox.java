package CheckBox;

import javax.swing.*;
import java.awt.*;

public class MyCheckBox {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();
        c.setLayout(null);

        JCheckBox c1=new JCheckBox("High School");
        JCheckBox c2=new JCheckBox("Intermediate");
        JCheckBox c3=new JCheckBox("Under Graduate");
        JCheckBox c4=new JCheckBox("Post Graduate");

        c1.setBounds(100,50,120,20);
        c2.setBounds(100,100,120,20);
        c3.setBounds(100,150,120,20);
        c4.setBounds(100,200,120,20);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c1.setSelected(true);

        Font font=new Font("arial",Font.ITALIC,14);
        c1.setFont(font);
        c2.setFont(font);
        c3.setFont(font);
        c4.setFont(font);

        c4.setEnabled(false);



        f.setVisible(true);

    }
}
