package boletin02_switch;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables
		int num1; 
		int num2; 
		int suma; 
		int resta; 
		int multiplicacion; 
		double division; 
		String operacion;
		
		// Pedir al usuario que introduzca 2 números
		System.out.println("Introduzca 2 números: ");
		num1 = reader.nextInt(); 
		num2 = reader.nextInt(); 
		
		// Pedir al usuario que elija entre las opciones 
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.println("Elije un valor entre A-D");
		operacion = reader.next(); 
		
		// Usar switch para operar segun la letra introducida por el usuario 
		switch (operacion) {
		case "A":  
		suma = num1 + num2; 	
		System.out.println("Suma= " + suma);
		
		case "B":  
		resta = num1 - num2; 	
		System.out.println("Resta= " + resta);
		
		case "C":  
		multiplicacion = num1 * num2; 
		System.out.println("Multiplicación= " + multiplicacion);
		
		case "D":  
		if (num2 != 0) {
			division = num1 / num2; 	
			System.out.println("División= " + division);
		} else {
		System.out.println("Error de cálculo");
		}
		
		default:  
			System.out.println("Error: introduzca un valor entre A-D");
		}
	
		// Cerrar Scanner
		reader.close(); 
	}
}
