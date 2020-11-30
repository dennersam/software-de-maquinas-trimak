package controller;

import java.sql.Connection;
import java.sql.DriverManager;

import dao.MaquinaDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController{
	
	@FXML
	private TextField txDataColeta;
	
	@FXML
	private TextField txMHoraUso;
	
	@FXML
	private TextField txMTrocaOleo;
	
	@FXML
	private TextField txMUInsp;
	
	@FXML
	private TextField txMaquina;
	
	@FXML
	private Button btnPesquisar;
	
	@FXML
	private TextField txAHoraUso;
	
	@FXML
	private TextField txATrocaOleo;
	
	@FXML
	private TextField txAUInsp;
	
	@FXML
	private Button btnEditar;
	
	@FXML
	private Button btnSalvar;
	
	@FXML
	private Button btnSair;
	
	@FXML
	private Button btnCancelar;
	
	@FXML
	private MenuItem menuItemSair;
	
	@FXML
	private Label lbNomeMaquina;
	
	public void sairButtonOnAction(ActionEvent click) {
		Stage stage = (Stage) btnSair.getScene().getWindow();
		stage.close();
		//System.exit(0);
	}
	
	public void sairMenuOnAction(ActionEvent event) {
		System.exit(0);
	}
	
	public void pesquisarButtonOnAction(ActionEvent event) {
		
		MaquinaController maquinaController = new MaquinaController(txMaquina, txDataColeta, txMHoraUso, txMTrocaOleo, txMUInsp, txAHoraUso, txATrocaOleo, txAUInsp);
		maquinaController.pesquisaMaquina(txMaquina);
	}
	
}
