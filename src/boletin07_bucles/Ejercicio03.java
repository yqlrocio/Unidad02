package boletin07_bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Crear variables
		int num1; 
		int num2;
		int mcd = 1; 
		int min; 
		int divisor; 
		
		// Pedir al usuario que introduzca dos números
		System.out.println("Introduce un primer número: ");
		num1 = reader.nextInt(); 
		
		System.out.println("Introduce un segundo número: ");
		num2 = reader.nextInt(); 
		
		// Miramos cuál es el más pequeño
		min = Math.min(num1, num2); 
		
		
		divisor = min; 
		while (divisor >= 1 && mcd ==1) {
			// Comprobamos si i divide a ambos números
			if (num1 % divisor == 0 && num2 % divisor == 0) {
			mcd = divisor;
		}
		divisor--;
	}

	System.out.println("El m.c.d de " + num1 + " y " + num2 + " es: " + mcd);

		// Cerrar Scanner
		reader.close(); 

	}

}
