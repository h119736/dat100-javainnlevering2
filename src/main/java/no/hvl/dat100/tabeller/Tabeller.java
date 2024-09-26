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

		String txt = "[";

		for (int i = 0; i < tabell.length; i++) {
			if (i == tabell.length - 1) {
				txt += tabell[i];
			} else {
				txt += tabell[i] + ",";
			}
		}
		txt += "]";
		return txt;

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;

		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
			} else {
				i++;
			}

		}
		return funnet;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// som returnerer det første index (posisjon) i tabell som inneholder tallet
		// tall og -1 ellers.

		int i = 0;

		for (i = 0; i < tabell.length;) {
			if (i == tabell[0]) {
				i = tabell[0];
			} else {
				i = -1;
			}

		}
		return i;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] hjTabell = new int[tabell.length];
		int n = tabell.length;

		for (int i = n - 1; i > -1; i--) {
			hjTabell[n - i - 1] = tabell[i];

		}
		return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = false;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] > tabell[i + 1]) {
				sortert = false;
			} else {
				sortert = true;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// som gitt to tabeller tabell1 og tabell2 som parametre,
		// returnerer en ny tabell som er sammensetning av de to tabellene gitt med som
		// parameter.

		int t1 = tabell1.length;
		int t2 = tabell2.length;
		int t3 = t1 + t2;
		int[] tabell3 = new int[t3];

		for (int i = 0; i < tabell1.length; i++) {
			tabell3[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			tabell3[i] = tabell2[i];
		}
		return tabell3;
	}
}
