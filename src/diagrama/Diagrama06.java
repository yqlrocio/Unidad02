package diagrama;

import java.util.Scanner;

public class Diagrama06 {

	public static void main(String[] args) {
		// Crear variables
				int num1;
				int num2; 

				// Craer Scanner
				Scanner reader = new Scanner(System.in);

				// Preguntar usuario por dos número
				System.out.println("Introduce número 1: ");
				num1 = reader.nextInt(); 
							
				System.out.println("Introduce número 2: "); 
				num2 = reader.nextInt(); 
							
				// Crear conditional para ver cual de los números introducido es mayor
				if (num1 > num2) {
					System.out.println("1º " + num1 + " 2º " + num2);
				} else {	
					System.out.println("1º" + num2 + " 2º" + num1);
				}

				// Cerrar Scanner
				reader.close();
			}
}