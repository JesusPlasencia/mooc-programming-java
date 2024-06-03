package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private boolean isXturn = true;
    private Button[][] buttons = new Button[3][3];
    private Label turnLabel = new Label("Turn: X");

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        this.turnLabel.setFont(Font.font("Monospaced", 40));
        root.setTop(turnLabel);
        GridPane grid = new GridPane();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new Button();
                buttons[i][j].setMinSize(100, 100);
                buttons[i][j].setOnAction(event -> handleButtonClick((Button) event.getSource()));
                grid.add(buttons[i][j], j, i);
            }
        }
        
        root.setCenter(grid);
        Scene scene = new Scene(root, 300, 350);
        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe");
        stage.show();
    }
    
    private void handleButtonClick(Button button) {
        if (!button.getText().isEmpty()) {
            return;
        }
        
        if (isXturn) {
            button.setText("X");
            turnLabel.setText("Turn: O");
        } else {
            button.setText("O");
            turnLabel.setText("Turn: X");
        }
        
        isXturn = !isXturn;
        
        checkForWinner();
    }

    private void checkForWinner() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(buttons[i][0].getText(), buttons[i][1].getText(), buttons[i][2].getText())) {
                announceWinner(buttons[i][0].getText());
                return;
            }
            if (checkRowCol(buttons[0][i].getText(), buttons[1][i].getText(), buttons[2][i].getText())) {
                announceWinner(buttons[0][i].getText());
                return;
            }
        }
        if (checkRowCol(buttons[0][0].getText(), buttons[1][1].getText(), buttons[2][2].getText()) || 
            checkRowCol(buttons[0][2].getText(), buttons[1][1].getText(), buttons[2][0].getText())) {
            announceWinner(buttons[1][1].getText());
        }
    }

    private boolean checkRowCol(String s1, String s2, String s3) {
        return (!s1.isEmpty() && s1.equals(s2) && s2.equals(s3));
    }

    private void announceWinner(String winner) {
        turnLabel.setText("The end!");
        disableAllButtons();
    }

    private void disableAllButtons() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setDisable(true);
            }
        }
    }
}
