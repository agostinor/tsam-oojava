package agostino.romanelli.harbour;

public class Guerra {
	
	public static void main(String[] args) {
		Sottomarino a = new Sottomarino();
		a.setModello("k47");
		a.setCodice("03151");
		a.setStazza(50);
		a.setArmamenti(10);
		System.out.println(a.getP() + ": potenza di fuoco del sottomarino modello " + a.getModello());
		System.out.println(a.metriQuadratiDistrutti() + ": metri quadrati distruttibili");
		
		ArmamentiAlpha armamentoAlpha1 = new ArmamentiAlpha();
		ArmamentiAlpha armamentoAlpha2 = new ArmamentiAlpha();
		ArmamentiBeta armamentoBeta1 = new ArmamentiBeta();
		
		ArmamentiAlpha[] armamentiAlpha = new ArmamentiAlpha[] { armamentoAlpha1, armamentoAlpha2};
		ArmamentiBeta[] armamentiBeta = new ArmamentiBeta[] {armamentoBeta1};
		
		Aereo AirForceOne = new Aereo();
		AirForceOne.setArmamentiAlpha(armamentiAlpha);
		AirForceOne.setArmamentiBeta(armamentiBeta);
		AirForceOne.setModello("USA001");
		AirForceOne.setCodice("654605");
		System.out.println(AirForceOne.getP() + ": potenza di fuoco dell'aereo modello " + a.getModello());
		System.out.println(AirForceOne.metriQuadratiDistrutti() + ": metri quadrati distruttibili");
		
		PortoNavale Porto = new PortoNavale();
		Porto.setmQuadrati(1500);
		Porto.setNome("BigPort");
		Porto.setNumeroImbarcazioni(10);
		
		System.out.println(Porto.getmQuadrati() + " tutta vita");
		
		Gioco game = new Gioco();
		Invasore[] gruppoInvasori = new Invasore[] { a, AirForceOne};
		game.infliggiDanno(Porto, gruppoInvasori);
		
		System.out.println(Porto.getmQuadrati() + " tutta vita - colpi invasori");
		game.DeadOrAlive(Porto);
		System.out.println(game.DeadOrAlive(Porto));
	}
	
	
}
