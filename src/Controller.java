import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.*;

public class Controller {
    @FXML private TextField lvlNum;
    @FXML private TextField dispUser;
    @FXML private TextField dispComp;

    @FXML private GridPane grid;

    @FXML private StackPane stck1;
    @FXML private StackPane stck2;
    @FXML private StackPane stck3;
    @FXML private StackPane stck4;
    @FXML private StackPane stck5;
    @FXML private StackPane stck6;
    @FXML private StackPane stck7;
    @FXML private StackPane stck8;
    @FXML private StackPane stck9;

    @FXML private Button again;
    @FXML private Button exit;

    private Stage window = Main.getWindow();

    private ArrayList<Integer> xs = new ArrayList<>();
    private ArrayList<Integer> os = new ArrayList<>();

    private int level;
    private int scoreUser = 0;
    private int scoreComp = 0;

    public void playClicked() throws IOException {
        level = Integer.parseInt(lvlNum.getText());
        System.out.println("Level: " + level);

//        xs = new ArrayList<>();
//        os = new ArrayList<>();

        Parent root = FXMLLoader.load(getClass().getResource("Versus.fxml"));
        Scene versus = new Scene(root);
        window.setScene(versus);
        window.show();

//        grid.setDisable(false);
//        again.setDisable(true);
//        exit.setDisable(true);
//
//        dispUser.setText(Integer.toString(scoreUser));
//        dispComp.setText(Integer.toString(scoreComp));
    }

    public void playAgain() throws IOException {
        xs = new ArrayList<>();
        os = new ArrayList<>();

        Parent root = FXMLLoader.load(getClass().getResource("Versus.fxml"));
        Scene versus = new Scene(root);
        window.setScene(versus);
        window.show();

        grid.setDisable(false);
        again.setDisable(true);
        exit.setDisable(true);

        dispUser.setText(Integer.toString(scoreUser));
        dispComp.setText(Integer.toString(scoreComp));
    }

    public boolean checker(ArrayList<Integer> spaces) {
        // Corners
        if (spaces.contains(1)) {
            if (spaces.contains(2)) {
                if (spaces.contains(3))
                    return true;
            }
            else if (spaces.contains(4)) {
                if (spaces.contains(7))
                    return true;
            }
            else if (spaces.contains(5)) {
                if (spaces.contains(9))
                    return true;
            }
        }
        if (spaces.contains(3)) {
            if (spaces.contains(6)) {
                if (spaces.contains(9))
                    return true;
            }
            else if (spaces.contains(5)) {
                if (spaces.contains(7))
                    return true;
            }
        }
        if (spaces.contains(9)) {
            if (spaces.contains(8))
                if (spaces.contains(7))
                    return true;
        }

        // Centers
        if (spaces.contains(2)) {
            if (spaces.contains(5))
                if (spaces.contains(8))
                    return true;
        }
        if (spaces.contains(4)) {
            if (spaces.contains(5))
                return spaces.contains(6);
        }

        return false;
    }

