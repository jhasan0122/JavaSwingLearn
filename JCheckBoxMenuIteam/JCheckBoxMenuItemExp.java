package JCheckBoxMenuIteam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxMenuItemExp extends JFrame {
    JMenuItem newFile=new JMenuItem("New");
    JMenuItem open=new JMenuItem("Open");
    JMenuItem undo=new JMenuItem("Undo");
    JMenuItem redo=new JMenuItem("Redo");

    JCheckBoxMenuItem checkBoxMenuItem=new JCheckBoxMenuItem("Word wrap");

    JTextArea ta=new JTextArea("I love programming amd I want to be a software engineer,I love programming amd I want to be a software engineer,I love programming amd I want to be a software engineer,I love programming amd I want to be a software engineer,I love programming amd I want to be a software engineer,I love programming amd I want to be a software engineer,");

    JCheckBoxMenuItemExp()
    {
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


        JMenuBar menuBar=new JMenuBar();
        add(menuBar,BorderLayout.PAGE_START);

        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenu format=new JMenu("Format");
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);

        file.add(newFile);
        file.add(open);

        edit.add(undo);
        edit.add(redo);

        format.add(checkBoxMenuItem);
        add(ta,BorderLayout.CENTER);

        checkBoxMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBoxMenuItem.isSelected())
                {
                    ta.setLineWrap(true);
                }
                else
                {
                    ta.setLineWrap(false);
                }
            }
        });


        validate();

    }

    public static void main(String[] args) {
        new JCheckBoxMenuItemExp();
    }
}
