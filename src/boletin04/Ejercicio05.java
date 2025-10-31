package boletin04;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
	
		//Create a Scanner
        Scanner sc = new Scanner (System.in);
        
        //The sum of the number
        int sumaAlumnos = 0; 
        int numAlumnos = 0; 
        int numMayoresEdad = 0;
        double media;
        
        //The numbers introduced by the user
        int edad;
        
        //The console waits for the user to introduce a number
        System.out.println("Introduzca una edad:");
        edad = sc.nextInt();
        
        //We'll only sum the positive numbers, and stop when the user introduces a negative one
        while (edad>=0) {
          sumaAlumnos += edad;
          numAlumnos ++; 
            System.out.println("Siga introduciendo número:");
            edad = sc.nextInt();
        } 
       while (edad >= 18) {
    	   numMayoresEdad ++: 
    	 System.out.println("Siga introduciendo número:");
           edad = sc.nextInt();
       }
        media = (double) sumaAlumnos / numAlumnos; 
        
        //We will show the final result of the sum after the user has introduced a negative number
        System.out.println("La media de los números introducido es: " + media);
        
        //Close Scanner
        sc.close();

    }
}
