package ActionListener.ActionListenerMenuiteams;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu file,edit;
    JMenuItem i1,i2,i3,i4,i5,i6,i7;
    JTextArea ta;
    MyFrame()
    {
        Container c=getContentPane();
        c.setLayout(null);

        menuBar=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");

        i1 =new JMenuItem("New");
        i2 =new JMenuItem("Open");
        i3 =new JMenuItem("Save");
        i4 =new JMenuItem("Cut");
        i5 =new JMenuItem("Copy");
        i6 =new JMenuItem("Paste");
        i7 =new JMenuItem("Select All");


        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);

        file.add(i1);
        file.add(i2);
        file.add(i3);

        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);

        menuBar.add(file);
        menuBar.add(edit);
        setJMenuBar(menuBar);

        ta=new JTextArea();
        ta.setBounds(10,10,370,370);
        c.add(ta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==i1)
        {
            ta.setText("New File...");
        }
        else if (e.getSource()==i2)
        {
            ta.setText("Open File...");
        }

        else if (e.getSource()==i3)
        {
            ta.setText("Save File...");
        }
        else if (e.getSource()==i4)
        {
            ta.cut();
        }
        else if (e.getSource()==i5)
        {
            ta.copy();
        }
        else if (e.getSource()==i6)
        {
            ta.paste();
        }
        else if (e.getSource()==i7)
        {
            ta.selectAll();
        }

    }
}
