package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		skrivUt(m);
	}

	// a)
	// Implementer en metode som kan skrive ut en matrise.
	public static void skrivUt(int[][] matrise) {
		
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
		
	}

	// d)
	// Implementer en metode som avgjør om to matriser gitt ved parametrene a og b
	// er like.
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
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