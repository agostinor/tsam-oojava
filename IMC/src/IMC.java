
public class IMC {
	public static void main(String[] args) {
		
		Persona agostino = new Persona();
		agostino.name = "agostino";
		agostino.kg = 68;
		agostino.m = 1.82;
		
		Salute oggettoMB = new Salute();
		String IMCagostino = oggettoMB.CalcolatorIMC(new Persona[] {agostino});
		System.out.println(IMCagostino);
	}
}
