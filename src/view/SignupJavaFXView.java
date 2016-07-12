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

    private static Stage signupStage = new Stage();
    public SignupJavaFXView() throws IOException {

        Parent signupView = FXMLLoader.load(getClass().getResource("SignupJavaFx.fxml"));
        signupStage.setTitle("Signup Page");
        Scene signupScene = new Scene(signupView, 300, 275);
       // signupScene.getStylesheets().add("C:\\Users\\tkanchanawanchai6403\\IdeaProjects\\HelloJavaFX\\css\\mystyle.css");
        signupStage.setScene(signupScene);
        signupStage.show();
    }

    public static Stage getSignupStage() {
        return signupStage;
    }

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Parent loginView = FXMLLoader.load(getClass().getResource("SignupJavaFX.fxml"));
//        primaryStage.setTitle("Signup Page");
//        primaryStage.setScene(new Scene(loginView, 300, 275));
//        primaryStage.show();
//    }
}

