package agostino.romanelli.harbourTest;

import static org.junit.Assert.*;

import org.junit.Test;

import agostino.romanelli.harbour.Aereo;
import agostino.romanelli.harbour.ArmamentiAlpha;
import agostino.romanelli.harbour.ArmamentiBeta;
import agostino.romanelli.harbour.Gioco;
import agostino.romanelli.harbour.Invasore;
import agostino.romanelli.harbour.PortoNavale;
import agostino.romanelli.harbour.Sottomarino;

public class HarbourTest {

	@Test
	public void test() {
		Sottomarino a = new Sottomarino();
		a.setModello("k47");
		a.setCodice("03151");
		a.setStazza(50);
		a.setArmamenti(10);
		assertEquals(500, a.getP());
		assertEquals(750, a.metriQuadratiDistrutti());
		
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
		assertEquals(35, AirForceOne.getP());
		assertEquals(53, AirForceOne.metriQuadratiDistrutti());
		
		PortoNavale Porto = new PortoNavale();
		Porto.setmQuadrati(1500);
		Porto.setNome("BigPort");
		Porto.setNumeroImbarcazioni(10);

		Gioco game = new Gioco();
		Invasore[] gruppoInvasori = new Invasore[] { a, AirForceOne};
		game.infliggiDanno(Porto, gruppoInvasori);
		
		assertEquals(697, Porto.getmQuadrati());// tutta vita - colpi invasori
		game.DeadOrAlive(Porto);
		//System.out.println(game.DeadOrAlive(Porto));
		assertEquals("il porto è ancora in vita", game.DeadOrAlive(Porto));
	}

}
