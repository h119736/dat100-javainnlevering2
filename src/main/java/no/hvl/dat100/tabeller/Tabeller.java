package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// denne ser grei ut

		System.out.print("[");

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.print("] ");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String txt = "["; // ny kode

		for (int i = 0; i < tabell.length; i++) {
			// Unødvendig å printe i denne metoden. Strengen må lagres i en variabel
			// System.out.print(tabell[i] + " "); //original kode
			if (i == tabell.length - 1) { // ny kode
				txt += tabell[i]; // ny kode
			} else { // ny kode
				txt += tabell[i] + ","; // ny kode
				// if-else brukes her for å få det rette formatet på strengen ([1,2,3])
			}
		}

		txt += "]"; // ny kode

		/*
		 * [i] er hverken en streng eller en variabel, og kan ikke brukes i en streng.
		 * ordet String trengs ikke her. Enten returner en strengvariabel, eller
		 * returner strengen direkte. F.eks: return txt (der txt er en String-variabel
		 * du allerede har deklarert) ), eller return "teksten du skal returnere her"
		 */
		return txt; // ny kode
		// return String ("[" + [i] + "]" ); //original kode

	}

	// c)
	public static int summer(int[] tabell) {

		// som gitt en tabell av heltall som parameter beregner summen
		// av tallene som er lagret i tabellen.

		// denne ser grei ut

		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		/*
		 * som gitt en tabell og et tall returnerer true om tabellen tabell innholder
		 * tallet tall og false ellers.
		 */

		// variabelen leterEtter er unødvendig, man kan bruke variabelen tall direkte
		// int leterEtter = tall; //original kode

		boolean funnet = false;
		int i = 0;

		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
			} else {
				i++;
			}
			// denne må ut av while-løkken
			// return funnet; //original kode
		}

		return funnet;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
