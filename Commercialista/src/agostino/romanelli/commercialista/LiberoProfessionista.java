package agostino.romanelli.commercialista;

public class LiberoProfessionista extends Cliente {
	String PIVA;
	int numeroFatture;


	public String getPIVA() {
		return PIVA;
	}


	public void setPIVA(String pIVA) {
		PIVA = pIVA;
	}


	public int getNumeroFatture() {
		return numeroFatture;
	}


	public void setNumeroFatture(int numeroFatture) {
		this.numeroFatture = numeroFatture;
	}
	
	public int calcolaParcella() {
		return Math.round( 50 + numeroFatture * 0.5f);
	}
}