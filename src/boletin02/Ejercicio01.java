package boletin02;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables 
		int nota; 
		
		// Pedir al usuario que introduzca su nota 
		System.out.println("Introduzca tu nota: ");
		nota = reader.nextInt(); 
		
		// Usar switch para clasificar la nota del usuario 
		switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			System.out.println("Insuficiente");
		}
		case 5 -> {
			System.out.println("Suficiente");
		}
		case 6 -> {
			System.out.println("Bien");
		}
		case 7, 8 -> {
			System.out.println("Notable");
		}
		case 9, 10 -> {
			System.out.println("Sobresaliente");
		}
		default -> {
			System.out.println("Error: introduzca la nota entre 1-10");
		}
		}
		System.out.println("Su nota es: " + nota);
		
		// Cerrar Scanner 
		reader.close(); 
	}

}
