package controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.User;
import model.UserDB;
import model.UserIO;

import java.io.IOException;

/**
 * Created by tkanchanawanchai6403 on 6/29/2016.
 */
public class SignupController {
    @FXML
    TextField uname;
    @FXML
    PasswordField pw;
    @FXML
    PasswordField confirmpw;

    public void createAccount() {
        if(pw.getText().equals(confirmpw.getText())) {
            User user = new User(uname.getText(),pw.getText());
            UserDB.getUsers().add(user);
            try {
                UserIO.writeUsers(UserDB.getUsers());
            } catch (IOException e) {
                System.err.println("Cannot write UserDB to binary file!");
                e.printStackTrace();
            }
        }
        System.out.println(UserDB.getUsers());
    }
}
