package boletin06_for;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in);
		
		// Crear variables
		int numA; 
		int numB;
		int mayor; 
		int menor; 
		
		// Pedir al usuario que introduzca dos números
		System.out.println("Introduce el primer número");
		numA = reader.nextInt(); 
		
		System.out.println("Introduce el segundo número");
		numB = reader.nextInt(); 
		
		if (numA < numB) {
			menor = numA; 
			mayor = numB; 
		} else {
			menor = numB; 
			mayor = numA; 
		}
		
		// Vamos desde el número más pequeño al número más grande
		for(int cont = menor; cont<=mayor; cont ++)
			System.out.println(cont);
		
		// Cerrar Scanner
		reader.close();
	}

}
