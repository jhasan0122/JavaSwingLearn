package JSpinner;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerExp extends JFrame implements ChangeListener{
    String[] arr={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    JSpinner s1,s2,s3;
    SpinnerModel model1,model2,model3;
    JLabel label=new JLabel();
    JSpinnerExp() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setLayout(null);


        String str=String.valueOf(java.time.Year.now());
        int y=Integer.parseInt(str);

        model1 = new SpinnerNumberModel(1,1,31,1);
        model2=new SpinnerListModel(arr);
        model3=new SpinnerNumberModel(y,y-100,y,1);

        s1=new JSpinner(model1);
        s2=new JSpinner(model2);
        s3=new JSpinner(model3);

        s1.setBounds(100,20,100,50);
        s2.setBounds(100,100,100,50);
        s3.setBounds(100,200,100,50);

        add(s1);
        add(s2);
        add(s3);

        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);

        label.setBounds(100,300,150,20);
        setDOB();
        add(label);

        setVisible(true);

        validate();
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        setDOB();   //reset DOB
    }

    public static void main(String[] args) {
        new JSpinnerExp();
    }

    public void setDOB()
    {
        int date =(Integer) s1.getValue();
        int year =(Integer) s3.getValue();
        String month=(String) s2.getValue();

        label.setText("DOB is: "+date+"-"+month+"-"+year);

    }


}
