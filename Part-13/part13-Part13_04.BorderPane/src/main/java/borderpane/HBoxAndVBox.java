package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HBoxAndVBox extends Application {

    @Override
    public void start(Stage window) throws Exception {

        HBox xbox = new HBox();
        VBox vbox = new VBox();

        xbox.setSpacing(10);
        xbox.getChildren().add(new Label("X"));
        xbox.getChildren().add(new Label("Y"));
        xbox.getChildren().add(new Label("Z"));

        vbox.getChildren().add(new Label("Peru"));
        vbox.getChildren().add(new Label("France"));
        vbox.getChildren().add(new Label("Argentina"));
        
        BorderPane layout = new BorderPane();
        layout.setTop(xbox);
        layout.setBottom(vbox);

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(HBoxAndVBox.class);
    }

}
