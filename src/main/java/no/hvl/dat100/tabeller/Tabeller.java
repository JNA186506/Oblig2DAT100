package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		for (int i = 0; i < tabell.length; i++) {
			streng += tabell[i];
			if (i != tabell.length - 1) {
				streng += ",";
			}
		}
		streng += "]";
		System.out.println(streng);
		return streng;
	}

	// c)
	public static int summer(int[] tabell) {
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				funnet = true;
				break;
			}
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		throw new UnsupportedOperationException("Metoden er ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		int i = 1;
		while (sortert && i < tabell.length) {
			if (tabell[i - 1] <= tabell[i])
				i++;
			else
				sortert = false;
		}
		return sortert;
	}

	// h)

	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sattSammen = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			sattSammen[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			sattSammen[tabell1.length + i] = tabell2[i];
		}
		return sattSammen;
	}
}

