import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Stage window = Main.getWindow();

    public void playClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Versus.fxml"));

        Scene versus = new Scene(root);

        window.setScene(versus);
        window.show();
    }

}
