package agostino.romanelli.commercialista;

public class Cliente {
	String nome;
	String Cognome;
	String CF;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getCF() {
		return CF;
	}
	public void setCF(String cF) {
		CF = cF;
	}
	
	public int calcolaParcella(){
		return 0;
	}
	
	
	
}
