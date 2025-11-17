package boletin07_bucles;

import java.util.Scanner;

public class Ejercicio04 {

public static void main(String[] args) {
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Crear variables
		int num1; 
		int num2;
		int mcm = 1; 
		int max; 
		int multiplo; 
		
		// Pedir al usuario que introduzca dos números
		System.out.println("Introduce un primer número: ");
		num1 = reader.nextInt(); 
		
		System.out.println("Introduce un segundo número: ");
		num2 = reader.nextInt(); 
		
		// Miramos cuál es el más pequeño
		max = Math.max(num1, num2); 
		
		
		multiplo = max; 
		while (num1 % multiplo == 0 && num2 % multiplo == 0) {
			multiplo++;
			if (num1 % multiplo == 0 &&  num2 % multiplo == 0) {
			max = multiplo;
		}
	}
			
		
	System.out.println("El m.c.m de " + num1 + " y " + num2 + " es: " + max);

		// Cerrar Scanner
		reader.close(); 

	}
}
