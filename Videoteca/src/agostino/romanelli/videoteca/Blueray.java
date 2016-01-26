package agostino.romanelli.videoteca;

public class Blueray extends Film{
	
	public int CostoNoleggio(){
		if(numeroGiorni == 1){
			return 1;
		}else{
			float penale = 0.1f;
			int Costo = 100;
			for(int i = 1; i < numeroGiorni; i++){
				Costo += Costo + (int)(Costo*penale);
			}
			return Costo;
		}
	}
}
