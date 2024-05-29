package JSplitPane;

import javax.swing.*;

public class JSplitPaneExp extends JFrame {
    public JSplitPaneExp()
    {
        setTitle("JSplitPane");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btn1=new JButton("Left");
        JButton btn2=new JButton("Right");

        JSplitPane splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setTopComponent(btn1);
        splitPane.setBottomComponent(btn2);

        splitPane.setDividerSize(10);
        splitPane.setDividerLocation(200);
        splitPane.setOneTouchExpandable(true);

        add(splitPane);

        validate();

        setVisible(true);
    }
    public static void main(String[] args) {
        new JSplitPaneExp();
    }
}
