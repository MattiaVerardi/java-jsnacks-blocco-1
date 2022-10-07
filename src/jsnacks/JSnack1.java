package jsnacks;

import java.util.Scanner;

//Il software deve chiedere per 5 volte all’utente di inserire un numero.
//Il programma stampa la somma di tutti i numeri inseriti.
//Esegui questo programma in due versioni, con il for e con il while.

public class JSnack1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numero = 0;
		int somma = 0;

//		for (int i = 0; i < 5; i++) {
//			System.out.println("Inserisci un numero");
//			numero = scan.nextInt();
//			somma = somma + numero;
//		}

		int count = 0;

		while (count < 5) {
			System.out.println("Inserisci un numero");
			numero = scan.nextInt();
			somma = somma + numero;
			count = count + 1;
		}

		System.out.println(somma);

		scan.close();
	}
}
