package GridLayout;

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

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4,0);
        c.add(b5);

        GridLayout glt=new GridLayout(2,31,10,20);
//        glt.setVgap(10);
//        glt.setHgap(20);
        c.setLayout(glt);
    }
}
