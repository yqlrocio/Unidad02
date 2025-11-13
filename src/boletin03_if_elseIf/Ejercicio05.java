package boletin03_if_elseIf;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * PRUEBAS A REALIZAR: 
		 * 1º) Introducir el distancia y días y comprobar si el resultado mostrado en pantalla es correcto
		 */
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
				
		// Crear variables
		double precioBillete; 
		double distancia; 
		int estancia; 
		double precioFinal;
				
		// Pedir al usuario que introduzca la distancia a recorrer y el número de días de estancias 
		System.out.println("Introduzca cuál es la distancia a recorrer: ");
		distancia = reader.nextDouble(); 
		
		System.out.println("Introduzca cuántos días serán de estancias: ");
		estancia = reader.nextInt();
		
		// Operar el precio del billete antes de entrar a la condición 
		precioBillete = distancia + 2.5; 
		
		// Usando if-else crear condicional para calcular el precio del billete
		if (estancia > 7 && distancia > 800) {
			precioFinal = precioBillete * 0.3; 
			System.out.println("Su billete sería: " + precioFinal + "€");
		} else { 
			System.out.println("Su billete sería: " + precioBillete + "€");
		}
		
		// Cerrar Scanner 
		reader.close(); 

	}

}
