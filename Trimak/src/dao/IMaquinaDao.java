package dao;

import java.sql.SQLException;

import model.Maquina;

public interface IMaquinaDao {
	public Maquina pesquisarMaquina(Maquina p) throws SQLException;
	public void editarMaquina(Maquina p) throws SQLException;
	public void salvarMaquina(Maquina p) throws SQLException;
	
}