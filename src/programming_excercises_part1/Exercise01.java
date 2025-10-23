package programming_excercises_part1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// Crear Scanner 
		Scanner reader = new Scanner(System.in); 

		// Crear variables 
		int hora; 
		int min; 
		
		// Crear condición 
		if (min == 00) {
			switch (hora) {
			case 1 -> {
				System.out.println();
			}
			case 2 -> {
				System.out.println(numDNI + "R");
			}
			case 3 -> {
				System.out.println(numDNI + "W");
			}
			case 4 -> {
				System.out.println(numDNI + "A");
			}
			case 5 -> {
				System.out.println(numDNI + "G");
			}
			case 6 -> {
				System.out.println(numDNI + "M");
			}
			case 7 -> {
				System.out.println(numDNI + "Y");
			}
			case 8 -> {
				System.out.println(numDNI + "F");
			}
			case 9 -> {
				System.out.println(numDNI + "P");
			}
			case 10 -> {
				System.out.println(numDNI + "D");
			}
			case 11 -> {
				System.out.println(numDNI + "X");
			}
			case 11 -> {
				System.out.println(numDNI + "B");
			}
			case 12 -> {
				System.out.println(numDNI + "N");
			}
			default -> {
				System.out.println("ERROR: introduce solo 8 cifras");
			}
 
		}
		// Cerrar Scanner 
		reader.close(); 
	}

}
