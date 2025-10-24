package programming_excercises_part1;

import java.util.Scanner;

public class Exercise03 {

		public class Exercise01 {

			public static void main(String[] args) {
				
				// Crear Scanner 
				Scanner reader = new Scanner(System.in); 

				// Crear variables 
				int hour; 
				int min; 
				
				// Ask for the user the time
				System.out.println("What is the hour?: ");
				hour = reader.nextInt(); 
				
				System.out.println("What is the minute?: ");
				min = reader.nextInt(); 
				
				// Create a conditional to give to the user a mirror time 
				if (min != 0) {
		            min = 60 - min;   // restamos los minutos de 60
		            hour = hour + 1;  // pedimos prestada una hora
		        }

		        hour = 12 - (hour % 12); // invertimos la hora respecto a 12
		        if (hour == 0) hour = 12; // si da 0, debe ser 12

		        // Mostrar la hora real formateada
		        System.out.printf("%02d:%02d\n", hour, min);
				
				// Cerrar Scanner 
				reader.close(); 
			}

		}
}

