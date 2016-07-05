package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by tkanchanawanchai6403 on 6/29/2016.
 */
public class SignupJavaFXView {

    public SignupJavaFXView() throws IOException {
        Stage signupStage = new Stage();
        Parent signupView = FXMLLoader.load(getClass().getResource("SignupJavaFx.fxml"));
        signupStage.setTitle("Signup Page");
        signupStage.setScene(new Scene(signupView, 300, 275));
        signupStage.show();

    }
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Parent loginView = FXMLLoader.load(getClass().getResource("SignupJavaFX.fxml"));
//        primaryStage.setTitle("Signup Page");
//        primaryStage.setScene(new Scene(loginView, 300, 275));
//        primaryStage.show();
//    }
}

