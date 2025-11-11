package boletin06;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variables
		int num; 
		long factorial = 1;  
		
		// Pedir al usuario que introduzca un número y usando el for calcularemos el factorial
		System.out.println("Introduce un número: ");
		num = reader.nextInt(); 
		
		for (int i = 1; i <= num; i ++) {
			factorial *= i; 
			}

		// Mostrar en pantalla el factorial introducido por el usuario
		System.out.println("El factorial es: " + factorial);
		// Cerramos Scanner
		reader.close(); 
		
	}

}
