package parte7bucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Variable para recoger el numero al usuario.
		int numero = 0;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		do {

			// Solicitamos el numero al usaurio.
			System.out.println("Introduzca un numero del 1 al 20 y haremos una piramide:");

		} while (numero < 1 && numero > 20);

		// Leemos el numero del teclado.
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {

			// Creamos un bucle for para la piramide.
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");

			}
			for (int j = i - 1; j >= 1; j--) {

				System.out.print(j + " ");

			}
			System.out.println();

		}

		// Cerramos el Scanner.
		sc.close();

	}

}
