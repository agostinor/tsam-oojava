public class Salute {

	
	String CalcolatorIMC(Persona[] person) {
		double IMC = 0;
		for(Persona p: person) {
			IMC = p.kg / (p.m*p.m);
		}
		
		if(IMC<18.5){
			return "sottopeso";
		} else if(IMC <25){
			return "normale";
		} else if(IMC <30){
			return "sovrappeso";
		}else{
			return "obeso";
		}
	}
	
}