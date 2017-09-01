package fr.codevallee;

import java.util.ArrayList;
import java.util.List;

public class Pile {
	private int taille;

	List<String> listPile = new ArrayList<String>();
	
	/**
	 * 
	 */
	public Pile() {
	}

	/**
	 * @param taille
	 */
	public Pile(int taille) {
		this.taille = taille;
	}

	
	public void push(String item) {
		listPile.add(item);

	
	}

	public void pop() {
		int dernierElement = getTaille()- 1;
		listPile.remove(dernierElement);
	}

	public void popAll() {
		listPile.clear();

	}

	public String peek() {
		return listPile.get(getTaille()-1);

	}

	/**
	 * @return the taille
	 */
	public int getTaille() {
		return listPile.size();
	}

	/**
	 * @param taille
	 *            the taille to set
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}

}
