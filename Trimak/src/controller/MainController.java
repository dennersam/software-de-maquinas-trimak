package controller;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Maquina;

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
	private TextField txnMaquina;
	
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
	private MenuItem menuItemHelp;
	
	@FXML
	private Label lbNomeMaquina;
	
	public void sairMenuOnAction(ActionEvent event) {
		System.exit(0);
	}
	
	public void showHelpOnAction(ActionEvent event) {

	}
	
	public void sairButtonOnAction(ActionEvent event) {
		Stage stage = (Stage) btnSair.getScene().getWindow();
		stage.close();
		//System.exit(0);
	}
	

	public void pesquisarButtonOnAction(ActionEvent event) throws ParseException, ClassNotFoundException, SQLException {
		String cmd = event.getSource().toString();
		System.out.println(cmd);
		
		MaquinaController maquinaController = new MaquinaController(txnMaquina,
				txDataColeta, txMHoraUso, txMTrocaOleo, txMUInsp, txAHoraUso, txATrocaOleo, txAUInsp);
		
		if((cmd.contains("Pesquisar")) && (txnMaquina.getText().isEmpty())) {
			System.out.println("ERRO, campo n�o pode estar vazio!");
			
		}  else {
			Maquina m = new Maquina();
			m.setnMaquina(txnMaquina.getText());
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			m.setDataColeta(formato.parse(txDataColeta.getText()));
			m.setValorMedidor2(Float.valueOf(txMHoraUso.getText()));
			m.setValorMedidor5(Float.valueOf(txMTrocaOleo.getText()));
			m.setValorMedidor3(Float.valueOf(txMUInsp.getText()));
			m.setValorAcumulado2(Float.valueOf(txAHoraUso.getText()));
			m.setValorAcumulado5(Float.valueOf(txATrocaOleo.getText()));
			m.setValorAcumulado3(Float.valueOf(txAUInsp.getText()));
			maquinaController.pesquisarMaquina(m);
		}
	}
}
