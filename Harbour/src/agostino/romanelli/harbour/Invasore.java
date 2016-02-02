package agostino.romanelli.harbour;

public abstract class Invasore {
	String Modello;
	String Codice;
	int P;
	
	public int metriQuadratiDistrutti(){
		float i = 1.5f;
		return Math.round(this.P*i);
	}

	public String getModello() {
		return Modello;
	}

	public void setModello(String modello) {
		Modello = modello;
	}

	public String getCodice() {
		return Codice;
	}

	public void setCodice(String codice) {
		Codice = codice;
	}
	
	public int getP(){;
		return 0;
	}
}
