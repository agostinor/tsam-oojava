package agostino.romanelli.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import agostino.romanelli.commercialista.Attivita;
import agostino.romanelli.commercialista.Cliente;
import agostino.romanelli.commercialista.Dipendente;
import agostino.romanelli.commercialista.Imprenditore;
import agostino.romanelli.commercialista.LiberoProfessionista;

public class CommercialistaTest {

	@Test
	public void test() {
		Dipendente paolo = new Dipendente();
		paolo.setNome("Paolo");
		paolo.setCognome("Lenardi");
		paolo.setCF("CJNDJASKJDLSKSKJD");
		
		LiberoProfessionista fabrizio = new LiberoProfessionista();
		fabrizio.setNome("Fabrizio");
		fabrizio.setCognome("Romanelli");
		fabrizio.setCF("CJNDJASKJDLSKSKdd");
		fabrizio.setPIVA("01234567891");
		fabrizio.setNumeroFatture(4);

		Imprenditore agostino = new Imprenditore();
		agostino.setNome("Agostino");
		agostino.setCognome("Romanelli");
		agostino.setCF("afaisdufiausdfia");
		agostino.setNumeroFatture(200);
		agostino.setPIVA("98765432109");
		agostino.setRagioneSociale("Agos");
		
		System.out.println(paolo.calcolaParcella());
		System.out.println(fabrizio.calcolaParcella());
		System.out.println(agostino.calcolaParcella());
		
		Cliente c1 = agostino;
		Cliente c2 = paolo;
		Cliente c3 = fabrizio;
		
		Attivita a = new Attivita();
		Cliente[] client = new Cliente[] {c1,c2,c3};
		a.setClienti(client);

		assertEquals(802, a.totaleParcella());
	}

}
