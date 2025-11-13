package boletin02_switch;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 

		// Crear variable
		String tirada1; 
		String tirada2; 
		int suma; 
		int valor1 = 0; 
		int valor2 = 0; 
		
		// Preguntar al usuario cuanto ha sacado en dos tiradas
		System.out.println("Introduzca cúanto has sacado en las dos tiradas: ");
		tirada1 = reader.next(); 
		tirada2 = reader.next(); 
		
		// Crear un Switch para darle valores numéricos a los valores introducidos por el usaurio
		switch (tirada1) {
		case "uno" -> valor1=1; 
		case "dos" -> valor1=2; 
		case "tres" -> valor1=3; 
		case "cuatro" -> valor1=4; 
		case "cinco" -> valor1=5; 
		case "seis" -> valor1=6; 
		default -> 
		System.out.println("Error: introduzca un valor entre uno-seis");
		}
		
		switch (tirada2) {
		case "uno" -> valor2=1; 
		case "dos" -> valor2=2; 
		case "tres" -> valor2=3; 
		case "cuatro" -> valor2=4; 
		case "cinco" -> valor2=5; 
		case "seis" -> valor2=6; 
		default -> 
		System.out.println("Error: introduzca un valor entre uno-seis");
		}

		suma = valor1 + valor2; 
		System.out.println("La suma es: " + suma);
		
		// Cerrar Scanner
		reader.close(); 
}
}
