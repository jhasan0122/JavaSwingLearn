package PasswordField;

import javax.swing.*;
import java.awt.*;

public class MyPasswordField {
    public static void main(String[] args) {
        JFrame frame =new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(100,50,700,500);
        frame.setTitle("My  Password field");
        Container c =frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass=new JPasswordField();
        pass.setBounds(100,50,120,30);

        c.add(pass);

        pass.setText("12345678");
        pass.setFont(new Font("Arial",Font.PLAIN,30));

        pass.setEchoChar('*');
//        pass.setEchoChar((char) 0);

        frame.setVisible(true);
    }
}
