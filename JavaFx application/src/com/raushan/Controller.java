package com.raushan;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Label welcomeLabel;

    @FXML
    public ChoiceBox choiceBox;

    @FXML
    public TextField textFieldArea;

    @FXML
    public Button convertButton;

    private static final String C_TO_F = "Celsius to Fahrenheit";
    private static final String F_TO_C = "Fahrenheit to Celsius";
    private boolean isC_TO_F = true;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        choiceBox.getItems().add(C_TO_F);
        choiceBox.getItems().add(F_TO_C);

        choiceBox.setValue(C_TO_F);

        choiceBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {


                if(newValue.equals(C_TO_F)){
                    isC_TO_F = true;
                }else{
                    isC_TO_F = false;
                }
            }


        });

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                convert();
            }

            private void convert() {

                String input = textFieldArea.getText();

                float enteredTemperature = 0.0f;
                try {
                    enteredTemperature = Float.parseFloat(input);
                }catch (Exception exception){
                    warnUser();
                    return;
                }


                float newTemperature = 0.0f;

                if(isC_TO_F){
                    newTemperature = (enteredTemperature * 9 / 5) + 32 ;
                }else{
                    newTemperature = (enteredTemperature - 32) * 5 / 9 ;
                }

                display(newTemperature);

            }

            private void warnUser() {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Occurred");
                alert.setHeaderText("Invalid Temperature Entered.");
                alert.setContentText("Please enter a valid temperature.");
                alert.show();
            }

            private void display(float newTemperature) {

                String unit = isC_TO_F ? "F" : "C";
                System.out.println("New Temperature is : "+ newTemperature + " "+unit);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Result");
                alert.setContentText("New Temperature is : "+ newTemperature + " "+unit);
                alert.show();

            }
        });



    }
}
