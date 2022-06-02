package controller;

import Model.InputModel;
import view.InputView;
import view.LoginView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    LoginView menuView;
    public LoginController(LoginView menuView){
        this.menuView = menuView;
        menuView.btnlog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id,pass;
                id = menuView.getid();
                pass = menuView.getpass();

                if (id.equals("admin") && pass.equals("pass")){
                    InputView inputView = new InputView();
                    InputModel inputModel = new InputModel();
                    new InputController(inputView , inputModel);
                } else {
                    JOptionPane.showMessageDialog(null,"Id atau Password salah");
                }

            }
        });
    }
}
