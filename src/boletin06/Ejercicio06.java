package boletin06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variables  
		double nota; 
		boolean suspenso = true; 
		
		// Pedir al usuario que introduzca un número y usando el for calcularemos el factorial
		System.out.println("Introduce la calificación: ");
		nota = reader.nextInt(); 
		
		for (int i = 1; i <= 5; i ++) {
				System.out.println("Introduzca otra calificación: ");
				nota += reader.nextInt();  
			}
		if (nota < 5) {
			suspenso = true;
		}
		if (suspenso) {
			System.out.println("Hay al menos un alumno suspenso");
		} else {
			System.out.println("Todos los alumnos están aprobados");
		}
		
		// Cerramos Scanner
		reader.close(); 
		
	}
}
