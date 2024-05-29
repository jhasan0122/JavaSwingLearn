package AddImageInFrame;

import javax.swing.*;
import java.awt.*;

public class AddImage2 {
    public static void main(String[] args) {
        JFrame frame =new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(100,50,700,700);
        frame.setTitle("Add Image2");

        Container c =frame.getContentPane();
        c.setLayout(null);

        ImageIcon icon=new ImageIcon("F:\\JAVA\\JavaSwingProject\\untitled\\src\\AddImageInFrame\\java-logo-vert-blk.png");
        JLabel label=new JLabel("Text",icon,JLabel.LEFT);
        label.setBounds(0,100,500,100);

        c.add(label);


        frame.setVisible(true);
    }
}
