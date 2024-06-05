package application;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ArrayList<String> data = loadFile();
        System.out.println(data);
        List<String> filtered = data.subList(1, data.size());
        System.out.println(filtered);

        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        for (String line : filtered) {
            // create the data set that is going to be added to the line chart
            String[] pieces = line.split("\t");
            String name = pieces[0];
            
            XYChart.Series rkpData = new XYChart.Series();
            rkpData.setName(name);
            // and single points into the data set
            rkpData.getData().add(new XYChart.Data(1968, formatData(pieces[1])));
            rkpData.getData().add(new XYChart.Data(1972, formatData(pieces[2])));
            rkpData.getData().add(new XYChart.Data(1976, formatData(pieces[3])));
            rkpData.getData().add(new XYChart.Data(1980, formatData(pieces[4])));
            rkpData.getData().add(new XYChart.Data(1984, formatData(pieces[5])));
            rkpData.getData().add(new XYChart.Data(1988, formatData(pieces[6])));
            rkpData.getData().add(new XYChart.Data(1992, formatData(pieces[7])));
            rkpData.getData().add(new XYChart.Data(1996, formatData(pieces[8])));
            rkpData.getData().add(new XYChart.Data(2000, formatData(pieces[9])));
            rkpData.getData().add(new XYChart.Data(2004, formatData(pieces[10])));
            rkpData.getData().add(new XYChart.Data(2008, formatData(pieces[11])));

            // add the data set to the line chart
            lineChart.getData().add(rkpData);
        }

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    private ArrayList<String> loadFile() throws Exception {
        ArrayList<String> lines = new ArrayList<>();
        Files.lines(Paths.get("partiesdata.tsv")).forEach(line -> {
            lines.add(line);
        });
        return lines;
    }
    
    private Double formatData (String entry) {
        if (entry.equals("-")) return 0.00;
        return Double.valueOf(entry);
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
