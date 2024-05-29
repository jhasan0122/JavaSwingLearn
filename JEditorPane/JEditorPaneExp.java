package JEditorPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JEditorPaneExp extends JFrame {
    JEditorPane pane;

    JEditorPaneExp()
    {
        pane=new JEditorPane();
        pane.setContentType("text/html");
//        pane.setText("My name is Jehan Hasan. I am a programmer and I love JAVA for coding.My name is Jehan Hasan. I am a programmer and I love JAVA for coding.My name is Jehan Hasan. I am a programmer and I love JAVA for coding.My name is Jehan Hasan. I am a programmer and I love JAVA for coding.");
        pane.setText(
                "<html>"
                        +"<h1 color='red'>Hello World</h1>"
                        +"<p>This is my paragraph</p>"
                        +"<hr>"
                        +"<ol>"
                        +"<li>item 1</li>"
                        +"<li>item 2</li>"
                        +"<li>item 3</li>"
                        +"</ol>"
                +"</html>"
        );
        add(pane, BorderLayout.CENTER);

        JButton button=new JButton("Show code");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(""+pane.getText());
            }
        });

        add(button,BorderLayout.PAGE_END);


        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JEditorPaneExp();
    }
}
