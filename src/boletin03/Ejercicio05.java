package boletin03;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
				
		// Crear variables
		double precioBillete; 
		double distancia; 
		int estancia; 
				
		// Pedir al usuario que introduzca la distancia a recorrer y el número de días de estancias 
		System.out.println("Introduzca cuál es la distancia a recorrer: ");
		distancia = reader.nextDouble(); 
		
		System.out.println("Introduzca cuántos días serán de estancias: ");
		estancia = reader.nextInt();
		
		// Usando if-else crear condicional para calcular el precio del billete
		if (estancia > 7 && distancia > 800) {
			precioBillete = (distancia * 2.5) * 0.3; 
			System.out.println("Su billete sería: " + precioBillete + "€");
		} else { 
			precioBillete = (distancia * 2.5); 
			System.out.println("Su billete sería: " + precioBillete + "€");
		}
		
		// Cerrar Scanner 
		reader.close(); 

	}

}
