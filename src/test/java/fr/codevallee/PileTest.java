package fr.codevallee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.codevallee.Pile;

public class PileTest {
	private Pile pile;

	@Before
	public void initialition() {
		pile = new Pile();

	}

	@Test
	public void pushTest() throws Exception {
		//Ajout d'un premier élément dans la liste listPile
		pile.push("a");
		assertEquals("a", pile.listPile.get(0));
		System.out.println(pile.listPile.get(0));
		assertTrue("verif push", pile.listPile.contains("a"));
		assertTrue("verif push", pile.getTaille() !=0);
	}

	@Test
	public void popTest() throws Exception {
		
		pile.push("a");
		pile.push("b");
		int tailleList = pile.getTaille();
		System.out.println(pile.listPile.get(pile.getTaille()-1));
		pile.pop();
		
		assertTrue("verif pop", pile.getTaille() == (tailleList - 1));
		assertEquals(pile.listPile.get(0), pile.listPile.get(pile.getTaille()-1));
		//System.out.println(pile.getTaille());
	}

	@Test
	public void popAllTest() throws Exception {
		pile.popAll();
		assertTrue(pile.getTaille() == 0);
	}

	@Test
	public void peekTest() {
		pile.push("nouveau string");
		pile.push("renouveau string");
		pile.push("encore un dernier string");
		pile.peek();
		assertEquals(pile.listPile.get(pile.getTaille()-1), pile.peek());
		System.out.println(pile.listPile.get(pile.getTaille()-1));
	}

	/**
	 * @return the pile
	 */
	public Pile getPile() {
		return pile;
	}

	/**
	 * @param pile
	 *            the pile to set
	 */
	public void setPile(Pile pile) {
		this.pile = pile;
	}
}
