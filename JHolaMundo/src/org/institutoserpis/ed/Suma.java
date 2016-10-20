package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tcl = new Scanner(System.in);
		
		System.out.println("Programa suma");
		System.out.print("Introduce el primer numero: ");
		String primerNumero = tcl.nextLine();
		BigDecimal primero = new BigDecimal(primerNumero);	
		System.out.print("      Introduce el segundo: ");
		String segundoNumero = tcl.nextLine();
		BigDecimal segundo = new BigDecimal(segundoNumero);
		BigDecimal suma = primero.add(segundo);;
		System.out.println("     La suma de los 2 es: " +suma);		
	}

}
