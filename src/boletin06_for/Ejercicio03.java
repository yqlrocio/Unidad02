package boletin06_for;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Crear variables
		int numUsuario;
		double media = 0; 
		
		// Pedir al usuario que introduzca 10 números
		System.out.println("Introduzca 10 números");
		numUsuario = reader.nextInt(); 

		for (int num = 1; num < 10; num++ ) {
			System.out.println("Introduzca otro número");
			numUsuario += reader.nextInt();  
			media = numUsuario / num;
	}
		
		
		// Mostrar en pantalla los múltiplos de 3
		System.out.println("La media es: " + media );
	
		// Cerramos Scanner
		reader.close();
	}
}
