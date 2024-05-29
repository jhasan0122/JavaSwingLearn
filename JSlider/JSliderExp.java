package JSlider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderExp extends JFrame implements ChangeListener {
    JSlider s;
    JLabel label;
    public JSliderExp()
    {
        setLayout(new FlowLayout());

        s=new JSlider();
        add(s);
        s.setMinimum(0);
        s.setMaximum(200);

        s.setPaintTicks(true);
        s.setPaintLabels(true);

        s.setMajorTickSpacing(50);
        s.setMinorTickSpacing(5);

        s.addChangeListener(this);

//        s.setOrientation(JSlider.VERTICAL);

        label=new JLabel();
        label.setText("The value of slider: "+s.getValue());
        add(label);

        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("The value of slider: "+s.getValue());
    }
    public static void main(String[] args) {
        new JSliderExp();

    }
}
