package agostino.romanelli.videoteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import agostino.romanelli.videoteca.Blueray;
import agostino.romanelli.videoteca.Cassetta;
import agostino.romanelli.videoteca.Dvd;
import agostino.romanelli.videoteca.Film;
import agostino.romanelli.videoteca.Noleggio;

public class VideotecaTest {

	@Test
	public void test() {
		Cassetta ilTerzoUomo= new Cassetta();
		ilTerzoUomo.setTitolo("Il terzo uomo");
		ilTerzoUomo.setNumeroGiorni(2);
		
		
		Dvd fantasia = new Dvd();
		fantasia.setNumeroGiorni(4);
		
		Blueray lohobbit = new Blueray();
		lohobbit.setNumeroGiorni(2);
		
		Film film1 = ilTerzoUomo;
		Film film2 = fantasia;
		Film film3 = lohobbit;
		
		Noleggio a = new Noleggio();
		Film[] tuttiFilm = new Film[] {film1,film2,film3};
		a.setFilm(tuttiFilm);

		assertEquals(1210, a.totaleNoleggi());
		
	}
}
