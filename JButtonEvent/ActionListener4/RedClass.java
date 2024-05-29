package JButtonEvent.ActionListener4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo4.c.setBackground(Color.RED);
    }
}
