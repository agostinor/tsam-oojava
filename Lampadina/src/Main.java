public class Main {

	public static void control(boolean stato) throws Fulminata{
		if(!stato){
			Fulminata a = new Fulminata();
			a.fulminata();
			throw a;
		}
	}
	
	public static void main(String[] args) {
		try{
			Circuito elettrico = new Circuito();
			Lampadina idea = new Lampadina();
			idea.setDurata(5);
			for(int i = 0; i < 5; i++){
				elettrico.SwitchOn(idea);
				control(idea.getDurata()!=0);
				elettrico.SwitchOff(idea);
				control(idea.getDurata()!=0);
			}
		} catch (Fulminata e){
			System.out.println("catch");
		}

	}
}
