package MouseMotionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyFrame extends JFrame implements MouseMotionListener {
    JLabel label;
    JTextArea ta;
    MyFrame()
    {
        Container c=getContentPane();
        c.setLayout(null);

        label=new JLabel("My Label");
        label.setFont(new Font("Araial",Font.BOLD,18));
        label.setBounds(50,100,100,30);
        c.add(label);
        label.addMouseMotionListener(this);

        ta=new JTextArea();ta.setBounds(200,50,300,300);
        c.add(ta);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse Draged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse Moved");

    }
}
