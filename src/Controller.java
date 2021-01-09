import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {
    @FXML private TextField lvlNum;

    @FXML private StackPane stck1;
    @FXML private StackPane stck2;
    @FXML private StackPane stck3;
    @FXML private StackPane stck4;
    @FXML private StackPane stck5;
    @FXML private StackPane stck6;
    @FXML private StackPane stck7;
    @FXML private StackPane stck8;
    @FXML private StackPane stck9;

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
        ImageView X = new ImageView("X.png");
        X.setFitHeight(105);
        X.setFitWidth(110);
        stck1.getChildren().add(X);
        System.out.println("One");
    }
    public void click2() {
        ImageView X = new ImageView("X.png");
        X.setFitHeight(105);
        X.setFitWidth(110);
        stck2.getChildren().add(X);
        System.out.println("Two");
    }
    public void click3() {
        ImageView X = new ImageView("X.png");
        X.setFitHeight(105);
        X.setFitWidth(110);
        stck3.getChildren().add(X);
        System.out.println("Three");
    }
    public void click4() {
        ImageView X = new ImageView("X.png");
        X.setFitHeight(105);
        X.setFitWidth(110);
        stck4.getChildren().add(X);
        System.out.println("Four");
    }
    public void click5() {
        ImageView X = new ImageView("X.png");
        X.setFitHeight(105);
        X.setFitWidth(110);
        stck5.getChildren().add(X);
        System.out.println("Five");
    }
    public void click6() {
        ImageView X = new ImageView("X.png");
        X.setFitHeight(105);
        X.setFitWidth(110);
        stck6.getChildren().add(X);
        System.out.println("Six");
    }
    public void click7() {
        ImageView X = new ImageView("X.png");
        X.setFitHeight(105);
        X.setFitWidth(110);
        stck7.getChildren().add(X);
        System.out.println("Seven");
    }
    public void click8() {
        ImageView X = new ImageView("X.png");
        X.setFitHeight(105);
        X.setFitWidth(110);
        stck8.getChildren().add(X);
        System.out.println("Eight");
    }
    public void click9() {
        ImageView X = new ImageView("X.png");
        X.setFitHeight(105);
        X.setFitWidth(110);
        stck9.getChildren().add(X);
        System.out.println("Nine");
    }
}
