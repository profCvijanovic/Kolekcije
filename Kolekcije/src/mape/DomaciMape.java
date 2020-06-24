package mape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DomaciMape {

	public static void main(String[] args) {
		
		Person person1 = new Person("Nenad","Nenadovic","0402987710129");
		Person person2 = new Person("Pera","Peric","0503988710345");
		Person person3 = new Person("Ruza","Peric","0604989715987");
		Person person4 = new Person("Nenad","Stanic","0705996715567");
		
		
		Map<String,Person> mapaOsoba = new HashMap<>();
			mapaOsoba.put(person1.getJmbg(), person1);
			mapaOsoba.put(person2.getJmbg(), person2);
			mapaOsoba.put(person3.getJmbg(), person3);
			mapaOsoba.put(person4.getJmbg(), person4);
		
	   List<Person> listaOsoba = new ArrayList<Person>();
	  		listaOsoba.add(person1);
	  		listaOsoba.add(person2);
	  		listaOsoba.add(person3);
	  		listaOsoba.add(person4);
	  	
	  	System.out.println("Prolaz kroz listu");
			for(Person p: listaOsoba) {	
				System.out.println("Osoba je");
				System.out.println("Ime: " + p.getFirstName());
				System.out.println("Prezime: " + p.getLastName());
				System.out.println("Jmbg: " + p.getJmbg());
			}
	  	
	  	System.out.println("Prolaz kroz mapu");
	  	Iterator iter = (mapaOsoba.entrySet()).iterator();
		while(iter.hasNext()) {
			Person p = (Person)iter.next();
			System.out.println("Osoba je");
			System.out.println("Ime: " + p.getFirstName());
			System.out.println("Prezime: " + p.getLastName());
			System.out.println("Jmbg: " + p.getJmbg());
		}
	  	
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite jmbg: ");
		String izabraniJmbg = scanner.nextLine();
		scanner.close();
		
		Person izabranaOsoba = mapaOsoba.get(izabraniJmbg);
		if(izabranaOsoba != null) {
			System.out.println("Izabrali ste osobu: ");
			System.out.println("Ime: " + izabranaOsoba.getFirstName());
			System.out.println("Prezime: " + izabranaOsoba.getLastName());
		}else {
			System.out.println("Osoba nije u mapi...");
		}*/

	
		
		
		
		
		

	}

}
