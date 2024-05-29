package CountClick.AnnInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountClick {
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

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtFld.setText(Integer.parseInt(txtFld.getText())+1+"");
            }
        });
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new CountClick();
    }
}
