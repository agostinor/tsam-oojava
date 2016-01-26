package agostino.romanelli.videoteca;

public class Dvd extends Film {
	
	public int CostoNoleggio(){
		if(numeroGiorni<=2)
			return Math.round(numeroGiorni*1.5f);
		else
			return 100*(3 + (numeroGiorni - 2) * 2);
		
	}
}
