package liste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GlavnaListe {

	public static void main(String[] args) {
		
		
		// inicijalizovali smo listu (genericka lista)
		List <Integer> listaBrojeva = new ArrayList<Integer>();
		// dodajemo elemente u listu
		listaBrojeva.add(25);
		listaBrojeva.add(7);
		listaBrojeva.add(88);
		listaBrojeva.add(2);
		listaBrojeva.add(2);
		
		// citanje elemenata iz liste
		int prviElement = listaBrojeva.get(0);
		System.out.println("Prvi element liste je: " + prviElement );
		
		// iscitavanje svih elemenata liste
		for(int i = 0; i < listaBrojeva.size(); i++ ) {
			System.out.println(listaBrojeva.get(i));
		}
		
		System.out.println("For each: ");
		for(int broj: listaBrojeva) {
			System.out.println(broj);
		}
		
		
		List<String> listaImenaGradova = new ArrayList<String>();
			listaImenaGradova.add("Beograd");
			listaImenaGradova.add("Novi Sad");
			listaImenaGradova.add("Nis");
			listaImenaGradova.add("Kragujevac");
		
		for(int i = 0; i < listaImenaGradova.size() ; i++) {
			System.out.println(listaImenaGradova.get(i));
		}
		//iz postojece liste izbrisao sam element na poziciji 1
		listaImenaGradova.remove(1);
		System.out.println("Drugi element liste posle brisanja: " + listaImenaGradova.get(1));
		System.out.println("Drugi prolaz kroz listu");
		for(int i = 0; i < listaImenaGradova.size() ; i++) {
			System.out.println(listaImenaGradova.get(i));
		}
		
		// izbrisi sve elemente iz liste
		listaImenaGradova.clear();
		System.out.println("Treci prolaz kroz listu");
		for(int i = 0; i < listaImenaGradova.size() ; i++) {
			System.out.println(listaImenaGradova.get(i));
		}
		
	/*	Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3 ; i++) {
			System.out.println("Unesite ime grada: ");
			String grad = scanner.nextLine();
			listaImenaGradova.add(grad);
		}
		scanner.close();*/
		
		// Enhanched for (ForEach)
		for(String s: listaImenaGradova) {
			System.out.println(s);
		}
		
		Osoba osoba1 = new Osoba();
			osoba1.setIme("Nenad");
			osoba1.setPrezime("Nenadovic");
		
		Osoba osoba2 = new Osoba();
			osoba2.setIme("Petar");
			osoba2.setPrezime("Petrovic");
		
		Osoba osoba3 = new Osoba();
			osoba3.setIme("Dunja");
			osoba3.setPrezime("Dunjic");
		
		List<Osoba> listaMojihOsoba = new ArrayList<Osoba>();
			listaMojihOsoba.add(osoba1);
			listaMojihOsoba.add(osoba2);
			listaMojihOsoba.add(osoba3);
		
		Osoba prvaOsoba = listaMojihOsoba.get(0);
		System.out.println("Prva osoba se zove " + prvaOsoba.getIme()
		                    + " a preziva se " + prvaOsoba.getPrezime());
		
		
		String imeOsobe2 = listaMojihOsoba.get(1).getIme();
		System.out.println("Druga osoba se zove " + imeOsobe2);
		
		System.out.println("Osobe se prezivaju: ");
		
		for(Osoba o: listaMojihOsoba) {
			System.out.println(o.getPrezime());
		}
		
		
		
	}

}
