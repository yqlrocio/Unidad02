package boletin07_bucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Craer variables
		int fila; 
		
		// Pedimos al usuario que introduzca un número
		System.out.println("Introduce el número de fila: ");
		fila  = reader.nextInt(); 
		
		// Bucle externo para las filas
		for (int i = 1; i <= fila; i++) {
			// Parte ascendente 
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// Parte descendente
			for (int k = i-1; k >= i; k--) {
				System.out.print(k);
			}
			System.out.println( );
		}
		reader.close();
	}

}
