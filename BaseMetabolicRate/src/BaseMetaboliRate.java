
public class BaseMetaboliRate {
	public static void main(String[] args) {
		
		Person agostino = new Person();
		agostino.name = "agostino";
		agostino.surname = "romanelli";
		agostino.eta = 20;
		agostino.kg = 68;
		agostino.cm = 182;
		agostino.sex = "m";
		agostino.activity = "molto";
		
		//System.out.println(agostino.name + " fa di cognome " + agostino.surname + " e ha " + agostino.eta + " anni.");
		
		health oggettoMB = new health();
		double MBPerson = oggettoMB.CalcolatorMB(new Person[] {agostino});
		System.out.println(MBPerson);
	}
}
