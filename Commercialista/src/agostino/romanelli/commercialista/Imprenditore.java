package agostino.romanelli.commercialista;

public class Imprenditore extends Cliente{
	String PIVA;
	String ragioneSociale;
	int numeroFatture;

	public String getPIVA() {
		return PIVA;
	}

	public void setPIVA(String pIVA) {
		PIVA = pIVA;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getNumeroFatture() {
		return numeroFatture;
	}

	public void setNumeroFatture(int numeroFatture) {
		this.numeroFatture = numeroFatture;
	}
	
	public int calcolaParcella() {
		if(numeroFatture>100)
			return 500 + numeroFatture;
		else
			return 500;
	}
	
}
