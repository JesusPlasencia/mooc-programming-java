package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        // 1.1 Creating components to be used
        Label instructionText = new Label("Enter your name and start.");
        Button startButton = new Button("Start");
        TextField input = new TextField();

        GridPane layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(input, 0, 1);
        layout.add(startButton, 0, 2);

        // 1.3 styling the layout
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        Scene loginView = new Scene(layout);

        // 2. Creating a view for welcome
        Label welcomeText = new Label("Welcome");

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene welcomeView = new Scene(welcomeLayout);
        
        // 3. Adding Event Handler
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                welcomeText.setText("Welcome " + input.getText() + "!");
                window.setScene(welcomeView);
            }
        });
        
        window.setScene(loginView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

}
