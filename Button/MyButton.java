package Button;

import javax.swing.*;
import java.awt.*;

public class MyButton {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JButton btn=new JButton("Click Me");
        btn.setSize(120,30);
        btn.setLocation(100,100);
        c.add(btn);
        Font font=new Font("Arial",Font.PLAIN,20);
        btn.setFont(font);
        btn.setText("Mybutton");
        btn.setForeground(Color.RED);
        btn.setBackground(Color.YELLOW);

        Cursor cur=new Cursor(Cursor.WAIT_CURSOR);
        btn.setCursor(cur);

 //       btn.setEnabled(false);
//        btn.setVisible(false);


        frame.setVisible(true);
    }
}