    public void click1() {
        if (stck1.getChildren().isEmpty())
        {
            if (!xs.contains(1) && !os.contains(1)) {
                ImageView X = new ImageView("X.png");
                X.setId("X1");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck1.getChildren().add(X);

                botMove();
                System.out.println("One");

                xs.add(1);
            }
            if (checker(xs)) {
                scoreUser++;
                System.out.println("Winner");

                grid.setDisable(true);
                again.setDisable(false);
                exit.setDisable(false);
            }
        }
    }
    public void click2() {
        if (stck2.getChildren().isEmpty())
        {
            if (!xs.contains(2) && !os.contains(2)) {
                ImageView X = new ImageView("X.png");
                X.setId("X2");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck2.getChildren().add(X);

                botMove();
                System.out.println("Two");

                xs.add(2);
            }
            if (checker(xs)) {
                scoreUser++;
                System.out.println("Winner");

                grid.setDisable(true);
                again.setDisable(false);
                exit.setDisable(false);
            }
        }

    }
    public void click3() {
        if (stck3.getChildren().isEmpty()) {
            if (!xs.contains(3) && !os.contains(3)) {
                ImageView X = new ImageView("X.png");
                X.setId("X3");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck3.getChildren().add(X);

                botMove();
                System.out.println("Three");

                xs.add(3);
            }
            if (checker(xs)) {
                scoreUser++;
                System.out.println("Winner");

                grid.setDisable(true);
                again.setDisable(false);
                exit.setDisable(false);
            }
        }

    }
    public void click4() {
        if (stck4.getChildren().isEmpty())
        {
            if (!xs.contains(4) && !os.contains(4)) {
                ImageView X = new ImageView("X.png");
                X.setId("X4");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck4.getChildren().add(X);

                botMove();
                System.out.println("Four");

                xs.add(4);
            }
            if (checker(xs)) {
                scoreUser++;
                System.out.println("Winner");

                grid.setDisable(true);
                again.setDisable(false);
                exit.setDisable(false);
            }
        }

    }
    public void click5() {
        if (stck5.getChildren().isEmpty())
        {
            if (!xs.contains(1) && !os.contains(1)) {
                ImageView X = new ImageView("X.png");
                X.setId("X5");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck5.getChildren().add(X);

                botMove();
                System.out.println("Five");

                xs.add(5);
            }
            if (checker(xs)) {
                scoreUser++;
                System.out.println("Winner");

                grid.setDisable(true);
                again.setDisable(false);
                exit.setDisable(false);
            }
        }

    }
    public void click6() {
        if (stck6.getChildren().isEmpty())
        {
            if (!xs.contains(6) && !os.contains(6)) {
                ImageView X = new ImageView("X.png");
                X.setId("X6");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck6.getChildren().add(X);

                botMove();
                System.out.println("Six");

                xs.add(6);
            }
            if (checker(xs)) {
                scoreUser++;
                System.out.println("Winner");

                grid.setDisable(true);
                again.setDisable(false);
                exit.setDisable(false);
            }
        }


    }
    public void click7() {
        if (stck7.getChildren().isEmpty())
        {
            if (!xs.contains(7) && !os.contains(7)) {
                ImageView X = new ImageView("X.png");
                X.setId("X7");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck7.getChildren().add(X);

                botMove();
                System.out.println("Seven");

                xs.add(7);
            }
            if (checker(xs)) {
                scoreUser++;
                System.out.println("Winner");

                grid.setDisable(true);
                again.setDisable(false);
                exit.setDisable(false);
            }
        }

    }
    public void click8() {
        if (stck8.getChildren().isEmpty())
        {
            if (!xs.contains(8) && !os.contains(8)) {
                ImageView X = new ImageView("X.png");
                X.setId("X8");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck8.getChildren().add(X);

                botMove();
                System.out.println("Eight");

                xs.add(8);
            }
            if (checker(xs)) {
                scoreUser++;
                System.out.println("Winner");

                grid.setDisable(true);
                again.setDisable(false);
                exit.setDisable(false);
            }
        }

    }
    public void click9() {
        if (stck9.getChildren().isEmpty())
        {
            if (!xs.contains(9) && !os.contains(9)) {
                ImageView X = new ImageView("X.png");
                X.setId("X9");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck9.getChildren().add(X);

                botMove();
                System.out.println("Nine");

                xs.add(9);
            }
            if (checker(xs)) {
                scoreUser++;
                System.out.println("Winner");

                grid.setDisable(true);
                again.setDisable(false);
                exit.setDisable(false);
            }
        }

    }

    public void botMove()
    {
        System.out.println(stck1.getChildren().contains(stck1.lookup("#X1")));
        if (level == 0)
            level0();
    }

    public boolean canMove()
    {
        if (stck1.getChildren().isEmpty() || stck2.getChildren().isEmpty() ||
                stck3.getChildren().isEmpty() || stck4.getChildren().isEmpty() ||
                stck5.getChildren().isEmpty() || stck6.getChildren().isEmpty() ||
                stck7.getChildren().isEmpty() || stck8.getChildren().isEmpty() ||
                stck9.getChildren().isEmpty())
            return true;
        return false;
    }

    public void level0()
    {
        Random rand = new Random();
        ImageView O = new ImageView("O.png");
        O.setFitHeight(105);
        O.setFitWidth(110);

        int valid = 0;

        if (canMove())
        {
            while (valid == 0)
            {
                int i = 1 + rand.nextInt(10);
                if (i == 1 && stck1.getChildren().isEmpty()) {
                    O.setId("O1");
                    stck1.getChildren().add(O);
                    valid = 1;
                }
                else if (i == 2 && stck2.getChildren().isEmpty()) {
                    O.setId("O2");
                    stck2.getChildren().add(O);
                    valid = 1;
                }
                else if (i == 3 && stck3.getChildren().isEmpty()) {
                    O.setId("O3");
                    stck3.getChildren().add(O);
                    valid = 1;
                }
                else if (i == 4 && stck4.getChildren().isEmpty()) {
                    O.setId("O4");
                    stck4.getChildren().add(O);
                    valid = 1;
                }
                else if (i == 5 && stck5.getChildren().isEmpty()) {
                    O.setId("O5");
                    stck5.getChildren().add(O);
                    valid = 1;
                }
                else if (i == 6 && stck6.getChildren().isEmpty()) {
                    O.setId("O6");
                    stck6.getChildren().add(O);
                    valid = 1;
                }
                else if (i == 7 && stck7.getChildren().isEmpty()) {
                    O.setId("O7");
                    stck7.getChildren().add(O);
                    valid = 1;
                }
                else if (i == 8 && stck8.getChildren().isEmpty()) {
                    O.setId("O8");
                    stck8.getChildren().add(O);
                    valid = 1;
                }
                else if (i == 9 && stck9.getChildren().isEmpty()) {
                    O.setId("O9");
                    stck9.getChildren().add(O);
                    valid = 1;
                }
            }
        }
    }

    public void exit() {
        System.exit(0);
    }
}
