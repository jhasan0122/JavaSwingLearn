package JTableModelEditable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyTable extends JFrame {
    JTable table;

    JTextField t1,t2,t3;
    JButton b1,b2,b3;
    MyTable()
    {
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Object[][] data={
                {101,"Jehan",23},
                {102,"Hasan",24},
                {103,"Adib",27}
        };
        String[] columnName={"ID","Name","Age"};

        DefaultTableModel model=new DefaultTableModel(data,columnName);
         table=new JTable(model);

         setLayout(new GridLayout(3,1));

         JPanel panel=new JPanel();
         add(new JScrollPane(table));
         add(new JPanel());
         add(panel);

         t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();

        b1=new JButton("Add");
        b2=new JButton("Update");
        b3=new JButton("Delete");

        panel.setLayout(new GridLayout(3,3));
        panel.add(new JLabel("Roll no"));
        panel.add(t1);
        panel.add(b1);

        panel.add(new JLabel("Names"));
        panel.add(t2);
        panel.add(b2);

        panel.add(new JLabel("Age"));
        panel.add(t3);
        panel.add(b3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() || t2.getText().toString().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please fill all  the fields","Error",JOptionPane.ERROR_MESSAGE);

                }
                else {
                    int rollNo=Integer.parseInt(t1.getText());
                    String name=t2.getText().toString();
                    int age=Integer.parseInt(t3.getText().toString());

                    Object[] newRow={rollNo,name,age};
                    model.addRow(newRow);

                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);

                }
            }
        });


         validate();  //Refresh

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               int rowIndex=table.getSelectedRow();

               int rollNo=(int)model.getValueAt(rowIndex,0);
               String name=(String)model.getValueAt(rowIndex,1);
               int age=(int)model.getValueAt(rowIndex,2);

               t1.setText(String.valueOf(rollNo));
                t2.setText(name);
                t3.setText(String.valueOf(age));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t1.getText().toString().isEmpty() || t2.getText().toString().isEmpty() || t2.getText().toString().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Please fill all  the fields","Error",JOptionPane.ERROR_MESSAGE);

                }
                else {
                    int rollNo=Integer.parseInt(t1.getText());
                    String name=t2.getText().toString();
                    int age=Integer.parseInt(t3.getText().toString());

//                    Object[] newRow={rollNo,name,age};
//                    model.addRow(newRow);
                    int row=table.getSelectedRow();
                    model.setValueAt(rollNo,row,0);
                    model.setValueAt(name,row,1);
                    model.setValueAt(age,row,2);

                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);

                }
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(table.getSelectedRow()==-1)
                {
                    JOptionPane.showMessageDialog(null,"Please select a row","Error",JOptionPane.ERROR_MESSAGE);
                }
                int selection=JOptionPane.showConfirmDialog(null,"Do you want to delete this row?","Confirm",JOptionPane.YES_NO_OPTION);
                if(selection==JOptionPane.YES_OPTION)
                {
                    model.removeRow(table.getSelectedRow());
                }
            }
        });

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
