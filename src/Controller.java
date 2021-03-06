/*
 *  Developed by: Paolo Espiritu
 *                James Perez
 *  Professor:    Joanna Rivera
 *  Date:         January 13, 2021
 */

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
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

    @FXML private ImageView plyrWon;
    @FXML private ImageView compWon;
    @FXML private ImageView draw;

    @FXML private AnchorPane playAgain;
    @FXML private Button again; // yes
    @FXML private Button exit; // no

    private Stage window = Main.getWindow();

    private ArrayList<Integer> xs = new ArrayList<>();
    private ArrayList<Integer> os = new ArrayList<>();

    private static int level;
    private int round = 0;
    private int turnCtr = 1;
    private int scoreUser = 0;
    private int scoreComp = 0;

    public void playClicked() throws IOException {
        level = Integer.parseInt(lvlNum.getText());
        lvlNum.setText("0");

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
            if (spaces.contains(4)) {
                if (spaces.contains(7))
                    return true;
            }
            if (spaces.contains(5)) {
                if (spaces.contains(9))
                    return true;
            }
        }
        if (spaces.contains(3)) {
            if (spaces.contains(6)) {
                if (spaces.contains(9))
                    return true;
            }
            if (spaces.contains(5)) {
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
                turnCtr++;

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");
                    plyrWon.setVisible(true);
                    compWon.setVisible(false);
                    draw.setVisible(false);

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
                turnCtr++;

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");
                    plyrWon.setVisible(true);
                    compWon.setVisible(false);
                    draw.setVisible(false);

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("Two");
                }
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
                turnCtr++;

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");
                    plyrWon.setVisible(true);
                    compWon.setVisible(false);
                    draw.setVisible(false);

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
                turnCtr++;

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");
                    plyrWon.setVisible(true);
                    compWon.setVisible(false);
                    draw.setVisible(false);

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("Four");
                }
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
                turnCtr++;

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");
                    plyrWon.setVisible(true);
                    compWon.setVisible(false);
                    draw.setVisible(false);

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
                turnCtr++;

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");
                    plyrWon.setVisible(true);
                    compWon.setVisible(false);
                    draw.setVisible(false);

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
                turnCtr++;

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");
                    plyrWon.setVisible(true);
                    compWon.setVisible(false);
                    draw.setVisible(false);

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
                turnCtr++;

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");
                    plyrWon.setVisible(true);
                    compWon.setVisible(false);
                    draw.setVisible(false);

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
                turnCtr++;

                if (checker(xs)) {
                    scoreUser++;
                    System.out.println("User Wins!");
                    plyrWon.setVisible(true);
                    compWon.setVisible(false);
                    draw.setVisible(false);

                    grid.setDisable(true);
                    again.setDisable(false);
                    exit.setDisable(false);
                    showPlayAgain(true);
                }
                else {
                    botMove();
                    System.out.println("Nine");
                }
            }
        }

    }

    public void botMove()
    {
        Timeline delay = new Timeline(
                new KeyFrame(
                        Duration.millis(400), event -> levelCall()
                )
        );
        delay.play();
    }

    public void levelCall() {
        if (level == 0) {
            level0();
        }
        else if (level == 1) {
            level1();
        }
        else if (level == 2) {
            level2();
        }
        turnCtr++;
        if (turnCtr > 9) {
            plyrWon.setVisible(false);
            compWon.setVisible(false);
            draw.setVisible(true);
            showPlayAgain(true);
        }

        if (checker(os)) {
            scoreComp++;
            System.out.println("Computer Wins!");
            plyrWon.setVisible(false);
            compWon.setVisible(true);
            draw.setVisible(false);
            grid.setDisable(true);
            again.setDisable(false);
            exit.setDisable(false);
            showPlayAgain(true);
        }
    }

    public int hasWinningMove(ArrayList<Integer> os, ArrayList<Integer> xs)
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
        else if (os.contains(7) && os.contains(9) && !xs.contains(8))
            return 8;
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
        else if (os.contains(3) && os.contains(9) && !xs.contains(6))
            return 6;

        return 0;
    }

    public boolean isCenter(ArrayList<Integer> xs) {
        return xs.contains(5);
    }

    public int opposite(int x) {
        if (x == 1)
            return 9;
        else if (x == 2)
            return 8;
        else if (x == 3)
            return 7;
        else if (x == 4)
            return 6;
        else if (x == 6)
            return 4;
        else if (x == 7)
            return 3;
        else if (x == 8)
            return 2;
        else if (x == 9)
            return 1;
        else
            return x;
    }

    public int isCorner(ArrayList<Integer> xs) {
        if (xs.contains(1))
            return 1;
        else if (xs.contains(3))
            return 3;
        else if (xs.contains(7))
            return 7;
        else if (xs.contains(9))
            return 9;
        return 0;
    }

    public int isEdge(ArrayList<Integer> xs) {
        if (xs.contains(2))
            return 2;
        else if (xs.contains(4))
            return 4;
        else if (xs.contains(6))
            return 6;
        else if (xs.contains(8))
            return 8;
        return 0;
    }

    public void addCompMove(int i)
    {
        ImageView O = new ImageView("O.png");
        O.setFitHeight(105);
        O.setFitWidth(110);

        if (i == 1 && stck1.getChildren().isEmpty()) {
            stck1.getChildren().add(O);
            os.add(1);
        }
        else if (i == 2 && stck2.getChildren().isEmpty()) {
            stck2.getChildren().add(O);
            os.add(2);
        }
        else if (i == 3 && stck3.getChildren().isEmpty()) {
            stck3.getChildren().add(O);
            os.add(3);
        }
        else if (i == 4 && stck4.getChildren().isEmpty()) {
            stck4.getChildren().add(O);
            os.add(4);
        }
        else if (i == 5 && stck5.getChildren().isEmpty()) {
            stck5.getChildren().add(O);
            os.add(5);
        }
        else if (i == 6 && stck6.getChildren().isEmpty()) {
            stck6.getChildren().add(O);
            os.add(6);
        }
        else if (i == 7 && stck7.getChildren().isEmpty()) {
            stck7.getChildren().add(O);
            os.add(7);
        }
        else if (i == 8 && stck8.getChildren().isEmpty()) {
            stck8.getChildren().add(O);
            os.add(8);
        }
        else if (i == 9 && stck9.getChildren().isEmpty()) {
            stck9.getChildren().add(O);
            os.add(9);
        }
    }

    public void level0()
    {
        Random rand = new Random();
        int i;

        int valid = 0;

        while (valid == 0)
        {
            if (hasWinningMove(os, xs) == 0)
                i = 1 + rand.nextInt(9);
            else {
                i = hasWinningMove(os, xs);
                System.out.println("Winning Move: " + i);
            }
            if (!os.contains(i) && !xs.contains(i)) {
                addCompMove(i);
                valid = 1;
            }
        }

    }

    public void level1() {
        int i = 0;
        System.out.println("Turn: " + turnCtr);
        if (hasWinningMove(os, xs) == 0 && hasWinningMove(xs, os) == 0) {
            if (turnCtr == 1)                   // always start corner
                i = 1;
            else if (turnCtr == 2) {            // take center if possible
                if (isCenter(xs))
                    i = 1;
                else
                    i = 5;
            }
            else if (turnCtr == 3) {
                if (isCenter(xs))                 // center play
                    i = 9;
                else if (isCorner(xs) > 0) {      // corner play
                    if (xs.contains(9))
                        i = 7;
                    else
                        i = 9;
                }
                else {                          // edge play
                    if (xs.contains(4))
                        i = 3;
                    else
                        i = 7;
                }
            }
            else if (turnCtr == 4) {
                if (isCenter(xs)) {                                 // center play
                    i = 3;
                }
                else if ((xs.contains(1) && xs.contains(9)) ||        // opposite corners play
                        (xs.contains(3) && xs.contains(7)))
                    i = 2;
                else if (isCorner(xs) > 0 && isEdge(xs) > 0)        // corned + edge play
                    i = opposite(isCorner(xs));
                else if (isEdge(xs) > 0 && xs.contains(opposite(isEdge(xs))))
                    i = 3;
                else if (isEdge(xs) > 0 && !xs.contains(opposite(isEdge(xs))))
                {
                    if (xs.contains(6) && xs.contains(8) ||
                            xs.contains(2) && xs.contains(4))
                        i = 3;
                    else if (xs.contains(4) && xs.contains(8) ||
                            xs.contains(2) && xs.contains(6))
                        i = 1;
                }
            }
            else if (turnCtr == 5) {
                if (xs.contains(9))                             // user takes opposite corner
                    i = 3;
                else if (os.contains(7) || os.contains(3))      // double edge play
                    i = 5;
            }
            else if (turnCtr == 6) {
                if (isCenter(os) && isCorner(os) > 0) {         // user takes corner and two opposite edges (x1, x6, x8)
                    if (isCorner(os) == 1 || isCorner(os) == 9)
                        i = 3;
                    else if (isCorner(os) == 3 || isCorner(os) == 7)
                        i = 9;
                }
                else if (isCenter(os) && isEdge(os) > 0)
                {
                    if (isEdge(os) == 4 || isEdge(os) == 6)
                        i = 2;
                    else if (isEdge(os) == 2 || isEdge(os) == 8)
                        i = 4;
                }
            }
            else if (turnCtr == 8) {
                if (isEdge(os) == 2 && isCorner(os) == 7 ||
                        isEdge(os) == 8 && isCorner(os) == 1)
                    i = 6;
                else if (isEdge(os) == 2 && isCorner(os) == 9 && !os.contains(4)||
                        isEdge(os) == 8 && isCorner(os) == 3 && !os.contains(4))
                    i = 4;
                else if (isEdge(os) == 6 && isCorner(os) == 1 && !os.contains(8) ||
                        isEdge(os) == 4 && isCorner(os) == 3 && !os.contains(8))
                    i = 8;
                else if (isEdge(os) == 6 && isCorner(os) == 7 ||
                        isEdge(os) == 4 && isCorner(os) == 9)
                    i = 2;
                else if (isCorner(os) == 1 && os.contains(6) && os.contains(8) || //oks
                        isCorner(os) == 9 && os.contains(2) && os.contains(4))
                    i = 3;
                else if (isCorner(os) == 3 && os.contains(4) && os.contains(8) ||
                        isCorner(os) == 7 && os.contains(2) && os.contains(6))
                    i = 1;
                System.out.println("i value: " + i);
            }
        }
        else {  // has a winning move
            if (hasWinningMove(os, xs) > 0) {       // take winning move
                i = hasWinningMove(os, xs);
            }
            else        // block
                i = hasWinningMove(xs, os);
        }

        // insert move
        addCompMove(i);
    }

    public void level2() {

        int bestScore = Integer.MIN_VALUE;
        int bestMove = 1;

        for (int i = 1; i <= 9; i++)
        {
            if (!os.contains(i) && !xs.contains(i))
            {
                os.add(i);
                turnCtr++;
                int score = minimax(os, xs, false);
                //System.out.println("new move: " + i + " os: " + os.toString() + " xs: " + xs.toString() + " score: " + score);

                os.remove(os.size()-1);
                turnCtr--;
                if (score > bestScore) {
                    //System.out.println("MAX: " + score + " MIN: " + bestScore + " Best Move: " + bestMove);
                    bestScore = score;
                    bestMove = i;
                    //System.out.println("Updated Best Move: " + bestMove);
                }
            }
        }
        addCompMove(bestMove);
    }

    public String pointSys(ArrayList<Integer> os, ArrayList<Integer> xs) {
        if (checker(os))
            return "win";
        else if (checker(xs))
            return "lose";
        else if (turnCtr > 9)
            return "tie";
        else
            return "null";
    }

    public int minimax(ArrayList<Integer> os, ArrayList<Integer> xs, boolean isMaximizing)
    {
        String result = pointSys(os, xs);
        if (!result.equals("null"))
        {
            int score = switch (result) {
                case "win" -> 1;
                case "lose" -> -1;
                default -> 0;
            };
            //System.out.println(score);
            return score;
        }


        int bestScore;
        if (isMaximizing)
        {
            bestScore = Integer.MIN_VALUE;
            for (int i = 1; i <= 9; i++)
            {
                if (!os.contains(i) && !xs.contains(i))
                {
                    os.add(i);
                    turnCtr++;
                    int score = minimax(os, xs, false);
                    os.remove(os.size()-1);
                    turnCtr--;
                    bestScore = Math.max(score, bestScore);
                }
            }
        }
        else {
            bestScore = Integer.MAX_VALUE;
            for (int i = 1; i <= 9; i++)
            {
                if (!os.contains(i) && !xs.contains(i))
                {
                    xs.add(i);
                    turnCtr++;
                    int score = minimax(os, xs,true);
                    xs.remove(xs.size()-1);
                    turnCtr--;
                    bestScore = Math.min(score, bestScore);
                }
            }
        }
        return bestScore;
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
        Timeline delay = new Timeline(
                new KeyFrame(
                        Duration.millis(400), event -> delayedPlayAgain(x)
                )
        );
        delay.play();
    }
    public void delayedPlayAgain(boolean x)
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
        round++;
        turnCtr = 1;

        xs = new ArrayList<>();
        os = new ArrayList<>();

        grid.setDisable(false);
        clearGrid();

        dispUser.setText(Integer.toString(scoreUser));
        dispComp.setText(Integer.toString(scoreComp));

        if (round % 2 == 1)
            botMove();

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
