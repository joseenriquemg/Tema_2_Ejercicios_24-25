package parte7bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Variable para recoger los numeros del usuario.
		int numero = -1;

		// Variable para ir cambiando mi numero.
		int mayor;

		// Variable para recoger los fallos.
		int fallos = 0;

		// Variable para recoger los numeros intruducidos.
		int contador = 0;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		//Bucle para pedir el numero entero.
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
			
			// Limpiamos el Scanner.
			sc.nextLine();
			
		}
		} while (numero < 0);

		// Creamos un bucle do-while para seguir pidiendo numeros.
		do {

			// Asignamos los nuevos numeros a mayor.
			mayor = numero;

			// Excepcion de numeros no enteros.
			try {

				// Solicitamos el numero al usuario.
				System.out.print("Dime un numero: ");

				// Leemos del teclado.
				numero = sc.nextInt();

			} catch (InputMismatchException e) {

				// Lanzamos mensaje de error.
				System.out.println("Debe introducir un numero entero.");

			} finally {
				
				// Limpiamos el Scanner.
				sc.nextLine();
				
			}

			// Aumentamos el contador de numeros.
			contador++;

			// Comprobamos que los numeros que va introduciendo son mayores.
			if (numero < mayor) {

				// Mensaje de numero menor.
				System.out.println("Fallo, es menor.");

				// Aumentamos contador de numeros fallados.
				fallos++;

			}

		} while (numero != 0);

		// Ofrecemos el resultado al usaurio.
		System.out.println("Total de numeros introducidos: " + contador);
		System.out.println("Total de numeros fallados: " + fallos);

		// Cerramos el Scanner.
		sc.close();

	}

}
