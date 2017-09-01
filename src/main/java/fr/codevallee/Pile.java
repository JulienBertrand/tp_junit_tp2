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
	
	public void push(List<String> listPile2) {
		listPile.add(listPile2);

		//System.out.println(listPile.get(0));
	}

	
	public void pop() {
		int dernierElement= listPile.size()-1;
		listPile.remove(dernierElement);
	}
	
	public void popAll() {
	listPile.clear();
		
	}
	
		public String peek(String item) {
			return listPile.get(listPile.size());
			
			
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
