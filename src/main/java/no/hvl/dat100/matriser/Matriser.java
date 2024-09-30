package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] rad : matrise) {
			for (int x : rad) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// som returnerer en streng-representation av en matrise. Om matrisen er
		// følgende:
		// { {1,2,3}, {4,5,6}, {7,8,9} }
		// 1 2 3 \n4 5 6 \n7 8 9 \n

		String tallTxt = null;
		String tallTxt1 = null;
		String a = "\n";

		for (int[] rad : matrise) {
			for (int x : rad) {
				tallTxt = " " + x;
			}
			tallTxt1 = tallTxt + a;
		}
		return tallTxt1;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		/*
		 * som returnerer en ny matrise der alle tall i matrisen er multiplisert med
		 * parameteren tall. Metoden må først opprette en ny matrise (fler-dimensjonell
		 * tabell) som er like stor som parameteren og så multiplisere alle elementer
		 * med tall.
		 * 
		 */
	
		int[][] matriseHjelp = matrise;
	
		
		for(int i =0; i < matrise.length; i++) {
			for(int j =0; j < matrise.length; j++) {
				matriseHjelp = tall * [j];
				matrise [i][j]= matriseHjelp;
			}
		} return matrise;
		
//		for (int[] rad : matrise) {
//			for(int x : rad) {
//				int y = x*tall;
//				int [] hMAtriseRad = y;
//			}
//		} matrise = hMatrise;
//				return matrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// som avgjør om to matriser gitt ved parametrene a og b er like

		boolean like = false;

		int rad1 = a.length;
		int kolonne1 = a[0].length;

		int rad2 = b.length;
		int kolonne2 = b[0].length;
		
		if(rad1 != rad2 || kolonne1 != kolonne2) {
			return like;
		}else {
			for (int i = 0; i < rad1; i++) {
			for (int j = 0; j < kolonne1; j++) {
				if(a[i][j] != b[i][j]) {
					return like;
				}else {
					like = true;
				}
			
			}
		}

	}return like;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
