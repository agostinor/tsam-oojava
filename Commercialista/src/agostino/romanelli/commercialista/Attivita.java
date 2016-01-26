package agostino.romanelli.commercialista;

public class Attivita {
	private Cliente[] clienti;
	
	public int totaleParcella() {
		int tot = 0;
		for(Cliente cli: clienti) {
			tot += cli.calcolaParcella();
		}
		return tot;
	}

	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}
}
