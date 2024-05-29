package JTabbedPane;

import javax.swing.*;

public class JTabbedPaneExp {
    public static void main(String[] args) {
        JFrame frame=new JFrame("JTabbedPane");
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(50,50,250,200);

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();

        panel1.add(new JLabel("This is my first page"));
        panel2.add(new JLabel("This is my Second page"));
        panel3.add(new JLabel("This is my Third page"));

        tp.add("First",panel1);
        tp.add("Second",panel2);
        tp.add("Third",panel3);

        frame.add(tp);
    }
}
