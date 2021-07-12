package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Button playGame;

    @FXML
    public void playGame2(ActionEvent actionEvent) throws Exception{
        Stage stage = (Stage)playGame.getScene().getWindow();
        stage.close();
        Stage stage2 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Scenes/PlayGame.fxml"));
        stage2.setTitle("Tic Tac Toe");
        stage2.setScene(new Scene(root, 600, 400));
        stage2.setResizable(false);
        stage2.show();
    }
}
