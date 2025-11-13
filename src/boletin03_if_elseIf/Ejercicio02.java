package boletin03_if_elseIf;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * PRUEBAS A REALIZAR: 
		 * 1º) Números positivos
		 * 2º) Números negativos
		 */
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Crear variables 
		int num;
		int valorAbsoluto; 
		
		// Pedir al usuario que introduzca una cifra
		System.out.println("Introduzca un número: ");
		num = reader.nextInt(); 
		
		// Hacer un ternario para calcular el valor absoluto del número introducido por el usuario
		valorAbsoluto = (num >= 0) ? num: - num;  
		System.out.println("El valor absoluto es: " + valorAbsoluto);
		
		// Cerrar Scanner
		reader.close(); 
	}

}
