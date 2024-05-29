package WindowEventListner;

import javax.swing.*;

public class WindowEventListener {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setTitle("Window event");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,400,400);
        f.setVisible(true);

    }
}
