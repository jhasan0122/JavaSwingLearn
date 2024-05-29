package FocusEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyFrame extends JFrame implements FocusListener {
    JTextField t1;
    JTextArea ta;
    MyFrame()
    {
        Container c=getContentPane();
        c.setLayout(null);

        t1=new JTextField();
        t1.setBounds(50,100,100,30);
        c.add(t1);
        t1.addFocusListener(this);

        ta=new JTextArea();ta.setBounds(200,50,300,300);
        c.add(ta);
    }


    @Override
    public void focusGained(FocusEvent e) {
        ta.setText(ta.getText()+"\n"+"Focus gained");
    }

    @Override
    public void focusLost(FocusEvent e) {
        ta.setText(ta.getText()+"\n"+"Focus lost");
    }
}
