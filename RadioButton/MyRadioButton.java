package RadioButton;

import javax.swing.*;
import java.awt.*;

public class MyRadioButton {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();
        c.setLayout(null);

        JRadioButton radio1=new JRadioButton("Male");
        radio1.setBounds(100,50,100,20);
        c.add(radio1);
        JRadioButton radio2=new JRadioButton("Female");
        radio2.setBounds(200,50,100,20);
        c.add(radio2);

        Font font=new Font("Arial",Font.BOLD,16);
        radio1.setFont(font);
        radio2.setFont(font);

        ButtonGroup gender=new ButtonGroup();
        gender.add(radio1);
        radio1.setSelected(true);
        gender.add(radio2);

        JRadioButton jeh,has,adib,molla;
        jeh=new JRadioButton("Jehan");
        jeh.setBounds(100,100,100,20);
        c.add(jeh);
        jeh.setSelected(true);
        has=new JRadioButton("Hasan");
        has.setBounds(200,100,100,20);
        c.add(has);
        adib=new JRadioButton("Adib");
        adib.setBounds(300,100,100,20);
        c.add(adib);
        molla=new JRadioButton("Molla");
        molla.setBounds(400,100,100,20);
        c.add(molla);

        ButtonGroup name=new ButtonGroup();
        name.add(jeh);
        name.add(has);
        name.add(adib);
        name.add(molla);

        has.setEnabled(false);
        f.setVisible(true);
    }
}
