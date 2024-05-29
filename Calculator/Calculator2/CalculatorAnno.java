package Calculator.Calculator2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorAnno extends JFrame {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setTitle("Calculator1");
        f.setBounds(100,100,300,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=f.getContentPane();
        c.setLayout(null);

        JLabel lbl1,lbl2,result;
        JTextField t1,t2;
        JButton add,sub,mul,div;

        lbl1=new JLabel("First num:");
        lbl1.setBounds(10,20,100,20);
        c.add(lbl1);
        t1=new JTextField();
        t1.setBounds(120,20,100,20);
        c.add(t1);

        lbl2=new JLabel("Second num:");
        lbl2.setBounds(10,50,100,20);
        c.add(lbl2);
        t2=new JTextField();
        t2.setBounds(120,50,100,20);
        c.add(t2);

        add=new JButton("+");
        add.setBounds(10,80,50,30);
        c.add(add);
        sub=new JButton("-");
        sub.setBounds(70,80,50,30);
        c.add(sub);
        mul=new JButton("*");
        mul.setBounds(130,80,50,30);
        c.add(mul);
        div=new JButton("/");
        div.setBounds(190,80,50,30);
        c.add(div);

        result=new JLabel("Result: ");
        result.setBounds(10,120,150,20);
        c.add(result);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(t1.getText());
                double b =Double.parseDouble(t2.getText());
                double c=a+b;
                result.setText("Result:"+c);
            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(t1.getText());
                double b =Double.parseDouble(t2.getText());
                double c=a-b;
                result.setText("Result:"+c);
            }
        });

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(t1.getText());
                double b =Double.parseDouble(t2.getText());
                double c=a*b;
                result.setText("Result:"+c);
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double a=Double.parseDouble(t1.getText());
                    double b =Double.parseDouble(t2.getText());
                    double c=a/b;
                    result.setText("Result:"+c);
                }catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        });

        f.setVisible(true);
    }
}
