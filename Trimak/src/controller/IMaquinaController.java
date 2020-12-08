package controller;

import java.sql.SQLException;

import model.Maquina;

public interface IMaquinaController {
	public void pesquisarMaquina(Maquina p) throws ClassNotFoundException, SQLException;
	public void editaMaquina(Maquina p) throws ClassNotFoundException, SQLException;
	public void salvaMaquina(Maquina p) throws ClassNotFoundException, SQLException;
	public void cancelaMaquina(Maquina p) throws ClassNotFoundException, SQLException;
}
