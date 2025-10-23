package condicional_question;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// Create Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Create variable
		double price = 10.00;
		int age;
	
		// Ask for the user their age, if their age is under 14 get half price
		System.out.print("Enter your age: ");
		age = keyboard.nextInt();
		
		//(code to reduce ticket price for children goes here) Create a condicional to get half price for children who have under 14 
		if (age < 14) {
			price = price / 2; 
		}
		System.out.println("Ticket price = " + price);

	
		// Close Scanner
		keyboard.close();
	}

}
