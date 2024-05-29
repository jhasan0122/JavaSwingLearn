package MouseListener;

import javax.swing.*;

public class MouseEvent {
    public static void main(String[] args) {
        Myframe f=new Myframe();
        f.setTitle("Mouse Event");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
