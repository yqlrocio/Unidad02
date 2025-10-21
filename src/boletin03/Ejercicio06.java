package boletin03;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		      
				// Crear Scanner
				Scanner reader = new Scanner(System.in);

				// Crear variables 
				int mes; 
				int año;
				boolean esBisiesto = false;
				
		        // Pedir al usuario que introduzca el mes
		        System.out.print("Introduce el número del mes (1-12): ");
		        mes = reader.nextInt();

		        // Validar mes
		        if (mes < 1 || mes > 12) {
		            System.out.println("Mes no válido. Debe estar entre 1 y 12.");  
		        } else {
		        	System.out.println("ERROR: Introduce un valor entre 1-12"); 
		        }

		        // Pedir al usuario que introduzca el año
		        System.out.print("Introduce el año: ");
		        año = reader.nextInt();

		        // Comprobar si es bisiesto y mostrar en pantalla
		        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
		            esBisiesto = true;
		        }

		        int dias;
		        switch (mes) {
		            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		                dias = 31;
		                break;
		            case 4: case 6: case 9: case 11:
		                dias = 30;
		                break;
		            case 2:
		                dias = esBisiesto ? 29 : 28;
		                break;
		            default:
		                dias = 0; // Esto nunca debería pasar
		        }

		        System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
		        if (mes == 2) {
		            System.out.println("El año " + año + (esBisiesto ? " es bisiesto." : " no es bisiesto."));
		        }

		        // Cerrar Scanner
		        reader.close();
		    }
		}
