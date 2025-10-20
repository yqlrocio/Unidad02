package boletin02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
				// Crear Scanner 
				Scanner reader = new Scanner(System.in); 
				
				// Crear variables 
				int dia; 
				
				// Pedir al usuario que introduzca un número entre 1-7 e indicar qué día de la semana es 
				System.out.println("Introduzca un número comprendido entre 1-7: ");
				dia = reader.nextInt(); 
				
				// Usar switch para clasificar la nota del usuario 
				switch (dia) {
				case 1 -> {
					System.out.println("Lunes");
				}
				case 2 -> {
					System.out.println("Martes");
				}
				case 3 -> {
					System.out.println("Miércoles");
				}
				case 4 -> {
					System.out.println("Jueves");
				}
				case 5 -> {
					System.out.println("Viernes");
				}
				case 6 -> {
					System.out.println("Sábado");
				}
				case 7 -> {
					System.out.println("Domingo");
				}
				default -> {
					System.out.println("Error: introduzca un número entre 1-7");
				}
				}
				System.out.println("El número introducido corresponde a:" + dia);
				
				// Cerrar Scanner 
				reader.close(); 
			}

		}
