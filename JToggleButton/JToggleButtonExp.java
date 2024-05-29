package JToggleButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggleButtonExp extends JFrame implements ActionListener {

    private JToggleButton toggle;
    private Container c;
    private Color defaultColor;
    JToggleButtonExp()
    {
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        c=getContentPane();
        c.setLayout(null);
        defaultColor=c.getBackground();

        toggle=new JToggleButton("Off");
        toggle.setBounds(200,200,100,50);
        c.add(toggle);

        toggle.addActionListener(this);


    }

    public static void main(String[] args) {
        new JToggleButtonExp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(toggle.isSelected())
        {
            //On State
            c.setBackground(Color.YELLOW);
            toggle.setText("On");
        }
        else
        {
            c.setBackground(defaultColor);
            toggle.setText("Off");
        }
    }
}
