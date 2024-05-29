package JTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MyTable extends JFrame {
    JTable table;
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
         add(new JScrollPane(table));

         validate();  //Refresh
    }
}
