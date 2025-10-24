package programming_excercises_part1;

import java.util.Scanner;

public class Exercise03_corregido {

	public static void main(String[] args) {
		
		// Create variable
		int mirrorHour; 
		int mirrorMinute; 
		
		int realHour; 
		int realMinute; 
		
		// Create Scanner
		Scanner reader = new Scanner(System.in);
		
		// Ask to the user for the time 
		System.out.println("Introduce the hour that you are seeing in the clock: ");
		mirrorHour = reader.nextInt(); 
		mirrorMinute = reader.nextInt();
		
		realHour = (mirrorMinute == 00) ? (12 - mirrorHour): (11 - mirrorHour); 
		realMinute = (mirrorMinute == 0) ? 0 : 60 - mirrorMinute; 
	
		if (realHour < 10) {
			System.out.println("0");
		}
		System.out.println(realHour + ":");
		
		if (realMinute < 10) {
			
		}
		// Close Scanner
		reader.close(); 
	}

}
