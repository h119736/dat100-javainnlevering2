package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");

		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.print("] ");

	}

	// b)
	public static String tilStreng(int[] tabell) {


		
		for (int i = 0; i<tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		return String ("[" + [i] + "]" );
		
	}

	// c)
	public static int summer(int[] tabell) {

		// som gitt en tabell av heltall som parameter beregner summen
		// av tallene som er lagret i tabellen.

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

		int leterEtter = tall;
		boolean funnet = false;
		int i = 0;

		while (!funnet && i < tabell.length) {
			if (tabell[i] == leterEtter) {
				funnet = true;
			} else {
				i++;
			}
			return funnet;
		}

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
