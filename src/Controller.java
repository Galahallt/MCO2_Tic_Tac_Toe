import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
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

    @FXML private AnchorPane playAgain;
    @FXML private Button again; // yes
    @FXML private Button exit; // no

    private Stage window = Main.getWindow();

    private ArrayList<Integer> xs = new ArrayList<>();
    private ArrayList<Integer> os = new ArrayList<>();


    private int level;
    private int scoreUser = 0;
    private int scoreComp = 0;

    public void playClicked() throws IOException {
        level = Integer.parseInt(lvlNum.getText());
        lvlNum.setText("0");
        System.out.println("Level: " + level);

        xs = new ArrayList<>();
        os = new ArrayList<>();

        Parent root = FXMLLoader.load(getClass().getResource("Versus.fxml"));
        Scene versus = new Scene(root);
        window.setScene(versus);
        window.show();
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
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck1.getChildren().add(X);

                xs.add(1);

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("One");
                }
            }
        }
    }
    public void click2() {
        if (stck2.getChildren().isEmpty())
        {
            if (!xs.contains(2) && !os.contains(2)) {
                ImageView X = new ImageView("X.png");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck2.getChildren().add(X);

                xs.add(2);

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                botMove();
                System.out.println("Two");
            }
        }

    }
    public void click3() {
        if (stck3.getChildren().isEmpty()) {
            if (!xs.contains(3) && !os.contains(3)) {
                ImageView X = new ImageView("X.png");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck3.getChildren().add(X);

                xs.add(3);

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("Three");
                }
            }
        }

    }
    public void click4() {
        if (stck4.getChildren().isEmpty())
        {
            if (!xs.contains(4) && !os.contains(4)) {
                ImageView X = new ImageView("X.png");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck4.getChildren().add(X);

                xs.add(4);

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }

                botMove();
                System.out.println("Four");
            }
        }

    }
    public void click5() {
        if (stck5.getChildren().isEmpty())
        {
            if (!xs.contains(5) && !os.contains(5)) {
                ImageView X = new ImageView("X.png");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck5.getChildren().add(X);

                xs.add(5);

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("Five");
                }
            }

        }

    }
    public void click6() {
        if (stck6.getChildren().isEmpty())
        {
            if (!xs.contains(6) && !os.contains(6)) {
                ImageView X = new ImageView("X.png");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck6.getChildren().add(X);

                xs.add(6);

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("Six");
                }
            }
        }


    }
    public void click7() {
        if (stck7.getChildren().isEmpty())
        {
            if (!xs.contains(7) && !os.contains(7)) {
                ImageView X = new ImageView("X.png");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck7.getChildren().add(X);

                xs.add(7);

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("Seven");
                }
            }
        }

    }
    public void click8() {
        if (stck8.getChildren().isEmpty())
        {
            if (!xs.contains(8) && !os.contains(8)) {
                ImageView X = new ImageView("X.png");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck8.getChildren().add(X);

                xs.add(8);

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("Eight");
                }
            }
        }

    }
    public void click9() {
        if (stck9.getChildren().isEmpty())
        {
            if (!xs.contains(9) && !os.contains(9)) {
                ImageView X = new ImageView("X.png");
                X.setFitHeight(105);
                X.setFitWidth(110);
                stck9.getChildren().add(X);

                xs.add(9);

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("User Wins!");
                }
            }
        }

    }

    public void botMove()
    {
        if (level == 0)
            level0();
    }

    public boolean canMove()
    {
        return stck1.getChildren().isEmpty() || stck2.getChildren().isEmpty() ||
                stck3.getChildren().isEmpty() || stck4.getChildren().isEmpty() ||
                stck5.getChildren().isEmpty() || stck6.getChildren().isEmpty() ||
                stck7.getChildren().isEmpty() || stck8.getChildren().isEmpty() ||
                stck9.getChildren().isEmpty();
    }

    public int hasWinningMove(ArrayList<Integer> os)
    {
        // checks horizontal
        if (os.contains(1) && os.contains(2) && !xs.contains(3))
            return 3;
        else if (os.contains(2) && os.contains(3) && !xs.contains(1))
            return 1;
        else if (os.contains(1) && os.contains(3) && !xs.contains(2))
            return 2;
        else if (os.contains(4) && os.contains(5) && !xs.contains(6))
            return 6;
        else if (os.contains(5) && os.contains(6) && !xs.contains(4))
            return 4;
        else if (os.contains(4) && os.contains(6) && !xs.contains(5))
            return 5;
        else if (os.contains(7) && os.contains(8) && !xs.contains(9))
            return 9;
        else if (os.contains(8) && os.contains(9) && !xs.contains(7))
            return 7;
        else if (os.contains(7) && os.contains(9) && !xs.contains(6))
            return 6;
        // checks diagonal
        if (os.contains(1) && os.contains(5) && !xs.contains(9))
            return 9;
        else if (os.contains(5) && os.contains(9) && !xs.contains(1))
            return 1;
        else if (os.contains(1) && os.contains(9) && !xs.contains(5))
            return 5;
        else if (os.contains(3) && os.contains(5) && !xs.contains(7))
            return 7;
        else if (os.contains(5) && os.contains(7) && !xs.contains(3))
            return 3;
        else if (os.contains(3) && os.contains(7) && !xs.contains(5))
            return 5;


        // checks vertical
        if (os.contains(1) && os.contains(4) && !xs.contains(7))
            return 7;
        else if (os.contains(4) && os.contains(7) && !xs.contains(1))
            return 1;
        else if (os.contains(1) && os.contains(7) && !xs.contains(4))
            return 4;
        else if (os.contains(2) && os.contains(5) && !xs.contains(8))
            return 8;
        else if (os.contains(5) && os.contains(8) && !xs.contains(2))
            return 2;
        else if (os.contains(2) && os.contains(8) && !xs.contains(5))
            return 5;
        else if (os.contains(3) && os.contains(6) && !xs.contains(9))
            return 9;
        else if (os.contains(6) && os.contains(9) && !xs.contains(3))
            return 3;
        else if (os.contains(3) && os.contains(9) && !xs.contains(9))
            return 9;

        return 0;
    }

    public void level0()
    {
        Random rand = new Random();
        ImageView O = new ImageView("O.png");
        O.setFitHeight(105);
        O.setFitWidth(110);
        int i = 0;

        int valid = 0;

        if (canMove())
        {
            while (valid == 0)
            {
                if (hasWinningMove(os) == 0)
                    i = 1 + rand.nextInt(10);
                else {
                    i = hasWinningMove(os);
                    System.out.println("Winning Move: " + i);
                }
                if (i == 1 && stck1.getChildren().isEmpty()) {
                    stck1.getChildren().add(O);
                    os.add(1);
                    valid = 1;
                }
                else if (i == 2 && stck2.getChildren().isEmpty()) {
                    stck2.getChildren().add(O);
                    os.add(2);
                    valid = 1;
                }
                else if (i == 3 && stck3.getChildren().isEmpty()) {
                    stck3.getChildren().add(O);
                    os.add(3);
                    valid = 1;
                }
                else if (i == 4 && stck4.getChildren().isEmpty()) {
                    stck4.getChildren().add(O);
                    os.add(4);
                    valid = 1;
                }
                else if (i == 5 && stck5.getChildren().isEmpty()) {
                    stck5.getChildren().add(O);
                    os.add(5);
                    valid = 1;
                }
                else if (i == 6 && stck6.getChildren().isEmpty()) {
                    stck6.getChildren().add(O);
                    os.add(6);
                    valid = 1;
                }
                else if (i == 7 && stck7.getChildren().isEmpty()) {
                    stck7.getChildren().add(O);
                    os.add(7);
                    valid = 1;
                }
                else if (i == 8 && stck8.getChildren().isEmpty()) {
                    stck8.getChildren().add(O);
                    os.add(8);
                    valid = 1;
                }
                else if (i == 9 && stck9.getChildren().isEmpty()) {
                    stck9.getChildren().add(O);
                    os.add(9);
                    valid = 1;
                }
            }
        }

        if (checker(os)) {
            scoreComp++;
            System.out.println("Computer Wins!");

            grid.setDisable(true);
            again.setDisable(false);
            exit.setDisable(false);
            showPlayAgain(true);
        }
    }

    public void clearGrid()
    {
        stck1.getChildren().removeAll(stck1.getChildren());
        stck2.getChildren().removeAll(stck2.getChildren());
        stck3.getChildren().removeAll(stck3.getChildren());
        stck4.getChildren().removeAll(stck4.getChildren());
        stck5.getChildren().removeAll(stck5.getChildren());
        stck6.getChildren().removeAll(stck6.getChildren());
        stck7.getChildren().removeAll(stck7.getChildren());
        stck8.getChildren().removeAll(stck8.getChildren());
        stck9.getChildren().removeAll(stck9.getChildren());
    }
    public void showPlayAgain(boolean x)
    {
        if (x)
        {
            playAgain.setDisable(false);
            playAgain.setVisible(true);
        }
        else
        {
            playAgain.setVisible(false);
            playAgain.setDisable(true);
        }
    }

    public void playAgainClicked ()
    {
        xs = new ArrayList<>();
        os = new ArrayList<>();

        grid.setDisable(false);
        clearGrid();

        dispUser.setText(Integer.toString(scoreUser));
        dispComp.setText(Integer.toString(scoreComp));

        showPlayAgain(false);
    }

    public void noClicked() throws IOException {
        clearGrid();
        Parent root = FXMLLoader.load(getClass().getResource("Level.fxml"));
        Scene level = new Scene(root);
        window.setScene(level);
        window.show();
    }

}
