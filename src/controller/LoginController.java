package controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.UserDB;
import view.SignupJavaFXView;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField uname;
    @FXML
    PasswordField pw;

    public void authenticate() {
        //iterate thru the userDB to find if username exists
        for(int i=0; i<UserDB.getUsers().size(); i++) {
            //compare uname from user input to each username from userDB
            if (uname.getText().equals(UserDB.getUsers().get(i).getUserName())) {
                //&& pw.getText().equals(UserDB.getUsers().get(i).getPassword()
                System.out.println("Welcome " +uname.getText());
            }
        }
    }

    public void openSignupView() throws IOException {
        System.out.println("Open signup view");
        new SignupJavaFXView();
    }


}
