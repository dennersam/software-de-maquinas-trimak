package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InterfaceController{
	
	@FXML
	private Button btnSair;
	
	
	public void sairButtonOnAction(ActionEvent event) {
		Stage stage = (Stage) btnSair.getScene().getWindow();
		stage.close();
	}
	
}