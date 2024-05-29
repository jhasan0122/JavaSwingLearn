package MyJLabel;

import javax.swing.*;
import java.awt.*;

public class MyJLabel {
    public static void main(String[] args) {
        JFrame frame =new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(100,50,700,500);
        frame.setTitle("My First Frame");

        Container c =frame.getContentPane();
        c.setLayout(null);

        JLabel label=new JLabel("Username:");
        label.setBounds(100,50,200,30);
        label.setText("Password");

        Font font=new Font("Arial",Font.PLAIN,30);
        label.setFont(font);


        c.add(label);



        frame.setResizable(false);
        frame.setVisible(true);
    }
}
