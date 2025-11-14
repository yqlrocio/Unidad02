package boletin07_bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		/*
		 * Pruebas mínimas a realizar: 
		 * Valor de entrada: 
		 * Resultado esperado: 
		 * Resultado obtenido:
		 */
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables
		int hora; 
		int min; 
		int seg; 
		int incremento; 
		
		// Preguntar al usuario los segundos que desea incrementar 
		System.out.println("Introduce los segundos que deseas incrementar: ");
		incremento = reader.nextInt(); 
		
		// Crear condición para que sume y muestre el tiempo tras la incrementación 
		for (int i=1; i<=60; )
		if (min == 60) {
			min = 0;
			horas ++;
		}
		
		// Cerrar Scanner 
		reader.close(); 

	}

}
