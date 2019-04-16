/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
/**
 *
 * @author Matthew
 */

public class StudentRegistration extends Application {

    private TextField investmentField;
    private TextField interestRateField;
    private TextField yearsField;
    private TextField futureValueField;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Registration");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setHgap(10);
        grid.setVgap(10);

        Scene scene = new Scene(grid);

        grid.add(new Label("First Name:"), 0, 0);
        investmentField = new TextField();
        grid.add(investmentField, 1, 0);

        grid.add(new Label("Last Name:"),0, 1);
        interestRateField = new TextField();
        grid.add(interestRateField, 1, 1);

        grid.add(new Label("Year of Birth:"), 0, 2);
        yearsField = new TextField();
        grid.add(yearsField, 1, 2);

        grid.add(new Label("Temporary Password:"), 0, 3);
        futureValueField = new TextField();
        futureValueField.setEditable(false);
        grid.add(futureValueField, 1, 3);
        
        grid.add(new Label("Please enter first and last name and year of birth."), 0, 4);
        
        Button calculateButton = new Button("Register");
        calculateButton.setOnAction(
                event -> registerButtonClicked());
        
       

        Button exitButton = new Button("Exit");
        exitButton.setOnAction(
                event -> exitButtonClicked());

        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().add(calculateButton);
        buttonBox.getChildren().add(exitButton);
        buttonBox.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(buttonBox, 0, 5, 2, 1);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    private void registerButtonClicked() {
        String last = 
                investmentField.getText();
        String first =
                interestRateField.getText();
        int year = Integer.parseInt(
                yearsField.getText());

        String temp = last + "*" + year;
        
       
       if(investmentField.getText().isEmpty() || interestRateField.getText().isEmpty()|| yearsField.getText().isEmpty())
        {
            
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Invalid Entry");
        alert.setContentText("Must enter data in all fields");
        alert.showAndWait();
        futureValueField.setText(" ");
        return;
        }

        futureValueField.setText(temp);
    }

    private void exitButtonClicked() {
        
        System.exit(0);  
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
