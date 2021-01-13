/*
 *  Developed by: Paolo Espiritu
 *                James Perez
 *  Professor:    Joanna Rivera
 *  Date:         January 13, 2021
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage window;

    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("Level.fxml"));
        Scene menu = new Scene(root);

        window.setTitle("Tic Tac Toe");
        window.setScene(menu);
        window.show();
    }

    public static Stage getWindow(){
        return window;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
