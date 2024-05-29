package JOptionPaneExp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmDialog {
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
               int sel= JOptionPane.showConfirmDialog(frame,"Do you want ot exit","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(sel==JOptionPane.YES_OPTION)
                {
                    System.out.println("Yes option is selected");
                    System.exit(0);
                }
                if(sel==JOptionPane.NO_OPTION)
                {
                    System.out.println("No option is selected");
                }
                if(sel==JOptionPane.CANCEL_OPTION)
                {
                    System.out.println("Cancel option is selected");
                }


            }
        });
    }
}
