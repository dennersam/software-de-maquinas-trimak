package controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginController implements Initializable {
	
	@FXML
	private Button btEntrar;
	@FXML
	private Button btCancelar;
	@FXML
	private Label lbMessageLogin;
	@FXML
	private ImageView imgTrimak;
	@FXML
	private TextField userTextField;
	@FXML
	private PasswordField passField;
 	
	String user = "admin";
	String pass = "admin";
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		File fotoTrimak = new File("src/img/login_painel.png");
		Image imgLocal = new Image(fotoTrimak.toURI().toString());
		imgTrimak.setImage(imgLocal);
	}
	
	
	public void loginButtonOnAction(ActionEvent event) {

		if(userTextField.getText().isBlank() == false && passField.getText().isBlank() == false) {
			user = userTextField.getText();
			pass = passField.getText();
			validateLogin();
		} else {
			lbMessageLogin.setText("Por favor, insira seu usu�rio e senha.");
		}
	}
	
	public void cancelButtonOnAction(ActionEvent event) {
		Stage stage = (Stage) btCancelar.getScene().getWindow();
		stage.close();
	}
	
	public void validateLogin() {
		if(userTextField.getText() == user && passField.getText() == pass) {
			formularioPrincipal();
		} else {
			lbMessageLogin.setText("Usu�rio e senha invalidos!");
		}
	}
	
	public void formularioPrincipal() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/view/Interface.fxml"));
			Stage cenaPrincipal = new Stage();
			cenaPrincipal.initStyle(StageStyle.UNDECORATED);
			cenaPrincipal.setScene(new Scene(root, 537, 289));
			cenaPrincipal.show();
			
		} catch (Exception e){
			e.printStackTrace();
			e.getCause();
		}
	}
}