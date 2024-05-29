package JToolTip;

import javax.swing.*;

public class JToolTipExp extends JFrame {
    JToolTipExp()
    {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel label=new JLabel("Password");
        label.setBounds(50,100,80,30);
        add(label);

        JPasswordField pwd=new JPasswordField();
        pwd.setBounds(140,100,100,30);
        add(pwd);

        String str="<html>"
                +"<div bgcolor='#800080', color='#ffffff'>"
                +"<h2>Enter your name:</h2><br/>"
                +"Password should be 8 character long"
                +"</div>"
                +"</html>";
        pwd.setToolTipText(str);

        setVisible(true);
    }


    public static void main(String[] args) {
        new JToolTipExp();
    }
}
