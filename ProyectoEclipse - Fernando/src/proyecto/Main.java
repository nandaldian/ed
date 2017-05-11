package proyecto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sumapares = 0;
        int sumaimpares = 0;
        int cantidadpares = 0;
        int cantidadimpares = 0;
        int numero;
        int cantidadmult4 = 0;
        int num1 = 0;
        int num2 = 0;
        int sumamult4 = 0;
        int cantidadmult7 = 0;
        int sumamult7 = 0;
		
        System.out.println("Proyecto - Suma de pares e impares (del 1 al 99)");
        System.out.println("Y cantidad de multiplos de 2 numeros a elegir dentro de la cadena, y sus sumas.");
        System.out.println("\nIntroduce 2 numeros para saber sus multiplos: ");
        
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("");
        for (int i = 1; i < 100; i++) {
            System.out.print(i + " ");
            numero = i;
            if (i % 2 == 0) {
                cantidadpares++;
                sumapares = sumapares + numero;
            } else {
                cantidadimpares++;
                sumaimpares = sumaimpares + numero;

            }
            if (i % num1 == 0) {
                cantidadmult4++;
                sumamult4 = sumamult4 + numero;

            }
            if (i % num2 == 0) {
                cantidadmult7++;
                sumamult7 = sumamult7 + numero;

            }

        }
        
        System.out.println("");
        System.out.println("\nHay " + cantidadpares + " números pares. Y su suma es " + sumapares);
        System.out.println("Hay " + cantidadimpares + " números impares. Y su suma es " + sumaimpares);
        System.out.println("Hay " + cantidadmult4 + " múltiplos de " + num1 + ". Y su suma es " + sumamult4);
        System.out.println("Hay " + cantidadmult7 + " múltiplos de " + num2 + ". Y su suma es " + sumamult7);
     
	}
}