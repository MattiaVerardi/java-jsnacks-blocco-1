package jsnacks;

import java.util.Scanner;

//La distanza di Hamming tra due stringhe di uguale lunghezza è il numero
//di posizioni nelle quali i caratteri corrispondenti sono diversi.
//Chiedi all'utente di dirti due parole e stampa la distanza di Hamming.

public class JSnack5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Inserisci due parole");
		String parola1 = s.nextLine();
		String parola2 = s.nextLine();

		char[] charArray1 = parola1.toCharArray();
		char[] charArray2 = parola2.toCharArray();

		int count = 0;
		for (int i = 0; i < charArray2.length; i++) {
			if (charArray1[i] == charArray2[i]) {
				count = count + 1;
			}
		}

		System.out.println("La distanza di Hamming è di " + count + " caratteri");

		s.close();
	}
}
