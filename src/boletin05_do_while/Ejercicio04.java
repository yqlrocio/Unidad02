package boletin05_do_while;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear las variables 
		int num = 1; 
		int numUser; 
		int resultado; 
		
		// Pedir al usuario que introduzca un número 
		System.out.println("Introduzca un número: ");
		numUser = reader.nextInt(); 
		
		// Mostrar en pantalla la tabla de multiplicar del número introducido por el usuario
		do {
			resultado= numUser*num++; 
			System.out.println(resultado);
		} while (num <= 10); 
		
		// Cerrar Scanner 
		reader.close(); 
	}
}