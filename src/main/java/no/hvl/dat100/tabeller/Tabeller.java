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

		int i = 0;

		for (i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] hjTabell = new int[tabell.length];
		int n = tabell.length;

		for (int i = n - 1; i > -1; i--) {
			hjTabell[n-i-1] = tabell[i];

		}
		return hjTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int t1 = tabell1.length;
		int t2 = tabell2.length;
		int[] tabell3 = new int[t1 + t2];

		for (int i = 0; i < t1; i++) {
			tabell3[i] = tabell1[i];
		}
		for (int i = 0; i <t2; i++) {
			tabell3[t1 +i] = tabell2[i];
		}
		return tabell3;
	}
}
