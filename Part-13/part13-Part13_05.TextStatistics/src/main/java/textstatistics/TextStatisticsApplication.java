package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
                
        BorderPane layout = new BorderPane();
        
        HBox xbox = new HBox();

        xbox.setSpacing(10);
        xbox.getChildren().add(new Label("Letters: 0"));
        xbox.getChildren().add(new Label("Words: 0"));
        xbox.getChildren().add(new Label("The longest word is:"));

        layout.setCenter(new TextArea(""));
        layout.setBottom(xbox);
    
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
