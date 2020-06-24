package liste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GlavnaSet {
	
	public static void main(String[] args) {
		
		List<String> imena = new ArrayList<String>();
			imena.add("Pera");
			imena.add("Nenad");
			imena.add("Pera");
		
		System.out.println("Imena iz liste su: ");
		for(String ime: imena) {
			System.out.println(ime);
		}
		
		// ovde pravim Set
		Set <String> prezimena = new HashSet<String>();
			prezimena.add("Peric");
			prezimena.add("Nenadovic");
			prezimena.add("Peric ");
			prezimena.add("Peric");
			prezimena.add("Peric");
			prezimena.add("Peric");
			prezimena.add("Milic");
		
		System.out.println("Prezimena iz seta su: ");
		for(String prezime: prezimena) {
			System.out.println(prezime);
		}
		
		System.out.println(prezimena.size());
		
		
		
		
		
		
		
		
		
		
	}

}
