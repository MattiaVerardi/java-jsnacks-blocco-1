package jsnacks;

import java.util.Scanner;

public class JSnack2 {

	public static void main(String[] args) {
		
		/*Chiedi all'utente di inserire un numero, se è pari stampa il numero,
		 * se è dispari stampa il numero successivo.
		 */
		
		Scanner scan = new Scanner (System.in);
		
		//chiedo all'utente di inserire un numero
		System.out.print("Inserisci un numero: ");
		int numero = scan.nextInt();
		
		//controlla se pari o dispari
		if (numero % 2 == 0) {
			System.out.println(numero);
		}else {
			System.out.println(numero + 1);
		}
		
		
		
		
		
		
		//chiudo lo scanner
		scan.close();
	}

}
