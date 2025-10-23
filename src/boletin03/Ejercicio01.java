package boletin03;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*
		 * PRUEBAS A REALIZAR: 
		 * 1º) Números mayores de 9999
		 * 2º) Números menores de 0
		 * 3ª) Números como 202, 2002...
		 * 4º) Números como 3586466 que están fuera del intervalo de 0-9999
		 * 5ª) Números como 5442 que están dentro del intervalo de 0-9999
		 */
		 
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear varibles
		int num; 
		
		// Pedir al usuario que introduzca valor por valor creando un valor comprendido entre 0 y 9999
		System.out.println("Introduzca un número : ");
		num = reader.nextInt(); 
		
		// Crear condicional para indiccarle al usuario si el número introducido es capicúa 
		if (num > 0 && num < 10 ) {
			System.out.println("El número es capicúa ");
		} else if (num > 10 && num < 100 && num/10 == num%10 ) {
			System.out.println("El número es capicúa ");
		} else if (num > 100 && num < 1000 && num/100 == num%100 ) {
			System.out.println("El número es capicúa ");
		}else if (num > 1000 && num < 10000 && num/1000 == num%1000 ) {
			System.out.println("El número es capicúa ");
		} else if (num < 0 || num > 9999) {
			System.out.println("ERROR: Introduzca un valor entre 0-9999 ");
		} else {
			System.out.println("El número no es capicúa ");
		}
		
		// Cerrar Scanner
		reader.close(); 
	}

}