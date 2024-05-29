package IteamListener.IteamListenerCheckBoxMenuIteam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFrame extends JFrame implements ItemListener {
    JMenuBar menuBar;
    JMenu mymenu;
    JCheckBoxMenuItem c1;
    JTextArea ta;
    MyFrame()
    {
        Container c=getContentPane();
        c.setLayout(null);

        menuBar=new JMenuBar();
        mymenu=new JMenu("File");
        c1=new JCheckBoxMenuItem("Print");
        mymenu.add(c1);
        menuBar.add(mymenu);
        this.setJMenuBar(menuBar);
        c1.addItemListener(this);

        ta=new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.isSelected())
        {
            ta.setText("Print is On");
        }
        else
        {
            ta.setText("Print if off");
        }

    }
}
