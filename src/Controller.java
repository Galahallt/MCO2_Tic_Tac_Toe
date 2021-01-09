import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML private TextField lvlNum;

    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;
    @FXML private Button btn4;
    @FXML private Button btn5;
    @FXML private Button btn6;
    @FXML private Button btn7;
    @FXML private Button btn8;
    @FXML private Button btn9;

    private Stage window = Main.getWindow();

    private int level;

    public void playClicked() throws IOException {
        level = Integer.parseInt(lvlNum.getText());
        System.out.println("Level: " + level);

        Parent root = FXMLLoader.load(getClass().getResource("Versus.fxml"));
        Scene versus = new Scene(root);

        window.setScene(versus);
        window.show();
    }

    public void click1() {
        System.out.println("One");
    }
    public void click2() {
        System.out.println("Two");
    }
    public void click3() {
        System.out.println("Three");
    }
    public void click4() {
        System.out.println("Four");
    }
    public void click5() {
        System.out.println("Five");
    }
    public void click6() {
        System.out.println("Six");
    }
    public void click7() {
        System.out.println("Seven");
    }
    public void click8() {
        System.out.println("Eight");
    }
    public void click9() {
        System.out.println("Nine");
    }
}
