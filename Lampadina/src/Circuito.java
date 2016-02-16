
public class Circuito {
	int durata;
	
	public void SwitchOn(Lampadina lampadina){
		if(!lampadina.isStato()){
			lampadina.setDurata(lampadina.getDurata()-1);
			lampadina.setStato(true);
			System.out.println( "la lampadina è accesa");
		}else{
			System.out.println( "la lampadina rimane spenta");
		}

	}
	
	public void SwitchOff(Lampadina lampadina){
		if(lampadina.isStato()){
			lampadina.setDurata(lampadina.getDurata()-1);
			lampadina.setStato(false);
			System.out.println( "la lampadina è spenta");
		}else{
			System.out.println( "la lampadina rimane accesa");
		}
	}
}
