package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Myframe extends JFrame implements MouseListener {
    JLabel label;
    JTextArea ta;
    Myframe()
    {
        Container c=getContentPane();
        c.setLayout(null);

        label=new JLabel("My label");
        label.setFont(new Font("Arial",Font.BOLD,18));
        label.setBounds(50,100,100,30);
        c.add(label);
        label.addMouseListener(this);

        ta=new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);



    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse entered");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is released ");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse exited");
    }
}
