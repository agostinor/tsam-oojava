package agostino.romanelli.harbour;

public class Gioco {
	
	public void infliggiDanno(PortoNavale porto,Invasore[] invasori){
		int totaleDanni = 0;
		for(Invasore i: invasori){
			totaleDanni += i.metriQuadratiDistrutti();
		}
		porto.setmQuadrati(porto.getmQuadrati()-totaleDanni);
	}
	
	public String DeadOrAlive(PortoNavale porto){
		if(porto.getmQuadrati()<=0)
			return "il porto è stato distrutto";
		else
			return "il porto è ancora in vita";
	}
	
}





