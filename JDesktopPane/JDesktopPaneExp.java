package JDesktopPane;

import javax.swing.*;
import java.awt.*;

public class JDesktopPaneExp extends JFrame {
    JDesktopPane dp;
    JDesktopPaneExp()
    {
        dp=new JDesktopPane();

        display(dp);
        add(dp, BorderLayout.CENTER);


        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    private void display(JDesktopPane dp) {
        int numFrame=3,x=30,y=30;
        for (int i=0;i<numFrame;i++)
        {
            JInternalFrame iframe=new JInternalFrame("InternalFrame "+(i+1),true,true,true,true);
            iframe.setBounds(x,y,250,100);
            iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            iframe.add(new JLabel("I love JAVA"));
            iframe.setVisible(true);

            dp.add(iframe);

            y+=100;

        }
    }

    public static void main(String[] args) {
        new JDesktopPaneExp();
    }
}
