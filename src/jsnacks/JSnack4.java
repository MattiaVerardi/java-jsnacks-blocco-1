package jsnacks;

import java.util.Arrays;
import java.util.Random;

//Crea un array di numeri interi
//e fai la somma di tutti gli elementi che sono in posizione dispari

public class JSnack4 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] array = new int[20];
		int somma = 0;

		for (int i = 0; i < array.length; i++) {
			int numero = r.nextInt(20) + 1;
			array[i] = numero;
			if (numero % 2 == 0) {
				somma = somma + numero;
			}
		}

		System.out.println(Arrays.toString(array));
		System.out.println(somma);

	}

}
