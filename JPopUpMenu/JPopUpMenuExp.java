package JPopUpMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopUpMenuExp extends JFrame implements ActionListener {

    JPopupMenu pm;
    JMenuItem m1,m2,m3;

    JPopUpMenuExp()
    {
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        pm=new JPopupMenu();
        m1=new JMenuItem("Item 1");
        m2=new JMenuItem("Item 2");
        m3=new JMenuItem("Item 3");

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);

        pm.add(m1);
        pm.add(m2);
        pm.add(m3);

        add(pm);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON3)
                {
                    pm.show(JPopUpMenuExp.this,e.getX(),e.getY());

                }
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==m1)
        {
            System.out.println("Item1 is selected");

        }
        else if(e.getSource()==m2)
        {
            System.out.println("Item2 is selected");
        }
        else if(e.getSource()==m3)
        {
            System.out.println("Item3 is selected");
        }
    }
}
