package diagrama;

import java.util.Scanner;

public class Diagrama03 {

	public static void main(String[] args) {
		// Crear variables
			int num1;
			int num2; 
			
			int suma;
			int resta;
			int multiplicacion; 
			double division; 

			// Craer Scanner
			Scanner reader = new Scanner(System.in);

			// Preguntar usuario por dos número
			System.out.println("Introduce número 1: ");
			num1 = reader.nextInt(); 
			
			System.out.println("Introduce número 2: "); 
			num2 = reader.nextInt(); 
			
			// Operar: suma, resta, multiplicación y división con los números introducidos por el usuario 
			suma = num1 + num2; 
			resta = num1 - num2; 
			multiplicacion = num1 * num2; 
			division = (double)num1 / num2; 
			
			// Crear conditional para ver si es posible realizar las operaciones
			if (num1 == 0 || num2 ==0) {
				System.out.println("Error de cálculo");
			} else { 
				System.out.println("Suma: " + suma);
				System.out.println("Resta: " + resta);
				System.out.println("Multiplicación: " + multiplicacion);
				System.out.println("División: " + division);
			}

				// Cerrar Scanner
				reader.close();
		}

	}