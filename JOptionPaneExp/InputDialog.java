package JOptionPaneExp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputDialog {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Input dialogue");
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button=new JButton("CLick me");
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=JOptionPane.showInputDialog("Enter your name:");
                if(str.length()>0)
                {
                    System.out.println("The name of user is:"+str);
                }
            }
        });

    }
}
