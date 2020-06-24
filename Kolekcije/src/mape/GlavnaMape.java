package mape;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GlavnaMape {

	public static void main(String[] args) {
	
		
		//inicijalizacija mape
		Map <Integer, String> vagoni = new HashMap<Integer, String>();
		//dodajemo elemente u mapu	
		vagoni.put(45,"Zito");
		vagoni.put(67, "Dzakovi");
		vagoni.put(89, "putnici");
		vagoni.put(11,"ovde je nesto trece");
		vagoni.put(11,"bilo sta");
		vagoni.put(11,"ovde je nesto drugo");
		
		// ovako citamo odredjeni element mape
		System.out.println(vagoni.get(11));
		// prolazak kroz mapu
		for(Map.Entry me: vagoni.entrySet()) {
			System.out.println("Key: " + me.getKey());
			System.out.println("Value: " + me.getValue());
		}
		
		
		
		Map <String,String> users = new HashMap<String,String>();
			users.put("nenad123", "nenad");
			users.put("pera123", "pera");
			users.put("ruza123", "ruza");
		
		System.out.println(users.get("pera123"));
		
		for(Map.Entry me: users.entrySet()) {
			System.out.println("Pass: " + me.getKey());
			System.out.println("User name: " + me.getValue());
		}
		
		
		
		Artikal artikal1 = new Artikal();
			artikal1.setSifraArtikla(123);
			artikal1.setImArtikla("banane");
			artikal1.setCenaPoKg(100);
			artikal1.setTezina(1.4);
		
		Artikal artikal2 = new Artikal();
			artikal2.setSifraArtikla(777);
			artikal2.setImArtikla("breskve");
			artikal2.setCenaPoKg(80);
			artikal2.setTezina(2.3);
		
		Artikal artikal3 = new Artikal();
			artikal3.setSifraArtikla(890);
			artikal3.setImArtikla("sargarepa");
			artikal3.setCenaPoKg(30);
			artikal3.setTezina(5);
		
		Map<Integer, Artikal> vagica = new HashMap<Integer, Artikal>();
			vagica.put(artikal1.getSifraArtikla(), artikal1);
			vagica.put(artikal2.getSifraArtikla(), artikal2);
			vagica.put(artikal3.getSifraArtikla(), artikal3);
		
			
/*		System.out.println("Unesite sifru artikla: ");
		System.out.println("123 - banane");
		System.out.println("777 - breskve");
		System.out.println("890 - sargarepa");
		
		Scanner scanner = new Scanner(System.in);
		int sifra = scanner.nextInt();
		
		Artikal kupljeniArtikal = vagica.get(sifra);
		
		if(kupljeniArtikal != null) {
			System.out.println("Kupili ste: " + kupljeniArtikal.getImArtikla());
			System.out.println("Cena po kg je: " + kupljeniArtikal.getCenaPoKg());
			System.out.println("Kolicina u kg: " + kupljeniArtikal.getTezina());  
			System.out.println("Kostace vas: " 
					+ kupljeniArtikal.getCenaPoKg() * kupljeniArtikal.getTezina());
		}else {
			System.out.println("Ne postoji ta sifra artikla...");
		}*/
		
		for(Map.Entry me: vagica.entrySet()) {
			System.out.println("Sifra: " +  me.getKey());
			System.out.println("Ime artikla: " + ((Artikal)me.getValue()).getImArtikla());
			System.out.println("Cena artikla: " + ((Artikal)me.getValue()).getCenaPoKg());
		}
		
		
		
		
		
		
		
		

	}

}
