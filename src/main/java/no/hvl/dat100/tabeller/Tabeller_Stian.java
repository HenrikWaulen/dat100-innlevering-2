package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i=0; i<tabell.length; i++){
				System.out.print(tabell[i] + " ");
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String resultat = "[";
		for (int i = 0; i < tabell.length; i++) {
			resultat += tabell[i];

        	if (i < tabell.length - 1) {
            resultat += ",";
        	}
    	}
    	resultat += "]";
    	return resultat;
	}

	// c)
	public static int summer(int[] tabell) {
		int result = 0;
		for (int i = 0; i<tabell.length; i++) {
			result += tabell[i];
		}
		return result;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean result = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				result = true;
				break;
			}
		}
		
		return result;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int result = -1;
		for (int i = 0; i<tabell.length; i++) {
			if (tall == tabell[i]) {
				return  i;
			}
		}
		return result;	
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] result = new int[tabell.length];

		int j = 0;

		for (int i = tabell.length - 1; i >= 0; i--) {
			result[j] = tabell[i];
			j++;
		}

		return result;
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
		int[] result = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			result[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {
			result[tabell1.length + i] = tabell2[i];
		}

		return result;
	}
}
