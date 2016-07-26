package controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.UserDB;
import view.HospitalListJavaFXView;
import view.SignupJavaFXView;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField uname;
    @FXML
    PasswordField pw;

    boolean exist=false;
    public void authenticate() {
        //iterate thru the userDB to find if username exists
        for(int i=0; i<UserDB.getUsers().size(); i++) {
            //compare uname from user input to each username from userDB
            if (uname.getText().equals(UserDB.getUsers().get(i).getUserName())) {
                //&& pw.getText().equals(UserDB.getUsers().get(i).getPassword()
                System.out.println("Welcome " +uname.getText());
                try {
                    new HospitalListJavaFXView();
                } catch (IOException e) {
                    System.err.println("Error opening hospital list view!");
                    e.printStackTrace();
                }
                exist = true;
            }
        }

    }

    public void openSignupView() throws IOException {
        System.out.println("Open signup view");
        new SignupJavaFXView();
    }


}
