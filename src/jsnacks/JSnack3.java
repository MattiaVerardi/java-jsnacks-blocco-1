package jsnacks;

import java.util.Random;

//Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
//lista di cognomi, genera una falsa lista di 3 invitati.

public class JSnack3 {

	public static void main(String[] args) {

		String[] nome = { "Mario", "Vincenzo", "Rosario" };
		String[] cognome = { "Rossi", "Bianchi", "Verdi" };
		String[] nomeCognome = new String[3];

		for (int i = 0; i < cognome.length; i++) {
			nomeCognome[i] = nome[i] + " " + cognome[i];
			System.out.println(nomeCognome[i]);
		}

		System.out.println();

		Random r = new Random();

		for (int i = 0; i < nomeCognome.length; i++) {
			int numero1 = r.nextInt(3);
			int numero2 = r.nextInt(3);
			nomeCognome[i] = nome[numero1] + " " + cognome[numero2];
			System.out.println(nomeCognome[i]);
		}
	}

}
