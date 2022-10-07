package jsnacks;

import java.util.Scanner;

//Chiedi all'utente di inserire un numero, se è pari stampa il numero,
//se è dispari stampa il numero successivo

public class JSnack2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Inserisci un numero");
		int numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero);
		} else {
			System.out.println(numero + 1);
		}

		scan.close();

	}

}
