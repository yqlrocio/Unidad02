package boletin03;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		/*
		 * PRUEBAS A REALIZAR: 
		 * 1º) Números mayores de 9999
		 * 2º) Números menores de 0
		 * 3ª) Números como 202, 2002...
		 * 4º) Números como 3586466 que están fuera del intervalo de 0-9999
		 * 5ª) Números como 5442 que están dentro del intervalo de 0-9999
		 */
		
		// Crear Scanner 
		Scanner reader1 = new Scanner(System.in); 
		// Crear Ramdon
		Random reader2 = new Random(); 
		
		// Crear variables
		int num1 = reader2.nextInt(1, 100); 
		int num2 = reader2.nextInt(1, 100); 
		int resultadoReal; 
		int resultadoUsuario; 
		
		// Enseñarle al usuario 2 números aleatorios
		System.out.println(num1);
		num1 = reader2.nextInt();
		
		System.out.println(num2);
		num2 = reader2.nextInt();
		
		// Hacer operacion de los valores aleatorios
		resultadoReal = num1 + num2; 
		
		// Pedir al usuario que realice la suma de los 2 números mostrados en pantalla. Finalmente, el programa usando condicionales if-else mostrará en pantalla si el resultado del usuario es correcto o no
		System.out.println("Realiza la suma de los valores anteriores e introducelo: ");
		resultadoUsuario = reader1.nextInt(); 
		
		// Crear condición para comrpobar si el resultado introducido por el usurio es correcto 
		if (resultadoUsuario == resultadoReal) {
			System.out.println("El resultado es correcto");
		} else {
			System.out.println("El resultado es incorrecto");
		}

		// Cerrar Scanner 
		reader1.close(); 
		}
	}

