package boletin01_if_else;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 

		// Crear variable
		int num; 
		
		// Pedir al usuario que introduzca un número
		System.out.println("Introduzca un número: ");
		num = reader.nextInt(); 
		
		// Crear condicional para mostrar en pantalla cuantas cifras tiene el número introducido por el usuario
		if (num >=0 && num < 10) {
			System.out.println("Su número tiene una cifra");
		} else if (num >=10 && num < 100) { 
			System.out.println("Su número tiene dos cifras");
		} else if (num >=100 && num < 1000) { 
			System.out.println("Su número tiene tres cifras");
		} else if (num <=1000 && num < 10000) { 
			System.out.println("Su número tiene cuatro cifras");
		} else if (num >=10000 && num < 100000) { 
			System.out.println("Su número tiene cinco cifras");
		} else {
			System.out.println("Tiene que estar comprendido entre 0 y 99999");
		}
		
		// Cerrar Scanner
		reader.close(); 
	}

}
