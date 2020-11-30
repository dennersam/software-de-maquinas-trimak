package controller;

import java.sql.SQLException;

import dao.MaquinaDao;
import javafx.scene.control.TextField;
import model.Maquina;

public class MaquinaController implements IMaquinaController {
	
	private TextField txMaquina;
	private TextField txDataColeta;
	private TextField txMHoraUso;
	private TextField txMTrocaOleo;
	private TextField txMUInsp;
	private TextField txAHoraUso;
	private TextField txATrocaOleo;
	private TextField txAUInsp;
	
	
	public MaquinaController(TextField txMaquina, TextField txDataColeta, TextField txMHoraUso, TextField txMTrocaOleo,
			TextField txMUInsp, TextField txAHoraUso, TextField txATrocaOleo, TextField txAUInsp) {
		this.txMaquina = txMaquina;
		this.txDataColeta = txDataColeta;
		this.txMHoraUso = txMHoraUso;
		this.txMTrocaOleo = txMTrocaOleo;
		this.txMUInsp = txMUInsp;
		this.txAHoraUso = txAHoraUso;
		this.txATrocaOleo = txATrocaOleo;
		this.txAUInsp = txAUInsp;
	}

	@Override
	public void pesquisaMaquina(Maquina p) throws ClassNotFoundException, SQLException {
		limpaCamposMaquina();
		
		MaquinaDao pDao = new MaquinaDao();
		pDao.pesquisarMaquina(p);
		
		txMaquina.setText(p.getMaquina());
		txDataColeta.setText(String.valueOf(p.getDataColeta()));
		
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
		txMaquina.setText("");
		txDataColeta.setText("");
		txMHoraUso.setText("");
		txMTrocaOleo.setText("");
		txMUInsp.setText("");
		txAHoraUso.setText("");
		txATrocaOleo.setText("");
		txAUInsp.setText("");
	}
	
}
