package IteamListener.IteamListenerCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFrame extends JFrame implements ItemListener {
    JCheckBox c1,c2,c3,c4;
    JTextArea ta;
    MyFrame()
    {
        Container c=getContentPane();
        c.setLayout(null);

        c1=new JCheckBox("10th");
        c1.setBounds(50,50,100,30);
        c2=new JCheckBox("12th");
        c2.setBounds(50,100,100,30);
        c3=new JCheckBox("Graduate");
        c3.setBounds(50,150,100,30);
        c4=new JCheckBox("Post Graduate");
        c4.setBounds(50,200,100,30);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);

        ta=new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);

    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.isSelected())
        {
            ta.setText(ta.getText()+"\n"+"10th");
        }
        if(c2.isSelected())
        {
            ta.setText(ta.getText()+"\n"+"12th");
        }
        if(c3.isSelected())
        {
            ta.setText(ta.getText()+"\n"+"Graduate");
        }
        if(c4.isSelected())
        {
            ta.setText(ta.getText()+"\n"+"Post Gra");
        }
    }
}
