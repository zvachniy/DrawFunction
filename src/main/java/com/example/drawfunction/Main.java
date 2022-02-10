package com.example.drawfunction;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Ось X
        NumberAxis xAxis = new NumberAxis(-50, 50, 1);
        xAxis.setLabel("Ось X");
        //Ось Y
        NumberAxis yAxis = new NumberAxis   (-50, 50, 1);
        yAxis.setLabel("Ось Y");

        LineChart linechart = new LineChart(xAxis, yAxis);

        XYChart.Series series = new XYChart.Series();
        series.setName("Название графика");

        for (int x=-10; x<10; x++){
            series.getData().add(new XYChart.Data(x,-x*x));
        }

        //Указываем данные
        linechart.getData().add(series);

        //Создаем объект
        Group root = new Group(linechart);

        primaryStage.setTitle("пример функции y = -x²");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}