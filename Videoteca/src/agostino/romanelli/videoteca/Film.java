package agostino.romanelli.videoteca;

public class Film {
	String titolo;
	String nomeRegista;
	String dataProduzione;
	String[] attori;
	int numeroGiorni;
	
	public int getNumeroGiorni() {
		return numeroGiorni;
	}
	public void setNumeroGiorni(int numeroGiorni) {
		this.numeroGiorni = numeroGiorni;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getNomeRegista() {
		return nomeRegista;
	}
	public void setNomeRegista(String nomeRegista) {
		this.nomeRegista = nomeRegista;
	}
	public String getDataProduzione() {
		return dataProduzione;
	}
	public void setDataProduzione(String dataProduzione) {
		this.dataProduzione = dataProduzione;
	}
	public String[] getAttori() {
		return attori;
	}
	public void setAttori(String[] attori) {
		this.attori = attori;
	}
	
	public int CostoNoleggio(){
		return 0;
	}
}
