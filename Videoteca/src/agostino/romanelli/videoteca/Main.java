package agostino.romanelli.videoteca;

public class Main {
	public static void main(String[] args) {
		Cassetta ilTerzoUomo= new Cassetta();
		ilTerzoUomo.setTitolo("Il terzo uomo");
		ilTerzoUomo.setNumeroGiorni(2);
		
		
		Dvd fantasia = new Dvd();
		fantasia.setNumeroGiorni(4);
		
		Blueray lohobbit = new Blueray();
		lohobbit.setNumeroGiorni(2);
		
		System.out.println(ilTerzoUomo.CostoNoleggio());
		System.out.println(fantasia.CostoNoleggio());
		System.out.println(lohobbit.CostoNoleggio());
		
		Film film1 = ilTerzoUomo;
		Film film2 = fantasia;
		Film film3 = lohobbit;
		
		Noleggio a = new Noleggio();
		Film[] tuttiFilm = new Film[] {film1,film2,film3};
		a.setFilm(tuttiFilm);
		
		System.out.println(a.totaleNoleggi());
	}
}
