package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        //Layout
        BorderPane layout = new BorderPane();
        
        //Components
        TextField input = new TextField();
        Button btn = new Button("Update");
        Label label = new Label("");
        
        //Event Handling
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                label.setText(input.getText());
            }
        });
        
        //Wrapper
        VBox vbox = new VBox();

        vbox.getChildren().add(input);
        vbox.getChildren().add(btn);
        vbox.getChildren().add(label);
        
        //Setting Layout
        //layout.setLeft(vbox);
        
        //Setting scene
        Scene scene = new Scene(vbox);
        
        //Setting window
        window.setScene(scene);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
