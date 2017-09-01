package fr.codevallee;

import java.util.ArrayList;
import java.util.List;

public class Pile {

	private int taille;

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

	List<String> listPile = new ArrayList<String>();

	public void push(String item) {
		listPile.add(item);

		// System.out.println(listPile.get(0));
	}

	public void pop() {
		int dernierElement = listPile.size()- 1;
		listPile.remove(dernierElement);
	}

	public void popAll() {
		listPile.clear();

	}

	public String peek() {
		return listPile.get(0);

	}

	/**
	 * @return the taille
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * @param taille
	 *            the taille to set
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}

}
