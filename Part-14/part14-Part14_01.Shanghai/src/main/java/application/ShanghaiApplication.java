package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(2007, 2017, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shangai ranking");

        // create the data set that is going to be added to the line chart
        XYChart.Series rkpData = new XYChart.Series();
        rkpData.setName("RKP");
        // and single points into the data set
        rkpData.getData().add(new XYChart.Data(2007, 73));
        rkpData.getData().add(new XYChart.Data(2008, 68));
        rkpData.getData().add(new XYChart.Data(2009, 72));
        rkpData.getData().add(new XYChart.Data(2010, 72));
        rkpData.getData().add(new XYChart.Data(2011, 74));
        rkpData.getData().add(new XYChart.Data(2012, 73));
        rkpData.getData().add(new XYChart.Data(2013, 76));
        rkpData.getData().add(new XYChart.Data(2014, 73));
        rkpData.getData().add(new XYChart.Data(2015, 67));
        rkpData.getData().add(new XYChart.Data(2016, 56));
        rkpData.getData().add(new XYChart.Data(2017, 56));
        
        // add the data set to the line chart
        lineChart.getData().add(rkpData);

        // create another data set that's going to be added to the chart
//        XYChart.Series vihrData = new XYChart.Series();
//        vihrData.setName("VIHR");
        // and single data points into the data set
//        vihrData.getData().add(new XYChart.Data(1984, 2.8));
//        vihrData.getData().add(new XYChart.Data(1988, 2.3));
//        vihrData.getData().add(new XYChart.Data(1992, 6.9));
//        vihrData.getData().add(new XYChart.Data(1996, 6.3));
//        vihrData.getData().add(new XYChart.Data(2000, 7.7));
//        vihrData.getData().add(new XYChart.Data(2004, 7.4));
//        vihrData.getData().add(new XYChart.Data(2008, 8.9));

        // add the data set to the line chart
//        lineChart.getData().add(vihrData);

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
