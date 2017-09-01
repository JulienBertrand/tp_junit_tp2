package fr;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.codevallee.Calculatrice;
import fr.codevallee.CalculatriceImpl;

public class CalculatriceTest {

	@Before
	public void initialition() {
		calculatrice = new CalculatriceImpl();
	}

	@Test
	public void premierTest() throws Exception {
		assertEquals(1, 1);
	}

	Calculatrice calculatrice;

	@Test
	public void additionTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.addition(a, b);
		assertEquals(4.0, retour, 0.0);
	}

	@Test
	public void multiplicationTest() throws Exception {
		double c = 2;
		double d = 6;
		double retour2 = calculatrice.multiplication(c, d);
		assertEquals(12.0, retour2, 0.0);

	}

	@Test
	public void soustractionTest() throws Exception {
		double e = 1;
		double f = 3;
		double retour3 = calculatrice.soustraction(e, f);
		assertEquals(-2.0, retour3, 0.0);
	}

	@Test(expected = ArithmeticException.class)
	public void divisionTest() throws ArithmeticException {
		double g = 12;
		double h = 0;
		double retour4 = calculatrice.division(g, h);
		//assertEquals(2.0, retour4, 0.0);
	}
	@Test
	public void divisionTest2() throws  Exception {
		double g = 12;
		double h = 6;
		double retour4 = calculatrice.division(g, h);
		assertEquals(2.0, retour4, 0.0);
	}
}
