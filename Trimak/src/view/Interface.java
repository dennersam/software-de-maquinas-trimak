package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Interface extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent telaLogin = FXMLLoader.load(getClass().getResource("login.fxml"));
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setScene(new Scene(telaLogin, 550, 400));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}




/*
 * MenuBar menu = new MenuBar(); Menu arquivo = new Menu("Arquivo");
 * menu.getMenus().add(arquivo);
 * 
 * MenuItem fechar = new MenuItem("Fechar"); arquivo.getItems().add(fechar);
 * fechar.setOnAction(e -> {System.exit(0);});
 * 
 * Label labelMaquina = new Label("N� Maquina:");
 * labelMaquina.getStyleClass().add("spaceLeft"); TextField textMaq = new
 * TextField();
 * 
 * Button pesquisar = new Button("Pesquisar"); pesquisar.setOnAction(e -> {
 * 
 * });
 * 
 * Label dataColeta = new Label("Data da Coleta: ");
 * dataColeta.getStyleClass().add("spaceLeft"); TextField textColeta = new
 * TextField(); textColeta.setDisable(true);
 * 
 * Label horasMed = new Label("M - Horas de uso:");
 * horasMed.getStyleClass().add("spaceLeft"); TextField textHoras = new
 * TextField(); textHoras.setDisable(true);
 * 
 * Label horasAc = new Label("A - Horas de uso:"); TextField textHorasAc = new
 * TextField(); textHorasAc.setDisable(true);
 * 
 * Label trocOleoM = new Label("M - Ult Troca de Oleo:");
 * trocOleoM.getStyleClass().add("spaceLeft"); TextField textTroca = new
 * TextField(); textTroca.setDisable(true);
 * 
 * Label trocOleoA = new Label("A - Ult Troca de Oleo:"); TextField textOleoA =
 * new TextField(); textOleoA.setDisable(true);
 * 
 * Label ultInspecM = new Label("M - Ultima Inspe��o:");
 * ultInspecM.getStyleClass().add("spaceLeft"); TextField textInspecM = new
 * TextField(); textInspecM.setDisable(true);
 * 
 * Label ultInspecA = new Label("A - Ultima Inspe��o:"); TextField textInspecA =
 * new TextField(); textInspecA.setDisable(true);
 * 
 * Button salvar = new Button("Salvar"); salvar.setDisable(true);
 * 
 * Button novo = new Button("Novo"); novo.setOnAction(e -> {
 * 
 * textColeta.setDisable(false); textHoras.setDisable(false);
 * textHorasAc.setDisable(false); textTroca.setDisable(false);
 * textOleoA.setDisable(false); textInspecM.setDisable(false);
 * textInspecA.setDisable(false); salvar.setDisable(false); });
 * 
 * Button cancelar = new Button("Cancelar"); cancelar.setOnAction(e -> {
 * textColeta.setText(null); textHoras.setText(null); textHorasAc.setText(null);
 * textTroca.setText(null); textOleoA.setText(null); textInspecM.setText(null);
 * textInspecA.setText(null); textColeta.setDisable(true);
 * textHoras.setDisable(true); textHorasAc.setDisable(true);
 * textTroca.setDisable(true); textOleoA.setDisable(true);
 * textInspecM.setDisable(true); textInspecA.setDisable(true);
 * salvar.setDisable(true); }); Button fecharProg = new Button("Fechar");
 * fecharProg.setOnAction(e -> { System.exit(0); });
 * 
 * HBox maq = new HBox(); maq.setSpacing(10);
 * maq.getChildren().add(labelMaquina); maq.getChildren().add(textMaq);
 * maq.getChildren().add(pesquisar);
 * 
 * 
 * HBox coleta = new HBox(); coleta.setSpacing(10);
 * coleta.getChildren().add(dataColeta); coleta.getChildren().add(textColeta);
 * 
 * 
 * HBox horas = new HBox(); horas.setSpacing(10);
 * horas.getChildren().add(horasMed); horas.getChildren().add(textHoras);
 * horas.getChildren().add(horasAc); horas.getChildren().add(textHorasAc);
 * 
 * HBox troca = new HBox(); troca.setSpacing(10);
 * troca.getChildren().add(trocOleoM); troca.getChildren().add(textTroca);
 * troca.getChildren().add(trocOleoA); troca.getChildren().add(textOleoA);
 * 
 * HBox inspec = new HBox(); inspec.setSpacing(10);
 * inspec.getChildren().add(ultInspecM); inspec.getChildren().add(textInspecM);
 * inspec.getChildren().add(ultInspecA); inspec.getChildren().add(textInspecA);
 * 
 * HBox botoes = new HBox(); botoes.setSpacing(10);
 * botoes.setAlignment(Pos.BOTTOM_LEFT); botoes.getChildren().add(novo);
 * botoes.getChildren().add(salvar); botoes.getChildren().add(cancelar);
 * botoes.getChildren().add(fecharProg);
 * 
 * VBox conteudo = new VBox(menu); conteudo.getStyleClass().add("conteudo");
 * conteudo.setSpacing(10); conteudo.getChildren().add(maq);
 * conteudo.getChildren().add(coleta); conteudo.getChildren().add(horas);
 * conteudo.getChildren().add(troca); conteudo.getChildren().add(inspec);
 * conteudo.getChildren().add(botoes);
 * 
 * String cssPath = getClass()
 * .getResource("/view/Interface.css").toExternalForm();
 * 
 * Scene cenaPrincipal = new Scene(conteudo, 600, 250);
 * cenaPrincipal.getStylesheets().add(cssPath);
 * 
 * primaryStage.setResizable(false);
 * primaryStage.setTitle("Gest�o de M�quinas");
 * primaryStage.setScene(cenaPrincipal); primaryStage.show();
 */