package com.raushan;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class Main extends Application {

    public static void main(String [] args){
        launch(args);
    }




    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new
                FXMLLoader(getClass().getResource("app_layout.fxml"));
        VBox rootNode = loader.load();

        MenuBar menuBar = createMenu();
        rootNode.getChildren().add(0, menuBar);

        Scene scene = new Scene(rootNode);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Temperature Converter App");
        primaryStage.show();

    }

    public MenuBar createMenu() {

        Menu fileMenu = new Menu("File");

        MenuItem newMenuItem = new MenuItem("New");
        SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();

       newMenuItem.setOnAction(event -> System.out.println("New Menu Item Clicked."));

        MenuItem quitMenuItem = new MenuItem("Quit");
        fileMenu.getItems().addAll(newMenuItem, separatorMenuItem, quitMenuItem);

        quitMenuItem.setOnAction(event -> {
            Platform.exit();
            System.exit(0);
        });


        Menu helpMenu = new Menu("Help");
        MenuItem aboutApp = new MenuItem("About");
        helpMenu.getItems().addAll(aboutApp);

        aboutApp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                aboutApp();
            }
        });


        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, helpMenu);

        return menuBar;
    }

    private void aboutApp() {

        Alert alertDialog = new Alert(Alert.AlertType.INFORMATION);
        alertDialog.setTitle("My First Desktop App");
        alertDialog.setHeaderText("Learning JavaFX.");
        alertDialog.setContentText("Heloo JavaFX  !");

        ButtonType yesBtn = new ButtonType("Yes");
        ButtonType noBtn = new ButtonType("No");
        alertDialog.getButtonTypes().setAll(yesBtn, noBtn);



        Optional<ButtonType> clickedBtn =  alertDialog.showAndWait();

        if (clickedBtn.isPresent() &&clickedBtn.get() == yesBtn){
            System.out.println("Yes Button is pressed !");
        }else{
            System.out.println("NO button is pressed !");
        }




    }
}
