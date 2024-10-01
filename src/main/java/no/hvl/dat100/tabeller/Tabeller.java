package no.hvl.dat100.tabeller;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Scanner;


public class Tabeller {
	
	public static void main(String[] args) {
		int[] tabell = {1, 3, 5, 8, 9, 11, 13, 14, 15};
		
		summer(tabell);
		reverser(tabell);
		
	}

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {
		
		int i = 0;
		int sum = 0;
		
		for (i = 0; i < tabell.length; i++) {
			
			sum += tabell[i];
			}
		
		System.out.println(sum);
		return sum;
		
		
		
		
	
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

	int[] tabell2 = new int[tabell.length];
	
		for (int i = 0; i < tabell.length; i++) {
			tabell2[i] = tabell[tabell.length - 1 - i];
			
		}
	return tabell2;
	
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
