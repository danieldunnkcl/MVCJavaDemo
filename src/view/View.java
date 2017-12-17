package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JButton add, remove;
    private JTextField superStringField, editsField;
    private JLabel ssL, eL;
    public View(){
        super("Super String");
        superStringField = new JTextField(10);
        superStringField.setEditable(false);
        ssL = new JLabel("Super String");


        editsField = new JTextField(10);
        eL = new JLabel("Edits");
        add = new JButton("Add");
        remove = new JButton("Remove");

        JPanel content = new JPanel();
        content.add(ssL);
        content.add(superStringField);
        content.add(eL);
        content.add(editsField);
        content.add(add);
        content.add(remove);

        this.setContentPane(content);
        this.setSize(300,400);
        this.setVisible(true);

    }

    public void updateSuperString(String s){
        superStringField.setText(s);
    }

    public void setActionListeners(ActionListener al){
        add.addActionListener(al);
        remove.addActionListener(al);
    }

    public String getText(){
        return editsField.getText();
    }
}
