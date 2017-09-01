package fr;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.codevallee.Pile;



public class PileTest {

	
	@Test
	public  void pushTest() throws Exception{
		Pile pile;
		
		List<String>listPile=new ArrayList<String>();
		listPile.add("a");
		pile.push(listPile);
		assertEquals(listPile.size()!=0, listPile.size());
//		if(listPile.contains("A")==true) {
//			
//		}
		
		
		
	}
	
}
