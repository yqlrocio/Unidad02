package boletin05;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Craer Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variables 
		int num = 2;
		
		// Mostrar en pantalla los números pares desde 1-200
		System.out.println("Los números pares desde 1-200: ");
		
		do {
			System.out.println(num);
			num += 2; 
		} while (num <= 200); 
		
		// Cerrar Scanner
		reader.close(); 

	}

}
