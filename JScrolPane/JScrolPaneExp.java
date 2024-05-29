package JScrolPane;

import javax.swing.*;
import java.awt.*;

public class JScrolPaneExp {
    public static void main(String[] args) {
        JFrame frame=new JFrame("JScrollPane");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextArea ta=new JTextArea(10,15);

        JScrollPane jsp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);


        frame.add(jsp);



        frame.setVisible(true);
    }
}
