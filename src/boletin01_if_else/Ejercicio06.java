package boletin01_if_else;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Craer variables
		int num1; 
		int num2; 
		int num3; 
		
		// Pedir al usuario que introduzca 3 números
		System.out.println("Introduzca 3 números: ");
		num1 = reader.nextInt(); 
		num2 = reader.nextInt(); 
		num3 = reader.nextInt(); 
		
		// Craer condicional y que en caso de que la suma de dos de los números introducidos por el usuario sea igual al otro número se muestre en pantalla
		if (num1 + num2 == num3) { 
			System.out.println("La suma de: " + num1 + "+" + num2 + "=" + num3);
		} else if (num2 + num3 == num1) { 
			System.out.println("La suma de: " + num2 + "+" + num3 + "=" + num1);
		} else if (num3 + num1 == num2) {
			System.out.println("La suma de: " + num3 + "+" + num1 + "=" + num2);
		} else if (num1 + num2 != num3 || num2 + num3 != num1 || num3 + num1 != num2) { 
			System.out.println("La suma de ninguno de los dos números es igual al otro número");
		}
		
		// Cerrar Scanner 
		reader.close(); 
	}

}
