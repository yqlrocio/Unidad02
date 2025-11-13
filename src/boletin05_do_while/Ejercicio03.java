package boletin05_do_while;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Variable para almacenar la suma total
		int suma = 0; 
		
		// Variable para almacenar la suma total
		int contador = 1; 
		
		// Número introducido por el usuario 
		int numero; 
		
		// Creamos Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca un número 
		System.out.println("Introduzca un número: ");
		numero = reader.nextInt(); 
				
		do {
			suma += contador; 
			contador++; 
		} while (contador <= numero); 
		
		System.out.println("La suma total es: " + suma);
		// Cerrar Scanner
		reader.close();
	}

}
