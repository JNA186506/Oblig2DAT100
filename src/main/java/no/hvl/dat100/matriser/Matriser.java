package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int [][] skaler = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			skaler[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				skaler[i][j] = matrise[i][j] * tall;
			}
		}
		return skaler;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] speile = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			speile[i] = new int [matrise.length];
			for (int j = 0; j < matrise[i].length; j++) {
				speile[i][j] = matrise[j][i];
			}
		}
		return speile;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] multipliser = new int[a.length][];
		// i = rader
		// j = kolonner
		// k = ganger sammen rad0 kol0, rad1 kol1 osv.

		for (int i = 0; i < a.length; i++) {
			multipliser[i] = new int[a[i].length];
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					multipliser[i][j] += a[i][k] * b[k][j]; // Multipliser[0][0] = a[0][0] * b[0][0]
															// Multipliser[produkt][produkt] + a[1][1] * b[1][1] osv.
				}
			}
		}
		return multipliser;
	}
}
