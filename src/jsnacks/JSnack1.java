package jsnacks;

import java.util.Scanner;

public class JSnack1 {

	public static void main(String[] args) {

		/*
		 * Il software deve chiedere per 5 volte all’utente di inserire un numero. Il
		 * programma stampa la somma di tutti i numeri inseriti. Esegui questo programma
		 * in due versioni, con il for e con il while.
		 */

		Scanner scan = new Scanner(System.in);

		// (ciclo for) chiedo all'utente di inserire un numero
		int numero;
		int somma = 0;

		/*
		 * for (int i = 0; i < 5; i++) { System.out.print("Inserisci un numero: ");
		 * numero = scan.nextInt(); somma += numero; }
		 */

		// (ciclo while) chiedo all'utente di inserire un numero
		int counter = 0;
		while (counter < 5) {
			System.out.print("Inserisci un numero: ");
			numero = scan.nextInt();
			somma += numero;
			counter++;
		}

		// somma i numeri stampati
		System.out.println("La somma è: " + somma);

		// chiudo scanner
		scan.close();
	}

}
