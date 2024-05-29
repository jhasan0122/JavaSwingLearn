package IteamListener.ItemListenerJComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFrame extends JFrame implements ItemListener {
    JComboBox combo;
    JTextArea ta;

    MyFrame()
    {
        Container c=getContentPane();
        c.setLayout(null);

        String values[]={"A","B","C","D","E"};
        combo=new JComboBox(values);
        combo.setBounds(50,50,100,30);
        c.add(combo);
        combo.addItemListener(this);

        ta=new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str=(String) combo.getSelectedItem();
        ta.setText(str);
    }
}
