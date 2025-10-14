package diagrama;

import java.util.Scanner;

public class Diagrama05 {

	public static void main(String[] args) {
		// Crear variables
		int num1;
			
		// Craer Scanner
		Scanner reader = new Scanner(System.in);

		// Preguntar usuario por un número
		System.out.println("Introduce número 1: ");
		num1 = reader.nextInt(); 
							
		// Crear conditional para ver si el número introducido es positivo o negativo
		if (num1 > 0) {
		System.out.println("Positivo");
		System.out.println("Negativo");
			}else if (num1 == 0 ) { 
				System.out.println("Positivo");	
			}

		// Cerrar Scanner
		reader.close();
	}
}