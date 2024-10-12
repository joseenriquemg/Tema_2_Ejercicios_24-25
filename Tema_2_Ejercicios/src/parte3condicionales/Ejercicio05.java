package parte3condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Casos de Pruebas:
		 * Prueba 1: 22 + 33 = 55. -> Es correcto. ¡Bien hecho!
		 * Prueba 2: 22 + 33 = 67. -> Vaya, sus calculos han fallado. ¡Intentelo de nuevo!
		 */

		// Creamos una variable para recoger el numero del usuario.
		int solucionUsuario;
		
		// Variables en las que recogeremos los numeros aleatorios.
		int random1;
		int random2;
		
		// Variable que recogera la solucion correcta.
		int solucionCorrecta;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Creamos dos numeros Random para sumarlos.
		Random rand = new Random();
		
		random1 = rand.nextInt(1,100);
		
		random2 = rand.nextInt(1,100);
		
		// Solicitamos al usuario su numero.
		System.out.println("Resuelva la siguiente operacion: " + random1 + " + " + random2 + " = ?");
		
		// Leemos del teclado.
		solucionUsuario = sc.nextInt();
		
		// Sumamos los dos numeros aleatorios.
		solucionCorrecta = random1 + random2;
		
		// Ofrecemos el resultado al usaurio con un if else.
		if (solucionUsuario == solucionCorrecta) {
			
			System.out.println("Es correcto. ¡Bien hecho!");
			
		} else {
			
			System.out.println("Vaya, sus calculos han fallado. ¡Intentelo de nuevo!");
			
		}

		// Cerramos el nuevo Scanner.
		sc.close();

	}

}
