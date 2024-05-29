package ActionListener.ActionListenerButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton button;
    MyFrame()
    {
        c=getContentPane();
        c.setLayout(null);
        button=new JButton("click me");
        button.setBounds(100,100,100,30);
        c.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str=button.getText();
        button.setText(str.toUpperCase());
    }
}
