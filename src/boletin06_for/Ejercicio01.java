package boletin06_for;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear vriables
		int num; 
		
		// Le pedimos un número al usuario
		System.out.println("Introduzca un número");
		num = reader.nextInt(); 
		
		// For: desde 1 hasta num de 1 en 1
		for (int cont = 1; cont<=num; cont++) {
			System.out.println(cont);
		}
		
		// Cerrar Scanner 
		reader.close();

	}

}
