package parte7bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Variable para recoger el numero.
		int numero = 0;

		// Variable para contar las cifras del numero.
		int cifras = 1;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Bucle para pedir el numero entero.
		do {
			// Excepcion de numeros no enteros.
			try {

				// Solicitamos el numero al usuario.
				System.out.print("Dime un numero inicial: ");

				// Leemos del teclado.
				numero = sc.nextInt();

			} catch (InputMismatchException e) {

				// Lanzamos mensaje de error.
				System.out.println("Introduzca un numero entero.");

			} finally {
				
				sc.nextLine();
				
			}

			
		} while (numero <= 0);

		while (numero / 10 > 0) {

			cifras++;
			
			numero /= 10;
			
		
		}

		System.out.println("Su numero tiene " + cifras + " cifras.");

		// Cerramos el Scanner.
		sc.close();

	}

}
