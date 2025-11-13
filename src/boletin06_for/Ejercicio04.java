package boletin06_for;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Variable para almacenar los números impares 
		int suma = 0; 
		
		// Crear for para que muestre la suma de los 10 primeros números impares
		
		for (int num = 1; num <= 19; num += 2) {
			suma += num;
			}
			
		// Mostrar en pantalla los múltiplos de 3
		System.out.println("La suma es: " + suma);

		// Cerramos Scanner
		reader.close(); 
	}

}
