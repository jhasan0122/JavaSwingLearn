package JDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogExp implements ActionListener {
    JFrame frame;
    JDialog d;


    JDialogExp()
    {
        frame=new JFrame("JFrame");
        frame.setSize(300,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel=new JPanel();
        frame.add(panel);

        JButton b1=new JButton("Click 1");
        b1.addActionListener(this);
        panel.add(b1);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new JDialogExp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Click 1"))
        {
            showFirstDialog();
        }
        else if(e.getActionCommand().equals("Click 2"))
        {
            showSecondDialog();

        }

    }
    private void showFirstDialog(){
        d=new JDialog(frame,"JDialog 1");
        d.setSize(200,200);
        JPanel panel=new JPanel();
        d.add(panel);


        JButton b=new JButton("Click 2");
        b.addActionListener(this);
        panel.add(b);

        d.setVisible(true);
    }
    private void showSecondDialog(){
        JDialog d1=new JDialog(d,"JDialog 2");
        d1.setSize(200,200);
        d1.add(new JLabel("This is second JDialog"));
        d1.setVisible(true);
    }
}
