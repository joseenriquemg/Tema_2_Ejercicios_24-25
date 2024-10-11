

package parte3condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		/*
		 * Casos de pruebas: 
		 * Prueba 1: 8 -> Su numero SI es capicua. 
		 * Prueba 2: 55 -> Su numero SI es capicua. 
		 * Prueba 3:343 -> Su numero SI es capicua. 
		 * Prueba 4: 1221 -> Su numero SI es capicua. 
		 * Prueba 5: 12 -> Su numero NO es capicua. 
		 * Prueba 6: 345 -> Su numero NO es capicua. 
		 * Prueba 7: 2342 -> Su numero NO es capicua.
		 * Prueba 8: 333333 -> Su numero no esta comprendido entre los limites establecidos.
		 */

		// Creamos una primera variable para recoger el numero del usuario.
		int numero;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usuario comprendido entre 1-9999:
		System.out.println("Introduzca su numero (1 - 9999) y le diremos si es capicua:");

		// Leemos del teclado.
		numero = sc.nextInt();

		// Condicion para establecer los limites permitidos.
		if (numero > 0 && numero < 10000) {

			// Condicion para los numeros de una cifra.
			if (numero < 10) {

				System.out.println("Su numero SI es capicua.");

				// Condicion para los numeros de dos cifras.
			} else if (numero / 10 == numero % 10) {

				System.out.println("Su numero SI es capicua.");

				// Condicion para los numeros de tres cifras.
			} else if (numero / 100 == numero % 10) {

				System.out.println("Su numero SI es capicua.");

				// Condicion para los numeros de cuatro cifras.
			} else if (numero / 1000 == numero % 10 && (numero / 100) % 10 == (numero % 100) / 10) {

				System.out.println("Su numero SI es capicua.");

				// En caso de no entarr en los if se ejecutara el else.
			} else {

				System.out.println("Su numero NO es capicua.");

			}

			// Mensaje para numeros fuera del rango.
		} else {

			System.out.println("Su numero no esta comprendido entre los limites establecidos.");

		}

		// Cerramos el Scanner.
		sc.close();

	}

}
