package boletin01;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variables
		double num; 
		
		// Pedir al usuario que introduzca 
		System.out.println("Introduzca un número decimal: ");
		num = reader.nextDouble(); 
		
		// Crear condición para decirle al usuario si es un número casi-cero o no
		if (num > -1 && num < 1 && num != 0) {
			System.out.println("Es un número casi-cero");
		} else {
			System.out.println("No es un número casi-cero");
		}
		/*
		 *DENTRO DE UN INTERVALO SE ESCRIBE &&
		 */ 
		
		
		// Cerrar Scanner
		reader.close(); 
	}

}
