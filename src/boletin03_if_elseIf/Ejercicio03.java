package boletin03_if_elseIf;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/*
		 * PRUEBAS A REALIZAR: 
		 * 1º) Números de DNI y comprobar si la letra obtenida es la del DNI
		 */
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variables 
		int numDNI; 
		int letra; 
		
		// Pedir al usuario que introduzca los 8 dígitos de su DNI para calcular la letra que iría en su DNI
		System.out.println("Introduzca los ocho dígitos de su DNI: ");
		numDNI = reader.nextInt(); 
		
		// Calcular la letra; operación
		letra = numDNI % 23; 
		
		// Crear condición para saber que letra en funcion de la operación anterior
		switch (letra) {
		case 0 -> {
			System.out.println(numDNI + "T");
		}
		case 1 -> {
			System.out.println(numDNI + "R");
		}
		case 2 -> {
			System.out.println(numDNI + "W");
		}
		case 3 -> {
			System.out.println(numDNI + "A");
		}
		case 4 -> {
			System.out.println(numDNI + "G");
		}
		case 5 -> {
			System.out.println(numDNI + "M");
		}
		case 6 -> {
			System.out.println(numDNI + "Y");
		}
		case 7 -> {
			System.out.println(numDNI + "F");
		}
		case 8 -> {
			System.out.println(numDNI + "P");
		}
		case 9 -> {
			System.out.println(numDNI + "D");
		}
		case 10 -> {
			System.out.println(numDNI + "X");
		}
		case 11 -> {
			System.out.println(numDNI + "B");
		}
		case 12 -> {
			System.out.println(numDNI + "N");
		}
		case 13 -> {
			System.out.println(numDNI + "J");
		}
		case 14 -> {
			System.out.println(numDNI + "Z");
		}
		case 15 -> {
			System.out.println(numDNI + "S");
		}
		case 16 -> {
			System.out.println(numDNI + "Q");
		}
		case 17 -> {
			System.out.println(numDNI + "V");
		}
		case 18 -> {
			System.out.println(numDNI + "H");
		}
		case 19 -> {
			System.out.println(numDNI + "L");
		}
		case 20 -> {
			System.out.println(numDNI + "C");
		}
		case 21 -> {
			System.out.println(numDNI + "K");
		}
		case 22 -> {
			System.out.println(numDNI + "E");
		}
		default -> {
			System.out.println("ERROR: introduce solo 8 cifras");
		}

		}
		// Cerrar Scanner 
		reader.close();
	}

}
