package boletin07_bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Crear variable
		int num; 
		int numAux; 
		int ultimaCifra;
		int numInvertido=0; 
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Le pedimos un número al usuario
		System.out.println("Introduce un número: ");
		num = reader.nextInt(); 
		
		// Almacenamos en la variable auxiliar eñ número introducido por el usuario
		numAux = num; 
		
		while(numAux > 0) {
			ultimaCifra = numAux % 10; 
			numInvertido = numInvertido * 10 + ultimaCifra; 
			numAux /= 10; 
		}
		System.out.println(numInvertido==num ? "Es capicúa" : "No es capicúa");
		
		// Cerrar Scanner 
		reader.close();
	}

}
