package jsnacks;

import java.util.Random;

public class JSnack3 {

	public static void main(String[] args) {
		
		/* Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
		 * lista di cognomi, genera una falsa lista di 3 invitati.
		 */
		
		String[] nome = {"Antonio", "Giovanni", "Giulio"}; 
		String[] cognome = {"Java", "HTML", "Bootstrap"};
		
	/*	//pesco il nome
		Random nomeGen = new Random();
		int posizioneNome = nomeGen.nextInt(3)+1;
		System.out.println(posizioneNome);
		
		//pesco il cognome
		Random cognomeGen = new Random();
		int posizioneCognome = cognomeGen.nextInt(3)+1;
		System.out.println(posizioneCognome);
	*/	
		//genero la lista
		for (int i = 0; i < nome.length; i++) {
			Random nomeGen = new Random();
			int posizioneNome = nomeGen.nextInt(3)+1;
			System.out.print(nome [posizioneNome] + " ");
			Random cognomeGen = new Random();
			int posizioneCognome = cognomeGen.nextInt(3)+1;
			System.out.println(cognome [posizioneCognome]);
			
		}
		
		
		

	}

}
