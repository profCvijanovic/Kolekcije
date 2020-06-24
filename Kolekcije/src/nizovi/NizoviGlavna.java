package nizovi;

public class NizoviGlavna {

	public static void main(String[] args) {
		
/*	// loto izvlacenje 7 od 39
		
		int[] periniBrojevi = {1,17,5,28,31,11,38};
		
		System.out.println("Perin 5.broj je: " + periniBrojevi[4] );
		System.out.println("Brojevi su: ");
		// prolazak kroz niz
		for(int i = 0; i < periniBrojevi.length ; i++) {
			System.out.println(periniBrojevi[i]);
		}
		
		int [] izvuceniBrojevi = {2,21,33,17,12,38,31};
		
		int brojac = 0;
		for(int i = 0; i < periniBrojevi.length ; i++) {
			
			for(int j = 0; j < izvuceniBrojevi.length ; j++) {
				
				if(periniBrojevi[i] == izvuceniBrojevi[j]) {
					brojac ++;
				}
			}		
		}
		System.out.println("Pera je pogodio: " + brojac);
		
		
		//niz imena
		String[] leksikon = {"lala","pera","mika","ruza"};
		String prvoIme = leksikon[0];
		System.out.println("Prvo ime je: " + prvoIme);
		System.out.println(" U leksikon su se upisali: ");
		for(int i = 0; i < leksikon.length ; i++) {
			System.out.println(" - " + leksikon[i]);
		}
		
		// niz prezimena
		String[] prezimena = new String[4];
		prezimena[0] = "lalic";
		prezimena[1] = "peric";
		prezimena[2] = "mikic";
		prezimena[3] = "ruzic";
		System.out.println(" Prezimena su: ");
		for(int i = 0; i < prezimena.length ; i++) {
			System.out.println(" - " + prezimena[i]);
		}*/
		
		
		
		Leksikon osoba1 = new Leksikon();
		osoba1.setIme("Miki");
		osoba1.setPrezime("Maus");
		
		Leksikon osoba2 = new Leksikon();
		osoba2.setIme("Paja");
		osoba2.setPrezime("Patak");
		
		Leksikon osoba3 = new Leksikon();
		osoba3.setIme("Pera");
		osoba3.setPrezime("Detlic");
		
		Leksikon[] mojeOsobe = new Leksikon[3];
		mojeOsobe[0] = osoba1;
		mojeOsobe[1] = osoba2;
		mojeOsobe[2] = osoba3;
		System.out.println("U moj leksikon su se upisali: ");
		for(int i = 0; i < mojeOsobe.length ; i++) {
			System.out.println(mojeOsobe[i].getIme() + " " + mojeOsobe[i].getPrezime());
		}
		
		
		String[] telefoni = new String[3];
		telefoni[0] = "064222333";
		telefoni[1] = "065333444";
		telefoni[2] = "066444555";
		
		User user = new User();
		user.setIme("Ogi");
		user.setBrojeviTelefona(telefoni);
		
		System.out.println("Brojevi telefona usera " + user.getIme() + " su:");
		for(int i = 0; i < user.getBrojeviTelefona().length ; i++ ) {
			System.out.println(user.getBrojeviTelefona()[i]);
		}
		
		String probaBroj = "066444555";
		
		for(int i = 0; i < user.getBrojeviTelefona().length; i++) {
			if(user.getBrojeviTelefona()[i].equals(probaBroj)) {
				System.out.println("Jeste broj usera" + user.getIme());
			}else {
				System.out.println("Nije broj usera" + user.getIme());
			}
		}
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
