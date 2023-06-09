package it.uniroma3.diadia.comandi;
import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoGuarda implements Comando{

	public ComandoGuarda() {}

	@Override
	public void esegui(Partita partita) {

		IO io=new IOConsole();
		io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
		io.mostraMessaggio("CFU: "+partita.getGiocatore().getCfu());

	}

	@Override
	public void setParametro(String parametro) {}
}
