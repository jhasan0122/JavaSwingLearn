package JOptionPaneExp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MassageDialog {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Input dialogue");
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton bt1=new JButton("Plain");
        frame.add(bt1);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame,"this is a plain msg","Message",JOptionPane.PLAIN_MESSAGE);
            }
        });

        JButton bt2=new JButton("Info");
        frame.add(bt2);
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame,"this is a info msg","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });

        JButton bt3=new JButton("Ques");
        frame.add(bt3);
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame,"this is a ques msg","Message",JOptionPane.QUESTION_MESSAGE);

            }
        });

        JButton bt4=new JButton("Error");
        frame.add(bt4);
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame,"this is a error msg","Message",JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton bt5=new JButton("Warning");
        frame.add(bt5);
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame,"this is a warning msg","Message",JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}
