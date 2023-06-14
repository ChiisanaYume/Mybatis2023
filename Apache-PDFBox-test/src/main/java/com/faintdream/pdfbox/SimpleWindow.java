package com.faintdream.pdfbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.junit.Test;


import javax.annotation.processing.SupportedAnnotationTypes;

public class SimpleWindow extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 创建一个根容器
        StackPane root = new StackPane();

        // 创建一个标签
        Label label = new Label("Hello, JavaFX!");

        // 将标签添加到根容器中
        root.getChildren().add(label);

        // 创建一个场景
        Scene scene = new Scene(root, 300, 200);

        // 设置舞台的标题和场景
        primaryStage.setTitle("Simple Window");
        primaryStage.setScene(scene);

        // 显示窗口
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Test
    public void test(){
        launch();
    }


}
