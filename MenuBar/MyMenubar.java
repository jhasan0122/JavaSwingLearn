package MenuBar;

import javax.swing.*;

public class MyMenubar {
    public static void main(String[] args) {
        JFrame f=new JFrame("MenuBar");
        f.setSize(600,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        JMenuBar menuBar=new JMenuBar();

        JMenu file =new JMenu("File");
        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenuItem i3=new JMenuItem("Save");
        file.add(i1);
        file.add(i2);
        file.add(i3);

        menuBar.add(file);
        f.setJMenuBar(menuBar);

        JMenu edit=new JMenu("Edit");
        JMenuItem i4=new JMenuItem("Undo");
        JMenuItem i5=new JMenuItem("Redo");
        edit.add(i4);
        edit.add(i5);

        menuBar.add(edit);
        f.setJMenuBar(menuBar);



        f.setVisible(true);
    }
}
