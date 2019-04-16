/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

import java.text.NumberFormat;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Matthew
 */
public class StudentRegistrationController {
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField yearsField;
    @FXML private TextField tempPassField;

   
    @FXML
    protected void registerbuttonclicker() {
    }    
    
    @FXML
    protected void exitbuttonclicker() {
        System.exit(0);
    }    
}
