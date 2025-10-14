package diagrama;

import java.util.Scanner;

public class Diagrama07 {

	public static void main(String[] args) {
		// Crear variables
		int num1; 
		int num2; 
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Preguntar al usuario por dos números
		System.out.println("Introduce número 1: ");
		num1 = reader.nextInt();
		
		System.out.println("Introduce número 2: ");
		num2 = reader.nextInt(); 
		
		// Crear condicional para mostrar en pantalla si el número introducido por el usario es mayor o si son iguales
		if (num1>num2){
			System.out.println("Es mayor: " + num1);
		} else if (num1<num2) {
			System.out.println("Es mayor: " + num2);
		} else if (num1==num2) {
			System.out.println(num1+ "es igual a" + num2);
		}
		// Cerrar Scanner
		reader.close(); 
	}

}
