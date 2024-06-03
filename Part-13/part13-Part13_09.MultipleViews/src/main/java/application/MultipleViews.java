package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
    @Override
    public void start(Stage window) throws Exception {
        // First View
        BorderPane fstLayout = new BorderPane();
        Label titleLbl = new Label("First view!");
        Button fstBtn = new Button("To the second view!");
        fstLayout.setTop(titleLbl);
        fstLayout.setCenter(fstBtn);

        // Second View
        VBox scdLayout = new VBox();
        Button scdButton = new Button("To the third view!");
        Label descLabel = new Label("Second view!");
        scdLayout.getChildren().add(scdButton);
        scdLayout.getChildren().add(descLabel);

        // Third View
        GridPane trdLayout = new GridPane();
        Label trdLabel = new Label("Third view!");
        Button trdButton = new Button("To the first view!");
        trdLayout.add(trdLabel, 0, 0);
        trdLayout.add(trdButton, 1, 1);

        // Scenes
        Scene first = new Scene(fstLayout);
        Scene second = new Scene(scdLayout);
        Scene third = new Scene(trdLayout);
        
        // Event Handler
        fstBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                window.setScene(second);
            }
        });
        scdButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                window.setScene(third);
            }
        });
        trdButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                window.setScene(first);
            }
        });
        
        window.setScene(first);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
    
}
