package boletin07_bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		
		// Pedir al usuario la edad, crear excepción 
		
		// Crear Scanner para leer los datos del usuario
		Scanner reader = new Scanner(System.in); 
		
		// Crear variables
		int edad; 
		
		// Preguntar la edad del usuario
		System.out.println("Introduce tu edad: ");		
		try {
			/*
			 * BLOQUE TRY
			 * Aquí va el código que puede fallar
			 * Si cualquier instrucción de este bloque genera una excepción
			 * Java va a saltar al bloque catch
			 */
		
		edad = reader.nextInt(); // Esta línea puede lanzar InputMismatchException, si se escribe
		
		/*
		 * ASERCION
		 * Comprobar que la edad introducida tiene sentido. 
		 * Las aserciones son comprobaciones internas del programador. Sea activan con 
		 * Si la condicion es falsa --> se lanza AssertionError
		 */
		
		assert (edad >= 0 && edad <= 130) : "Edad no propia de los seres humanos"; 
		
		// Si no ha fallado nada, llegamos aqui
		
		System.out.println("Registro completado correctamente"); 
		System.out.println("Edad introducidad: " + edad); 

		} catch (InputMismatchException e)  {
		// PRIMER CATCH
		// Este bloque captura errores de tipo InputMismathException, es decir, 
		// cuando el usuaurio introduce algo que no es un número entero
	
			System.out.println("ERROR: Debes introducir un número entero válido");
			
		} catch (AssertionError e) {
			// SEGUNDO CATCH
			// Captura los errores de asercion.
			// Esto ocurre si la edad no esta dentro del rango que hemos definido
			
			System.out.println("ERROR DE VALIDACIÓN INTERNA: " + e.getMessage ());
		
		} catch (Exception e) {
			// ÚLTIMO CATCH (GENERAL)
			// Captura cualquier otro tipo de excepcion no prevista en caso anteriores
			System.out.println("Error no identificado");
		
		} finally {
			// BLOQUE FINALLY 
			// Este bloque se ejecuta siempre:
			// - Haya o no excepciones
			// - Se hayan cumplido o no las aserciones
			// - Da igual cuántos catch se ejecuten
			
			System.out.println("Cerrando recursos...");
		}
			
		// Cerrar Scanner
		reader.close(); 
		
		// FIN DEL PROGRAMA
		// Ya fuera del TRY-CATCH-FINALLY el programa se ejecuta normalmente
		
		System.out.println("Programa terminado!");

	}

}
