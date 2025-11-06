package boletin05;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Craer Scanner 
		Scanner reader = new Scanner(System.in); 
		
		// Crear variable para almacenar el valor introducido por el usuario 
		int num1; 
		int num2;
		
		String tirada1;
		String tirada2; 

		switch (tirada1) {
		case "UNO" -> num1 = 1; 
		case "DOS" -> num1 = 2; 
		case "TRES" -> num1 = 3; 
		case "CUATRO" -> num1 = 4; 
		case "CINCO" -> num1 = 5; 
		case "SEIS" -> num1 = 6; 
		DEFAULT -> {
			System.out.println("Tirada errónea");
			tirada2 = -1
		}
		
		// Cerrar Scanner 
		reader.close(); 

	}

}
