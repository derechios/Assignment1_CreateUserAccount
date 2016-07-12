package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import model.User;
import model.UserDB;
import model.UserIO;
import view.SignupJavaFXView;

import java.io.File;
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
            UserDB.getUsers().push(user);
            try {
                UserIO.writeUsers(UserDB.getUsers());
            } catch (IOException e) {
                System.err.println("Cannot write UserDB to binary file!");
                e.printStackTrace();
            }
        } else {
                pw.setStyle("-fx-background-color: slateblue; -fx-text-fill: white; -fx-border-color: red");
                confirmpw.setStyle("-fx-background-color: slateblue; -fx-text-fill: white; -fx-border-color: red");
        }
        System.out.println(UserDB.getUsers());
    }

    public void createFileChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
                new ExtensionFilter("All Files", "*.*"));
        File selectedFile = fileChooser.showOpenDialog(SignupJavaFXView.getSignupStage());
     System.out.println(selectedFile.getPath());
        /*   if (selectedFile != null) {
            mainStage.display(selectedFile);
        }*/
    }
}
