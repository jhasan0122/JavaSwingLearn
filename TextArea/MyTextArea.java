package TextArea;

import javax.swing.*;
import java.awt.*;

public class MyTextArea {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        JTextArea textArea=new JTextArea();
        textArea.setBounds(100,100,400,200);
        c.add(textArea);

        textArea.setText("This is TextArea:");
        textArea.setFont(new Font("Arial",Font.BOLD,15));
//        textArea.setEditable(false);
        textArea.setLineWrap(true);



        frame.setVisible(true);
    }
}
