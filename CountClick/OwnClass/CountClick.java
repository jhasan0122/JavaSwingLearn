package CountClick.OwnClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountClick implements ActionListener{
    JFrame frame;
    JTextField txtFld;
    JButton btn;
    CountClick()
    {
        frame=new JFrame("Count Click");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Count: "));
        txtFld=new JTextField(10);
        txtFld.setText("0");
        frame.add(txtFld);
        btn=new JButton("Click");
        frame.add(btn);

        btn.addActionListener(this);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        txtFld.setText(Integer.parseInt(txtFld.getText())+1+"");
    }
    public static void main(String[] args) {
        new CountClick();
    }
}
