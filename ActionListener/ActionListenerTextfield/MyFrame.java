package ActionListener.ActionListenerTextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    Container c;
    JTextField t1;
    MyFrame()
    {
        c=getContentPane();
        c.setLayout(null);
        t1=new JTextField("");
        t1.setBounds(100,100,100,30);
        c.add(t1);

        t1.setFont(new Font("Arial",Font.BOLD,15));
        t1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=t1.getText();
        t1.setText(str.toUpperCase());
    }
}
