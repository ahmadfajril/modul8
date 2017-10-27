/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;


/**
 * FXML Controller class
 *
 * @author aldimakarim
 */
public class FXMLKesehatanController {

    @FXML
    private JFXTextField editnama;

    @FXML
    private JFXTextField editberat;

    @FXML
    private JFXTextField edittinggi;

    @FXML
    private RadioButton laki;

    @FXML
    private ToggleGroup pilihan;

    @FXML
    private RadioButton cewe;

    @FXML
    private Button editproses;

    @FXML
    private Button editreset;

    @FXML
    private TextArea edithasil;

    @FXML
    private TextArea editsaran;
    
    @FXML
    private JFXTextField editideal;

    @FXML
    void proses(ActionEvent event) {
        String nama = editnama.getText();
        int berat = Integer.parseInt(editberat.getText());
        int tinggi = Integer.parseInt(edittinggi.getText());
        String kelamin;
        int ideal = 0; 
        String hasil = null;
        String saran = null;
        
        
        
        if (laki.isSelected()) 
            kelamin = "laki-laki";
        
        else if (cewe.isSelected())
            kelamin = "perempuan";
        else
            kelamin = " ";
        
        if (laki.isSelected())
            ideal = tinggi - 110;
        else if (cewe.isSelected())
            ideal = tinggi - 100;
        
        if (berat == ideal) {
            hasil = "ideal";
            saran = "baguss";
        } else if (berat >= ideal){
            hasil = "kabotan";
            saran = "Hemat, ingat kita anak kos";
            
        }else if (berat <= ideal){
            hasil = "kurang gizi";
            saran = "Makan yang banyak bro";
    }
       edithasil.setText("Nama = "+nama+"\n Berat badan = "+berat+"\n tinggi badan = "+tinggi+"\n Jenis kelamin = "+kelamin+"\n Berat badan anda = " +hasil);
       editideal.setText(""+ideal);
       editsaran.setText("saran = "+saran);
    }

    @FXML
    void reset(ActionEvent event) {
        edithasil.setText("");
        editnama.setText("");
        editberat.setText("");
        edittinggi.setText("");
        editideal.setText("");
        laki.setSelected(false);
        cewe.setSelected(false);
        editsaran.setText("");
    }

}