package JTextField;

import javax.swing.*;
import java.awt.*;

public class MyTextField {
    public static void main(String[] args) {
        JFrame frame =new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(100,50,700,500);
        frame.setTitle("My Textfield");
        Container c =frame.getContentPane();
        c.setLayout(null);

        JTextField t1=new JTextField();
        t1.setBounds(100,50,120,30);
        c.add(t1);

        t1.setText("Jehan Hasan");

        Font font=new Font("Arial",Font.BOLD,25);
        t1.setFont(font);
        t1.setBackground(Color.GREEN);
        t1.setForeground(Color.RED);
        t1.setEditable(false);

        frame.setVisible(true);
    }
}
