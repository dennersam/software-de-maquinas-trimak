package controller;

import java.sql.Connection;
import java.sql.DriverManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MainController{
	
	@FXML
	private Button btnSair;
	
	@FXML
	private MenuItem menuItemSair;
	
	public void sairButtonOnAction(ActionEvent click) {
		Stage stage = (Stage) btnSair.getScene().getWindow();
		stage.close();
		//System.exit(0);
	}
	
	public void sairMenuOnAction(ActionEvent event) {
		System.exit(0);
	}
	
	public void pesquisarButtonOnAction(ActionEvent click) {
		try {
			Connection connection = DriverManager.getConnection(url,[])
					
		} catch (Exception e) {
			// TODO: handle exception
		} {
			
		}
	}
	
}