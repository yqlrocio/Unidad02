package boletin07_bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables
		int num; 
		boolean esPrimo = true;  
		int divisor = 0;
		int cuentaPrimos=0; 
		
		// Le pedimos un número al usuario
		System.out.println("Introduce un número: ");
		num = reader.nextInt(); 
		
		// Recorremos todos los números del 2 hasta num
		for (int cont = 2; cont <= num; cont++) {
			// Inicializamos el divisor a 2
			divisor = 2;
			// Volvemos a poner esPrimo a true
			esPrimo = true; 
			// Comprobamos si cont es primo
			while (divisor < cont && esPrimo) {
				if (cont % divisor == 0) {
					esPrimo = false;
				}
				divisor++;
			}
			// Miramos si el número es primo
			if (esPrimo) {
				cuentaPrimos++; 
			}
		}
		
		// Mostrar e pantalla los números primos
		System.out.println("Hay " + cuentaPrimos + " números primos entre el 1 y el " + num); 
		
		// Cerrar Scanner
		reader.close(); 
	}

}
