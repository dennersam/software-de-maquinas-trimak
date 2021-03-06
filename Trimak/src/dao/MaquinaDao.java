package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Maquina;

public class MaquinaDao implements IMaquinaDao{
	
	private Connection c;
	
	public MaquinaDao() throws ClassNotFoundException, SQLException{
		GenericDao gDao = new GenericDao();
		c = gDao.getConnection();
	}

	@Override
	public Maquina pesquisarMaquina(Maquina p) throws SQLException {
		String sql = "SELECT datacoleta, valormedidor2, valormedidor5, valormedidor3, valoracumulado2, valoracumulado5, valoracumulado3 FROM ofhistindicador WHERE idobjof = ?";
		
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, p.getnMaquina());
		
		int cont = 0;
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			p.setnMaquina(rs.getString("idobjof"));
			p.setDataColeta(rs.getDate("datacoleta"));   //converter aqui de data para string
			p.setValorMedidor2(rs.getFloat("valormedidor2"));
			p.setValorMedidor5(rs.getFloat("valormedidor5"));
			p.setValorMedidor3(rs.getFloat("valormedidor3"));
			p.setValorAcumulado2(rs.getFloat("valoracumulado2"));
			p.setValorAcumulado5(rs.getFloat("valoracumulado5"));
			p.setValorAcumulado3(rs.getFloat("valoracumulado3"));
			cont++;
		}
		
		if(cont == 0) {
			p = new Maquina();
		}
		rs.close();
		ps.close();
		return p;
	}

	@Override
	public void editarMaquina(Maquina p) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarMaquina(Maquina p) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
