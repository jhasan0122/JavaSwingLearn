package Registration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4,label5;
    JTextField t1,t2;
    JRadioButton male,female;
    JComboBox day,month,year;
    JTextArea ta1;
    JCheckBox terms;
    JButton submit;
    JLabel msg;

    JTextArea screen;
    MyFrame()
    {
        setTitle("Registration Form");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(null);

        label1=new JLabel("Name:");
        label1.setBounds(20,50,100,20);
        c.add(label1);

        t1=new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);

        label2=new JLabel("Mobile:");
        label2.setBounds(20,100,100,20);
        c.add(label2);

        t2=new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);

        label3=new JLabel("Gender:");
        label3.setBounds(20,150,100,20);
        c.add(label3);

        male=new JRadioButton("Male");
        male.setBounds(130,150,80,20);
        female=new JRadioButton("Female");
        female.setBounds(220,150,80,20);
        c.add(male);
        male.setSelected(true);
        c.add(female);
        ButtonGroup gen=new ButtonGroup();
        gen.add(male);
        gen.add(female);

        label4=new JLabel("DoB:");
        label4.setBounds(20,200,100,20);
        c.add(label4);

        String days[]=new String[31];
        for(int i=0;i<31;i++)
        {
            days[i]=String.valueOf(i+1);
        }

        String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul",
        "Aug","Sep","Oct","Nov","Dec"};

        String years[]=new String[40];
        for(int i=0;i<40;i++)
        {
            years[i]=String.valueOf(i+1982);
        }

        day=new JComboBox(days);
        day.setBounds(130,200,50,20);
        month=new JComboBox(months);
        month.setBounds(190,200,50,20);
        year=new JComboBox(years);
        year.setBounds(250,200,70,20);
        c.add(day);
        c.add(month);
        c.add(year);
        day.setBounds(130,200,50,20);

        label5=new JLabel("Adress:");
        label5.setBounds(20,250,150,20);
        c.add(label5);

        ta1=new JTextArea();
        ta1.setBounds(130,240,200,50);
        c.add(ta1);

        terms=new JCheckBox("Accept terms and condition");
        terms.setBounds(50,300,250,20);
        c.add(terms);

        submit=new JButton("Submit");
        submit.setBounds(150,350,100,20);
        c.add(submit);
        submit.addActionListener(this);

        screen=new JTextArea();
        screen.setBounds(350,50,300,300);
        c.add(screen);

        msg=new JLabel("");
        msg.setBounds(20,400,250,20);
        c.add(msg);

        c.setBackground(Color.RED);
        c.setForeground(Color.LIGHT_GRAY);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(terms.isSelected()){
            msg.setText("registration Successful");

            String name=t1.getText();
            String mobile=t2.getText();
            String gender="male";
            if(female.isSelected())
            {
                gender="female";
            }

            String dob=day.getSelectedItem()+"/"+month.getSelectedItem()+"/"+year.getSelectedItem();
            String adress=ta1.getText();

            screen.setText("Name:"+name+"\n"+
                    "Mobile:"+mobile+"\n"+
                    "Gender"+gender+"\n"+
                    "Date of Birth:"+dob+"\n"+
                    "Adress:"+adress

            );
        }
        else
        {
            msg.setText("Please accept terms and condition..");
            screen.setText("");
        }
    }
}
