package JWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JWindowExp extends JFrame implements ActionListener {
    JWindowExp()
    {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel p=new JPanel();
        JButton b=new JButton("click");
        p.add(b);
        add(p);
        b.addActionListener(this);




        setVisible(true);

    }

    public static void main(String[] args) {
        new JWindowExp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final JWindow w=new JWindow(this);
        w.setSize(300,200);
        w.setLocationRelativeTo(null);

        JPanel panel=new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panel.add(new JLabel("This is a window"));
        w.add(panel);

        w.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2)
                {
                    w.dispose();
                }
            }
        });




        w.setVisible(true);




    }
}
