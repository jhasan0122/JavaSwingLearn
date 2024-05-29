package JButtonEvent.ActionListener1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    Container c=getContentPane();
    JButton btn;
    MyFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);

        btn=new JButton("Click me");
        btn.setBounds(100,100,100,50);
        c.add(btn);
        btn.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.YELLOW);
    }
}
