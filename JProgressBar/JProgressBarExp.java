package JProgressBar;

import javax.swing.*;
import java.awt.*;

public class JProgressBarExp{
    public static void main(String[] args) {
        JFrame f=new JFrame("JProgressBar");
        f.setLayout(new FlowLayout());
        f.setSize(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        JProgressBar pb=new JProgressBar(0,100);
        f.add(pb);

        pb.setStringPainted(true);
//        pb.setOrientation(SwingConstants.VERTICAL);


        //to increase the progress
        int i=0;
        while (i<=100)
        {
            if(i>=0 && i<=50)
            {
                pb.setString("Processing");
            }
            else if(i>50 && i<=70)
            {
                pb.setString("Wait for sometime");
            }
            else if(i>70 &&i<=90)
            {
                pb.setString("About to complete");
            }
            else if(i==10)
            {
                pb.setString("Finished");
            }

            try{
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            pb.setValue(i);
            i+=10;
        }
    }
}
