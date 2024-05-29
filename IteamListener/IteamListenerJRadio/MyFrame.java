package IteamListener.IteamListenerJRadio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFrame extends JFrame implements ItemListener {
    JRadioButton male,female;
    JTextArea ta;
    MyFrame()
    {
        Container c=getContentPane();
        c.setLayout(null);

        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        male.setBounds(50,50,100,20);
        female.setBounds(50,100,100,20);
        c.add(male);
        c.add(female);

        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        male.addItemListener(this);
        female.addItemListener(this);

        ta=new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);

    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==male)
        {
            ta.setText("Male is Clicked");
        }
        else if(e.getSource()==female)
        {
            ta.setText("Female is clicked");

        }

    }
}
