package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        // Layout
        BorderPane layout = new BorderPane();
        HBox xbox = new HBox();

        // Components
        TextArea area = new TextArea("");
        Label letterLbl = new Label("Letters: 0");
        Label wordLbl = new Label("Words: 0");
        Label longestLbl = new Label("The longest word is:");

        // Event Handlers
        area.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> change,
                    String oldValue, String newValue) {
                int characters = newValue.length();
                String[] parts = newValue.split(" ");
                int words = parts.length;
                String longest = Arrays.stream(parts)
                        .sorted((s1, s2) -> s2.length() - s1.length())
                        .findFirst()
                        .get();
                
                letterLbl.setText("Letters: " + characters);
                wordLbl.setText("Words: " + words);
                longestLbl.setText("The longest word is: " + longest);
            }
        });

        // Setting components inside of layout
        xbox.setSpacing(10);
        xbox.getChildren().add(letterLbl);
        xbox.getChildren().add(wordLbl);
        xbox.getChildren().add(longestLbl);

        layout.setCenter(area);
        layout.setBottom(xbox);

        // Scene and window
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
