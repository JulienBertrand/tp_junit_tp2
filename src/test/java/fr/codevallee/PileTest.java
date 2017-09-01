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
		pile.push("a");
		assertTrue("verif push", pile.listPile.size() == 1);
		
	}
	@Test
	public void popTest() throws Exception {
		
		pile.push("a");
		int tailleList = pile.listPile.size();
		pile.pop();
		assertTrue("verif pop", pile.listPile.size()== (tailleList-1));

	}

	@Test
	public void popAllTest() throws Exception{
		pile.popAll();
		assertTrue(pile.listPile.size()==0);
	}
	@Test
	public void peekTest() {
		pile.push("nouveau string");
		pile.push("renouveau string");
		pile.peek();
		assertEquals("renouveau string", pile.peek());
	}
	
	
	
	
	
	
	/**
	 * @return the pile
	 */
	public Pile getPile() {
		return pile;
	}

	/**
	 * @param pile the pile to set
	 */
	public void setPile(Pile pile) {
		this.pile = pile;
	}
}
