package GridBagLayOut;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    Container c;
    JButton b1,b2,b3,b4,b5;
    MyFrame()
    {
        c=getContentPane();
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");

        GridBagLayout gblt=new GridBagLayout();
        c.setLayout(gblt);

        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.weightx=0.5; //request for extra available space horizontally
        gbc.gridx=0;
        gbc.gridy=0;
        c.add(b1,gbc);

//        gbc.weightx=0; //reset
        gbc.gridx=1;
        gbc.gridy=0;
        c.add(b2,gbc);

        gbc.gridx=2;
        gbc.gridy=0;
        c.add(b3,gbc);

        pack();

        gbc.gridwidth=3;
        gbc.gridx=0;
        gbc.gridy=1;

        c.add(b4,gbc);

        pack();

        gbc.gridx=0;
        gbc.gridy=0;
        c.add(b5,gbc);
    }
}
