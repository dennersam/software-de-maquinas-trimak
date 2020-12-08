package controller;

import java.sql.SQLException;

import dao.MaquinaDao;
import javafx.scene.control.TextField;
import model.Maquina;

public class MaquinaController implements IMaquinaController {
	
	private TextField txnMaquina;
	private TextField txDataColeta;
	private TextField txMHoraUso;
	private TextField txMTrocaOleo;
	private TextField txMUInsp;
	private TextField txAHoraUso;
	private TextField txATrocaOleo;
	private TextField txAUInsp;
	
	
	public MaquinaController(TextField txnMaquina, TextField txDataColeta, TextField txMHoraUso, TextField txMTrocaOleo,
			TextField txMUInsp, TextField txAHoraUso, TextField txATrocaOleo, TextField txAUInsp) {
		this.txnMaquina = txnMaquina;
		this.txDataColeta = txDataColeta;
		this.txMHoraUso = txMHoraUso;
		this.txMTrocaOleo = txMTrocaOleo;
		this.txMUInsp = txMUInsp;
		this.txAHoraUso = txAHoraUso;
		this.txATrocaOleo = txATrocaOleo;
		this.txAUInsp = txAUInsp;
	}

	@Override
	public void pesquisarMaquina(Maquina p) throws ClassNotFoundException, SQLException {
		limpaCamposMaquina();
		
		MaquinaDao pDao = new MaquinaDao();
		pDao.pesquisarMaquina(p);
		
		txnMaquina.setText(p.getnMaquina());
		txDataColeta.setText(String.valueOf(p.getDataColeta()));
		txMHoraUso.setText(String.valueOf(p.getValorMedidor2()));
		txMTrocaOleo.setText(String.valueOf(p.getValorMedidor5()));
		txMUInsp.setText(String.valueOf(p.getValorMedidor3()));
		txAHoraUso.setText(String.valueOf(p.getValorAcumulado2()));
		txATrocaOleo.setText(String.valueOf(p.getValorAcumulado5()));
		txAUInsp.setText(String.valueOf(p.getValorAcumulado3()));
	}

	@Override
	public void editaMaquina(Maquina p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvaMaquina(Maquina p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelaMaquina(Maquina p) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}
	
	private void limpaCamposMaquina() {
		txnMaquina.setText("");
		txDataColeta.setText("");
		txMHoraUso.setText("");
		txMTrocaOleo.setText("");
		txMUInsp.setText("");
		txAHoraUso.setText("");
		txATrocaOleo.setText("");
		txAUInsp.setText("");
	}
	
}
