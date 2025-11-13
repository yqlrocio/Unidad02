package boletin05_do_while;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables
		int num = 1; 
		
		// Mostrar en pantalla los números pares desde 1-200
		System.out.println("Los 20 primeros números laterales son: ");
				
				do {
					System.out.println(num++);
				} while (num <= 20); 
				
				// Cerrar Scanner
				reader.close(); 

			}

		}