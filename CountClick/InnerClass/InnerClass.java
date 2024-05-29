package CountClick.InnerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
//        CountClick.txtFld.setText(Integer.parseInt(txtFld.getText())+1+"");
        CountClick.txtFld.setText(Integer.parseInt(CountClick.txtFld.getText())+1+"");

    }
}
