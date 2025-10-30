package boletin04;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
			
		    //Create a Scanner
	        Scanner sc = new Scanner (System.in);
	        
	        //The sum of the number
	        int contador = 0;
	        
	        //The numbers introduced by the user
	        int num;
	        
	        //The console waits for the user to introduce a number
	        System.out.println("Introduzca un número:");
	        num = sc.nextInt();
	        
	        //We'll only sum the positive numbers, and stop when the user introduces a negative one
	        while (num>=0) {
	          ++ contador;
	            System.out.println("Introduzca otro número:");
	            num = sc.nextInt();
	        }
	        
	        //We will show the final result of the sum after the user has introduced a negative number
	        System.out.println("La cantidad de números introducidos es: " + contador);
	        
	        //Close Scanner
	        sc.close();

	    }
	}
