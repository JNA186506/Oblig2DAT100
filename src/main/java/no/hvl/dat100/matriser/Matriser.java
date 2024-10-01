package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		skrivUt(m);
	}

	// a)
	// Implementer en metode som kan skrive ut en matrise.
	public static void skrivUt(int[][] matrise) {
		String svar = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise.length; j++)
				svar += matrise[i][j] + " ";
			svar += "\n";
		}
		System.out.println(svar);
	}

	// b)
	// Implementer en metode som returnerer en streng-representation av en matrise.
	public static String tilStreng(int[][] matrise) {
		String str = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				str += matrise[i][j] + " ";
			}
			str += "\n";
		}
		return str;
	}

	// c)
	// Implementer en metode som returnerer en ny matrise der alle tall i matrisen
	// er multiplisert med parameteren tall. Metoden må først opprette en ny matrise
	// (fler-dimensjonell tabell) som er like stor som parameteren og så
	// multiplisere alle elementer med tall.
	public static int[][] skaler(int tall, int[][] matrise) {
		int m = matrise.length;
		int n = matrise[0].length;
		int[][] nymatrise = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				nymatrise[i][j] = tall * matrise[i][j];
			}
		}
		return nymatrise;
	}

	// d)
	// Implementer en metode som avgjør om to matriser gitt ved parametrene a og b
	// er like.
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		boolean lik = true;
		int rad1 = mat1.length;
		int kol1 = mat1[0].length;
		int rad2 = mat2.length;
		int kol2 = mat2[0].length;
		if (rad1 != rad2 || kol1 != kol2) {
			lik = false;
		} else {
			for (int i = 0; i < rad1; i++) {
				for (int j = 0; j < kol1; j++) {
					if (mat1[i][j] != mat2[i][j]) {
						lik = false;
						break;
					}
				}
			}
		}
		return lik;
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