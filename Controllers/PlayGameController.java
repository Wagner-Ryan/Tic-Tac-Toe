package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayGameController {

    @FXML
    private Label box00, box01, box02, box10, box11, box12, box20, box21, box22, player1Label, player2Label;

    @FXML
    private Button quitButton, newGameButton;

    @FXML
    private Line win00, win10, win20, win01, win11, win21, win30, win31;

    private boolean player1 = true;

    @FXML
    public void quitGame(ActionEvent actionEvent) throws Exception{
        Stage stage = (Stage)quitButton.getScene().getWindow();
        stage.close();
        Stage stage2 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Scenes/Main.fxml"));
        stage2.setTitle("Tic Tac Toe");
        stage2.setScene(new Scene(root, 600, 400));
        stage2.setResizable(false);
        stage2.show();
    }

    @FXML
    public void newGame(ActionEvent actionEvent) throws Exception{
        Stage stage = (Stage)newGameButton.getScene().getWindow();
        stage.close();
        Stage stage2 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Scenes/PlayGame.fxml"));
        stage2.setTitle("Tic Tac Toe");
        stage2.setScene(new Scene(root, 600, 400));
        stage2.setResizable(false);
        stage2.show();
    }

    @FXML
    public void switchMove(ActionEvent actionEvent) {
        if(player1){
            player1Label.setStyle("-fx-background-color: ");
            player2Label.setStyle("-fx-background-color: yellow");
            player1 = false;
        }
        else{
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            player1 = true;
        }
    }

    public void move00(MouseEvent mouseEvent) throws Exception{
        if(player1 && box00.getText().equals("")){
            player1Label.setStyle("-fx-background-color:  ");
            player2Label.setStyle("-fx-background-color: yellow");
            box00.setText("X");
            player1 = false;
            if(box01.getText().equals("X") && box02.getText().equals("X")){
                win00.setVisible(true);
                gameOver();
            }
            if(box10.getText().equals("X") && box20.getText().equals("X")){
                win01.setVisible(true);
                gameOver();
            }
            if(box11.getText().equals("X") && box22.getText().equals("X")){
                win30.setVisible(true);
                gameOver();
            }
        }
        if(!player1 && box00.getText().equals("")){
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            box00.setText("O");
            player1 = true;
            if(box01.getText().equals("O") && box02.getText().equals("O")){
                win00.setVisible(true);
                gameOver();
            }
            if(box10.getText().equals("O") && box20.getText().equals("O")){
                win01.setVisible(true);
                gameOver();
            }
            if(box11.getText().equals("O") && box22.getText().equals("O")){
                win30.setVisible(true);
                gameOver();
            }
        }
    }

    public void move01(MouseEvent mouseEvent) throws Exception{
        if(player1 && box01.getText().equals("")){
            player1Label.setStyle("-fx-background-color:  ");
            player2Label.setStyle("-fx-background-color: yellow");
            box01.setText("X");
            player1 = false;
            if(box00.getText().equals("X") && box02.getText().equals("X")){
                win00.setVisible(true);
                gameOver();
            }
            if(box11.getText().equals("X") && box21.getText().equals("X")){
                win11.setVisible(true);
                gameOver();
            }
        }
        if(!player1 && box01.getText().equals("")){
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            box01.setText("O");
            player1 = true;
            if(box00.getText().equals("O") && box02.getText().equals("O")){
                win00.setVisible(true);
                gameOver();
            }
            if(box11.getText().equals("O") && box21.getText().equals("O")){
                win11.setVisible(true);
                gameOver();
            }
        }
    }

    public void move02(MouseEvent mouseEvent) throws Exception{
        if(player1 && box02.getText().equals("")){
            player1Label.setStyle("-fx-background-color:  ");
            player2Label.setStyle("-fx-background-color: yellow");
            box02.setText("X");
            player1 = false;
            if(box01.getText().equals("X") && box00.getText().equals("X")){
                win00.setVisible(true);
                gameOver();
            }
            if(box12.getText().equals("X") && box22.getText().equals("X")){
                win21.setVisible(true);
                gameOver();
            }
            if(box11.getText().equals("X") && box20.getText().equals("X")){
                win31.setVisible(true);
                gameOver();
            }
        }
        if(!player1 && box02.getText().equals("")){
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            box02.setText("O");
            player1 = true;
            if(box01.getText().equals("O") && box00.getText().equals("O")){
                win00.setVisible(true);
                gameOver();
            }
            if(box12.getText().equals("O") && box22.getText().equals("O")){
                win21.setVisible(true);
                gameOver();
            }
            if(box11.getText().equals("O") && box20.getText().equals("O")){
                win31.setVisible(true);
                gameOver();
            }
        }
    }

    public void move10(MouseEvent mouseEvent) throws Exception{
        if(player1 && box10.getText().equals("")){
            player1Label.setStyle("-fx-background-color:  ");
            player2Label.setStyle("-fx-background-color: yellow");
            box10.setText("X");
            player1 = false;
            if(box00.getText().equals("X") && box20.getText().equals("X")){
                win01.setVisible(true);
                gameOver();
            }
            if(box11.getText().equals("X") && box12.getText().equals("X")){
                win10.setVisible(true);
                gameOver();
            }
        }
        if(!player1 && box10.getText().equals("")){
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            box10.setText("O");
            player1 = true;
            if(box00.getText().equals("O") && box20.getText().equals("O")){
                win01.setVisible(true);
                gameOver();
            }
            if(box11.getText().equals("O") && box12.getText().equals("O")){
                win10.setVisible(true);
                gameOver();
            }
        }
    }

    public void move20(MouseEvent mouseEvent) throws Exception{
        if(player1 && box20.getText().equals("")){
            player1Label.setStyle("-fx-background-color:  ");
            player2Label.setStyle("-fx-background-color: yellow");
            box20.setText("X");
            player1 = false;
            if(box00.getText().equals("X") && box10.getText().equals("X")){
                win01.setVisible(true);
                gameOver();
            }
            if(box21.getText().equals("X") && box22.getText().equals("X")){
                win20.setVisible(true);
                gameOver();
            }
            if(box02.getText().equals("X") && box11.getText().equals("X")){
                win31.setVisible(true);
                gameOver();
            }
        }
        if(!player1 && box20.getText().equals("")){
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            box20.setText("O");
            player1 = true;
            if(box00.getText().equals("O") && box10.getText().equals("O")){
                win01.setVisible(true);
                gameOver();
            }
            if(box21.getText().equals("O") && box22.getText().equals("O")){
                win20.setVisible(true);
                gameOver();
            }
            if(box02.getText().equals("O") && box11.getText().equals("O")){
                win31.setVisible(true);
                gameOver();
            }
        }
    }

    public void move11(MouseEvent mouseEvent) throws Exception{
        if(player1 && box11.getText().equals("")){
            player1Label.setStyle("-fx-background-color:  ");
            player2Label.setStyle("-fx-background-color: yellow");
            box11.setText("X");
            player1 = false;
            if(box10.getText().equals("X") && box12.getText().equals("X")){
                win10.setVisible(true);
                gameOver();
            }
            if(box01.getText().equals("X") && box21.getText().equals("X")){
                win11.setVisible(true);
                gameOver();
            }
            if(box00.getText().equals("X") && box22.getText().equals("X")){
                win30.setVisible(true);
                gameOver();
            }
            if(box02.getText().equals("X") && box20.getText().equals("X")){
                win31.setVisible(true);
                gameOver();
            }
        }
        if(!player1 && box11.getText().equals("")){
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            box11.setText("O");
            player1 = true;
            if(box10.getText().equals("O") && box12.getText().equals("O")){
                win10.setVisible(true);
                gameOver();
            }
            if(box01.getText().equals("O") && box21.getText().equals("O")){
                win11.setVisible(true);
                gameOver();
            }
            if(box00.getText().equals("O") && box22.getText().equals("O")){
                win30.setVisible(true);
                gameOver();
            }
            if(box02.getText().equals("O") && box20.getText().equals("O")){
                win31.setVisible(true);
                gameOver();
            }
        }
    }

    public void move12(MouseEvent mouseEvent) throws Exception{
        if(player1 && box12.getText().equals("")){
            player1Label.setStyle("-fx-background-color:  ");
            player2Label.setStyle("-fx-background-color: yellow");
            box12.setText("X");
            player1 = false;
            if(box02.getText().equals("X") && box22.getText().equals("X")){
                win21.setVisible(true);
                gameOver();
            }
            if(box10.getText().equals("X") && box11.getText().equals("X")){
                win10.setVisible(true);
                gameOver();
            }
        }
        if(!player1 && box12.getText().equals("")){
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            box12.setText("O");
            player1 = true;
            if(box02.getText().equals("O") && box22.getText().equals("O")){
                win21.setVisible(true);
                gameOver();
            }
            if(box10.getText().equals("O") && box11.getText().equals("O")){
                win10.setVisible(true);
                gameOver();
            }
        }
    }

    public void move21(MouseEvent mouseEvent) throws Exception{
        if(player1 && box21.getText().equals("")){
            player1Label.setStyle("-fx-background-color:  ");
            player2Label.setStyle("-fx-background-color: yellow");
            box21.setText("X");
            player1 = false;
            if(box20.getText().equals("X") && box22.getText().equals("X")){
                win20.setVisible(true);
                gameOver();
            }
            if(box01.getText().equals("X") && box11.getText().equals("X")){
                win11.setVisible(true);
                gameOver();
            }
        }
        if(!player1 && box21.getText().equals("")){
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            box21.setText("O");
            player1 = true;
            if(box20.getText().equals("O") && box22.getText().equals("O")){
                win20.setVisible(true);
                gameOver();
            }
            if(box01.getText().equals("O") && box11.getText().equals("O")){
                win11.setVisible(true);
                gameOver();
            }
        }
    }

    public void move22(MouseEvent mouseEvent) throws Exception{
        if(player1 && box22.getText().equals("")){
            player1Label.setStyle("-fx-background-color:  ");
            player2Label.setStyle("-fx-background-color: yellow");
            box22.setText("X");
            player1 = false;
            if(box02.getText().equals("X") && box12.getText().equals("X")){
                win21.setVisible(true);
                gameOver();
            }
            if(box20.getText().equals("X") && box21.getText().equals("X")){
                win20.setVisible(true);
                gameOver();
            }
            if(box00.getText().equals("X") && box11.getText().equals("X")){
                win30.setVisible(true);
                gameOver();
            }
        }
        if(!player1 && box22.getText().equals("")){
            player2Label.setStyle("-fx-background-color: ");
            player1Label.setStyle("-fx-background-color: yellow");
            box22.setText("O");
            player1 = true;
            if(box02.getText().equals("O") && box12.getText().equals("O")){
                win21.setVisible(true);
                gameOver();
            }
            if(box20.getText().equals("O") && box21.getText().equals("O")){
                win20.setVisible(true);
                gameOver();
            }
            if(box00.getText().equals("O") && box11.getText().equals("O")){
                win30.setVisible(true);
                gameOver();
            }
        }
    }

    public void gameOver() throws Exception{
        if(!player1){
            Stage stage = new Stage();
            Pane pane = new Pane();
            pane.setPrefSize(300, 200);

            Label label = new Label("Game Over!");
            label.setPrefSize(161, 28);
            label.setTranslateX(67);
            label.setTranslateY(56);
            label.setAlignment(Pos.CENTER);
            label.setStyle("-fx-font-size: 24.0");


            Label playerLabel = new Label("Player 1 won");
            playerLabel.setPrefSize(107, 17);
            playerLabel.setTranslateX(96);
            playerLabel.setTranslateY(104);
            playerLabel.setAlignment(Pos.CENTER);

            Button newGameButton1 = new Button("New Game");
            newGameButton1.setPrefSize(50, 30);
            newGameButton1.setTranslateX(82);
            newGameButton1.setTranslateY(145);
            newGameButton1.setStyle("-fx-font-size: 8.0");
            newGameButton1.setAlignment(Pos.CENTER);
            newGameButton1.setOnAction(event -> {
                Stage tempStage = (Stage)newGameButton.getScene().getWindow();
                tempStage.close();
                Stage stage1 = (Stage)newGameButton1.getScene().getWindow();
                stage1.close();
                Stage stage2 = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/Scenes/PlayGame.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage2.setTitle("Tic Tac Toe");
                stage2.setScene(new Scene(root, 600, 400));
                stage2.setResizable(false);
                stage2.show();
            });

            Button quitButton1 = new Button("Quit");
            quitButton1.setPrefSize(50, 30);
            quitButton1.setTranslateX(167);
            quitButton1.setTranslateY(145);
            quitButton1.setStyle("-fx-font-size: 8.0");
            quitButton1.setAlignment(Pos.CENTER);
            quitButton1.setOnAction(event -> {
                Stage tempStage = (Stage)newGameButton.getScene().getWindow();
                tempStage.close();
                Stage stage1 = (Stage)quitButton1.getScene().getWindow();
                stage1.close();
                Stage stage2 = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/Scenes/Main.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage2.setTitle("Tic Tac Toe");
                stage2.setScene(new Scene(root, 600, 400));
                stage2.setResizable(false);
                stage2.show();
            });

            pane.getChildren().addAll(label, playerLabel, newGameButton1, quitButton1 );

            stage.setTitle("Game Over");
            stage.setScene(new Scene(pane, 300, 200));
            stage.setResizable(false);
            stage.show();
        }
        if(player1){
            Stage stage = new Stage();
            Pane pane = new Pane();
            pane.setPrefSize(300, 200);

            Label label = new Label("Game Over!");
            label.setPrefSize(161, 28);
            label.setTranslateX(67);
            label.setTranslateY(56);
            label.setAlignment(Pos.CENTER);
            label.setStyle("-fx-font-size: 24.0");


            Label playerLabel = new Label("Player 2 won");
            playerLabel.setPrefSize(107, 17);
            playerLabel.setTranslateX(96);
            playerLabel.setTranslateY(104);
            playerLabel.setAlignment(Pos.CENTER);

            Button newGameButton1 = new Button("New Game");
            newGameButton1.setPrefSize(50, 30);
            newGameButton1.setTranslateX(82);
            newGameButton1.setTranslateY(145);
            newGameButton1.setStyle("-fx-font-size: 8.0");
            newGameButton1.setAlignment(Pos.CENTER);
            newGameButton1.setOnAction(event -> {
                Stage tempStage = (Stage)newGameButton.getScene().getWindow();
                tempStage.close();
                Stage stage1 = (Stage)newGameButton1.getScene().getWindow();
                stage1.close();
                Stage stage2 = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/Scenes/PlayGame.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage2.setTitle("Player vs Player");
                stage2.setScene(new Scene(root, 600, 400));
                stage2.setResizable(false);
                stage2.show();
            });

            Button quitButton1 = new Button("Quit");
            quitButton1.setPrefSize(50, 30);
            quitButton1.setTranslateX(167);
            quitButton1.setTranslateY(145);
            quitButton1.setStyle("-fx-font-size: 8.0");
            quitButton1.setAlignment(Pos.CENTER);
            quitButton1.setOnAction(event -> {
                Stage tempStage = (Stage)newGameButton.getScene().getWindow();
                tempStage.close();
                Stage stage1 = (Stage)quitButton.getScene().getWindow();
                stage1.close();
                Stage stage2 = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/Scenes/Main.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage2.setTitle("Tic Tac Toe");
                stage2.setScene(new Scene(root, 600, 400));
                stage2.setResizable(false);
                stage2.show();
            });

            pane.getChildren().addAll(label, playerLabel, newGameButton1, quitButton1 );

            stage.setTitle("Game Over");
            stage.setScene(new Scene(pane, 300, 200));
            stage.setResizable(false);
            stage.show();
        }
    }
}