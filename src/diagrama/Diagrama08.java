package diagrama;

import java.util.Scanner;

public class Diagrama08 {

	public static void main(String[] args) {
		// Crear variables 
		int num1;
		int num2; 
		int num3;
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Preguntar al usuario 3 números
		System.out.println("Introduce número 1: ");
		num1 = reader.nextInt();
		
		System.out.println("Introduce número 2: ");
		num2 = reader.nextInt();
		
		System.out.println("Introduce número 3: ");
		num3 = reader.nextInt();
		
		// Crear condición para mostrar el mayor
		if (num1>num2 && num1>num3){
			System.out.println("Es mayor: " + num1);
		} else if (num2>num1 && num2>num3){
			System.out.println("Es mayor: " + num2);
		} else {
				System.out.println("Es mayor: " + num3);
			}
	
		// Cerrar Scanner
		reader.close(); 

	}

}
