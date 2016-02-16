package main;

import java.util.ArrayList;

/**
 * Gestisce le parcelle dei propri Clienti.
 *
 */
public class Commercialista {
	ArrayList<Cliente> ListaClienti = new ArrayList();
	ArrayList<Cliente> ListaClienti1Duplicati = new ArrayList();
	/**
	 * Calcola il totale delle parcelle di tutti i clienti univoci (ovvero NON
	 * vengono considerati le parcelle di eventuali clienti duplicati). 
	 * @return il totale delle parcelle
	 */
	
	public int totaleParcelle() {
		if(ListaClienti == null)
			return 0;
		
			int totaleParcelle = 0;
			for(Cliente c: ListaClienti){
				totaleParcelle += c.calcolaParcella();
			}
			return totaleParcelle;
	}
	
	/**
	 * Inserisce un nuovo cliente, verificando che
	 * non sia già stato inserito.
	 * @param d dipendente
	 */
	public void addCliente(Cliente d) {
		if(!ListaClienti.contains(d))
		ListaClienti.add(d);
	}
	
	
	/**
	 * Restituisce il numero di volte che all'atto dell'inserimento di
	 * un cliente, il cliente era già stato inserito. 
	 * @return
	 */
	public int clientiDuplicati() {
			return 0;
	}
	
	/**
	 * Dato un cliente, restituisce il numero di volte che lo stesso
	 * cliente è stato inserito tramite le funzione addCliente.
	 * Nel caso che un dato cliente sia stato inserito una sola volta,
	 * restituisce il valore 1. 
	 * @param d cliente da verificare
	 * @return numero di ripetizioni.
	 */
	public int numeroRipetizioni(Cliente d) {
		int contaClientiDuplicati = 0;
		/*if(!ListaClienti1Duplicati.contains(d)){
			ListaClienti1Duplicati.add(d);
		}
		else{
			contaClientiDuplicati++;
		}*/
		return contaClientiDuplicati;
	}

}
