package JInternalFrame;

import javax.swing.*;
import java.awt.*;

public class JInternalFrameExp extends JFrame {
    JInternalFrameExp()
    {
        setLayout(null);

        JInternalFrame iframe=new JInternalFrame("My InternalFrame",true,true,true,true);
        initFrame(iframe);
        add(iframe);


        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void initFrame(JInternalFrame iframe) {
        iframe.setSize(300,200);
        iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        iframe.setLocation(50,50);
        iframe.setVisible(true);

        iframe.add(new JButton("My Button"));
        iframe.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new JInternalFrameExp();

    }

}
