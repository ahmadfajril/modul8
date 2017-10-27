/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author lordius ~#
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextArea Hasil;
    @FXML
    private TextArea Saran;
    @FXML
    private RadioButton lakilaki;
    @FXML
    private ToggleGroup jk;
    @FXML
    private RadioButton perempuan;
    @FXML
    private Button proses;
    @FXML
    private Button reset;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonproses(ActionEvent event) {
    }

    @FXML
    private void buttonreset(ActionEvent event) {
    }
    
}
