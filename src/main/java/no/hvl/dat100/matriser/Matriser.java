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


		String tallTxt;
		String tallTxt1 = "";
		String a = "\n";

		for (int[] rad : matrise) {
			for (int x : rad) {
				tallTxt = x + " ";
				tallTxt1 += tallTxt;
			}
			tallTxt1 = tallTxt1 + a;
		}
		return tallTxt1;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] matriseHjelp = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseHjelp[i][j] = tall * matrise[i][j];
			}
		}
		return matriseHjelp;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// som avgjør om to matriser gitt ved parametrene a og b er like

		boolean like = false;

		int rad1 = a.length;
		int kolonne1 = a[0].length;

		int rad2 = b.length;
		int kolonne2 = b[0].length;

		if (rad1 != rad2 || kolonne1 != kolonne2) {
			return like;
		} else {
			for (int i = 0; i < rad1; i++) {
				for (int j = 0; j < kolonne1; j++) {
					if (a[i][j] != b[i][j]) {
						return like;
					} else {
						like = true;
					}

				}
			}

		}
		return like;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] matriseNy = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseNy[i][j] = matrise[j][i];
			}
		}

		return matriseNy;

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] matriseNy = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					matriseNy[i][j] += a[i][k] * b[k][j];
				}
			}
			

		}return matriseNy;
	}
}
