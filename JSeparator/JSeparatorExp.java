package JSeparator;

import javax.swing.*;
import java.awt.*;

public class JSeparatorExp extends JFrame {
    JSeparatorExp()
    {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLocationRelativeTo(null);

        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1,0));
        panel.add(new JLabel("My First Label"));

        panel.add(new JSeparator(SwingConstants.VERTICAL));
        panel.add(new JLabel("My Second Label"));

        add(panel);

        JMenuBar menuBar=new JMenuBar();
        add(menuBar,BorderLayout.PAGE_START);

        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");

        menuBar.add(file);
        menuBar.add(edit);

        JMenuItem undo=new JMenuItem("Undo");
        JMenuItem redo=new JMenuItem("Redo");
        JMenuItem cut=new JMenuItem("Cut");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");
        JMenuItem find=new JMenuItem("Find");
        JMenuItem findNext=new JMenuItem("Find Next");
        JMenuItem replace=new JMenuItem("Replace");

        edit.add(undo);
        edit.add(redo);
        edit.addSeparator();

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.addSeparator();

        edit.add(find);
        edit.add(findNext);
        edit.add(replace);

        validate();


    }

    public static void main(String[] args) {
        new JSeparatorExp();
    }
}
