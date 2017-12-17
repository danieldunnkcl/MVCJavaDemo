package controller;

import model.Model;
import view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private Model model;
    private View view;
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        view.setActionListeners(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(((JButton) e.getSource()).getText().equals("Add")){
            model.add(view.getText());
            view.updateSuperString(model.getSuperString());
        }else if(((JButton) e.getSource()).getText().equals("Remove")){
            model.remove(view.getText());
            view.updateSuperString(model.getSuperString());
        }
    }

    public static void main(String... args){
        View view = new View();
        Model model = new Model();
        Controller controller  = new Controller(model,view);
    }
}
