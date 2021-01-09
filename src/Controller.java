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
    private int turnCtr;

    public void playClicked() throws IOException {
        turnCtr = 0;
        level = Integer.parseInt(lvlNum.getText());
        System.out.println("Level: " + level);

        Parent root = FXMLLoader.load(getClass().getResource("Versus.fxml"));
        Scene versus = new Scene(root);

        window.setScene(versus);
        window.show();
    }

    public void click1() {
        if (turnCtr % 2 == 0) {
            ImageView X = new ImageView("X.png");
            X.setFitHeight(105);
            X.setFitWidth(110);
            stck1.getChildren().add(X);
        }
        else {
            ImageView O = new ImageView("O.png");
            O.setFitHeight(105);
            O.setFitWidth(110);
            stck1.getChildren().add(O);
        }

        turnCtr++;
        System.out.println("One");
    }
    public void click2() {
        if (turnCtr % 2 == 0) {
            ImageView X = new ImageView("X.png");
            X.setFitHeight(105);
            X.setFitWidth(110);
            stck2.getChildren().add(X);
        }
        else {
            ImageView O = new ImageView("O.png");
            O.setFitHeight(105);
            O.setFitWidth(110);
            stck2.getChildren().add(O);
        }

        turnCtr++;
        System.out.println("Two");
    }
    public void click3() {
        if (turnCtr % 2 == 0) {
            ImageView X = new ImageView("X.png");
            X.setFitHeight(105);
            X.setFitWidth(110);
            stck3.getChildren().add(X);
        }
        else {
            ImageView O = new ImageView("O.png");
            O.setFitHeight(105);
            O.setFitWidth(110);
            stck3.getChildren().add(O);
        }

        turnCtr++;
        System.out.println("Three");
    }
    public void click4() {
        if (turnCtr % 2 == 0) {
            ImageView X = new ImageView("X.png");
            X.setFitHeight(105);
            X.setFitWidth(110);
            stck4.getChildren().add(X);
        }
        else {
            ImageView O = new ImageView("O.png");
            O.setFitHeight(105);
            O.setFitWidth(110);
            stck4.getChildren().add(O);
        }

        turnCtr++;
        System.out.println("Four");
    }
    public void click5() {
        if (turnCtr % 2 == 0) {
            ImageView X = new ImageView("X.png");
            X.setFitHeight(105);
            X.setFitWidth(110);
            stck5.getChildren().add(X);
        }
        else {
            ImageView O = new ImageView("O.png");
            O.setFitHeight(105);
            O.setFitWidth(110);
            stck5.getChildren().add(O);
        }

        turnCtr++;
        System.out.println("Five");
    }
    public void click6() {
        if (turnCtr % 2 == 0) {
            ImageView X = new ImageView("X.png");
            X.setFitHeight(105);
            X.setFitWidth(110);
            stck6.getChildren().add(X);
        }
        else {
            ImageView O = new ImageView("O.png");
            O.setFitHeight(105);
            O.setFitWidth(110);
            stck6.getChildren().add(O);
        }

        turnCtr++;
        System.out.println("Six");
    }
    public void click7() {
        if (turnCtr % 2 == 0) {
            ImageView X = new ImageView("X.png");
            X.setFitHeight(105);
            X.setFitWidth(110);
            stck7.getChildren().add(X);
        }
        else {
            ImageView O = new ImageView("O.png");
            O.setFitHeight(105);
            O.setFitWidth(110);
            stck7.getChildren().add(O);
        }

        turnCtr++;
        System.out.println("Seven");
    }
    public void click8() {
        if (turnCtr % 2 == 0) {
            ImageView X = new ImageView("X.png");
            X.setFitHeight(105);
            X.setFitWidth(110);
            stck8.getChildren().add(X);
        }
        else {
            ImageView O = new ImageView("O.png");
            O.setFitHeight(105);
            O.setFitWidth(110);
            stck8.getChildren().add(O);
        }

        turnCtr++;
        System.out.println("Eight");
    }
    public void click9() {
        if (turnCtr % 2 == 0) {
            ImageView X = new ImageView("X.png");
            X.setFitHeight(105);
            X.setFitWidth(110);
            stck9.getChildren().add(X);
        }
        else {
            ImageView O = new ImageView("O.png");
            O.setFitHeight(105);
            O.setFitWidth(110);
            stck9.getChildren().add(O);
        }

        turnCtr++;
        System.out.println("Nine");
    }
}
