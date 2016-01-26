package agostino.romanelli.videoteca;

public class Cassetta extends Film {
	public int CostoNoleggio(){
		if(numeroGiorni>1)
			return 100*(1 + (numeroGiorni - 1)*2);
		else
			return 1;
	}
}
