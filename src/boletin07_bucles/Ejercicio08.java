package boletin07_bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Crear variables
		int num1; 
		int num2;
		
		// Pedir al usuario que introduzca un número
		System.out.println("Introduce un número: ");
		num1 = reader.nextInt();
		
		//
		while (true) {
			System.out.println("Introduce un número: ");
			num2 = reader.nextInt();
			if (num2 == 0) {
				break;
			}
			
		} 
			
		// Cerrar Scanenr
		reader.close();
	}

}
