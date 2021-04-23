import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import Controller.SceneController;

public class Main extends Application {


    //xmlns="http://javafx.com/javafx" xmlns:fx="http://javafx.com/fxml"

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root =
                FXMLLoader.load(getClass().getResource("/View/LoginScreen.fxml"));
        primaryStage.setTitle("E-Training");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
