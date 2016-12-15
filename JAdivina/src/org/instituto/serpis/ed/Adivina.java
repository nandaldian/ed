package org.instituto.serpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int numero;
		int numeroAleatorio = random.nextInt(1000)+1;
		int cont=0;
		
		System.out.println("Adivina el num entre 1 y 1000...Adivina");
		System.out.println("numeroAleatorio=" + numeroAleatorio);
		
		do {
			System.out.println("Inroduce el numero : ");
			String line = scanner.nextLine();
			numero = Integer.parseInt(line);
			//damos pista al usuario 
			if (numero > numeroAleatorio){
				System.out.println("tu numero es mayor..");
				cont++;
				System.out.println("llevas "+cont+" Intentos");
			}
				else if (numero < numeroAleatorio){
					System.out.println("tu numero es menor...");
					cont++;
				System.out.println("llevas "+cont+" Intentos");

				}
		} while (numero != numeroAleatorio);	
		System.out.println("Has acertado!");
		System.out.println("Y solo has tardado "+cont+ " veces...");
	}
}
