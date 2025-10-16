package diagrama;

import java.util.Scanner;

public class Diagrama09 {

	public static void main(String[] args) {
		// Crear Variables
		double nota; 
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Preguntar al usuario por su nota
		System.out.println("Introduce tu nota: ");
		nota = reader.nextDouble(); 
		
		// Crear condicional para clasificar la nota del usuario
		if (nota >= 0 && nota  < 3) {
			System.out.println("Muy deficiente");
		} else if (nota >= 3 && nota  < 5) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota  < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota  < 9) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota  <= 10) { 
			System.out.println("Sobresaliente");
		} else {
			System.out.println("La nota debe de ser entre 0 y 10");
		}
		 
		// Cerrar Scanner
		reader.close(); 
	}

}
