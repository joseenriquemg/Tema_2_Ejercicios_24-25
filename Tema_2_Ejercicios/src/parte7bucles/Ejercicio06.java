package parte7bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable paera recoger el numero del usuario.
		int numero;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		do {
			// Solicitamos el numero al usaurio.
			System.out.println("Introduzca un numero:");

			// Leemos del teclado.
			numero = sc.nextInt();

		} while (numero < 1);

		// Primer bucle for para recoger las filas.
		for (int i = 0; i < numero; i++) {

			// Segundo bucle for para recorrer las columnas.
			for (int j = numero; j > i; j--) {

				// Imprimimos los espacios de la piramide.
				System.out.print(" ");

			}

			// Tercer bucle para recorrer las columnas.
			for (int j = 0; j <= i; j++) {

				// Imprimimos los asteriscos.
				System.out.print("* ");

			}

			// Imprimimos el salto de linea.
			System.out.println();
		}

		// Cerramos el Scanner.
		sc.close();

	}

}
