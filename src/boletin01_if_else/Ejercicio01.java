package boletin01_if_else;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables
		int num; 
		
		// Pedir al usuario un número
		System.out.println("Introduce un número: ");
		num = reader.nextInt(); 
		
		// Crear condicional para mostrar en pantalla si el número introducido por el usuario es par o impar
		if (num%2 == 0) { 
			System.out.println("Par ");
		} else { 
			System.out.println("Impar ");
		}
		
		// Cerrar Scanner
		reader.close();

	}

}
