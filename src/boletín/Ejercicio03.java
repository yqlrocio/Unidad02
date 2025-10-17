package boletín;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables
		int a; 
		int b; 
		int c; 
		
		double x1; 
		double x2;
		
		double discriminante; 
		
		// Pedir los tres coeficientes al usuario para resolver posteriormente la ecuación de segundo grado
		System.out.println("Introduzca los coeficientes de la ecuación de segundo grado: ");
		a = reader.nextInt(); 
		b = reader.nextInt(); 
		c = reader.nextInt(); 
		
		discriminante = b*b - 4*a*c; 
		
		// Si a == 0 es de primer grado
		if (a ==0 ) {
			x1 = (double) - c/ b; 
			System.out.println("La ecuación tiene solo una solución: " + x1);
		} else if (discriminante >= 0) {
			
			// Si es positivo, tiene solución y se aplica la fórmula
			x1 = (-b + Math.sqrt(discriminante)) / (2*a); 
			x2 = (-b - Math.sqrt(discriminante)) / (2*a);
			System.out.println("x1: " + x1);
			System.out.println("x2: " + x2);
		} else {
			
			// Si es negativo no tiene solución 
			System.out.println("La ecuación no tiene solución: ");
		}
		
		// Cerrar Scaner 
		reader.close(); 

	}

}
