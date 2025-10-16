package diagrama;

import java.util.Scanner;

public class Diagrama11 {

	public static void main(String[] args) {
		 //Create the scanner    
        Scanner sc = new Scanner(System.in);

        // Create variables
        double salBruto;
        double salNeto;
        double tasas=0;
        double tarifaHora;
        double horas;
        String nombre;
        
        //Ask the user their name
        System.out.println("Introduce tu nombre:");
        // And read it
        nombre= sc.next();
        
        // Ask the user for the worked hours
        System.out.println("Introduce las horas trabajadas:");
        // And read it
        horas = sc.nextInt();

        // Ask the user for the salary per hour
        System.out.println("Introduce tu tarifa por hora:");
        // And read it
        tarifaHora = sc.nextInt();
        
        //Now create the conditions
        
        if (horas<= 35) {
            salBruto = horas*tarifaHora;
        } else {
            salBruto = 35* tarifaHora + (horas -35) * tarifaHora * 1.5;
        }
        
        if (salBruto<=500) {
            salNeto = salBruto;
        } else if (salBruto<=900) {
            tasas = salBruto*0.25;
            salNeto = salBruto-tasas;
        } else {
            tasas = salBruto*0.45;
            salNeto = salBruto - tasas;
        }
        
        System.out.println("Los cáculos de salario bruto y neto de " + nombre + " son los siguientes:");
        System.out.println("Salario Bruto: " + salBruto);
        System.out.println("Salario Neto: " + salNeto);
        System.out.println("Las tasas son: " + tasas);
        
        
        sc.close(); 
        
		}
        
	}

