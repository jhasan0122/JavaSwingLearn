package JTable;

import javax.swing.*;

public class JTableExp {
    public static void main(String[] args) {
        String[][] data={
                {"221","Jehan","23"},
                {"222","Hasan","24"},
                {"192","Adib","27"}
        };

        String[] columnName={"Roll no","Name","Age"};

        JTable table=new JTable(data,columnName);


        JFrame f=new JFrame("Table ");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JScrollPane(table));

        f.setVisible(true);
    }
}
