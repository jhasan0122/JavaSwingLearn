package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Myframe extends JFrame implements KeyListener {
    JTextArea ta;
    Myframe()
    {
        Container c=getContentPane();
        c.setLayout(null);

        ta=new JTextArea();
        ta.setBounds(10,10,350,350);
        c.add(ta);
        ta.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Key is Typed : "+e.getKeyChar());

    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Key is Pressed : "+e.getKeyChar());

    }

    @Override
    public void keyReleased(KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Key is Released : "+e.getKeyChar());

    }
}
