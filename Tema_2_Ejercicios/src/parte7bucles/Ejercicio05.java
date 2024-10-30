package parte7bucles;

import java.util.Scanner;

public class Ejercicio05 {

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
		
		// Primer bucle for para recorrer las filas.
		for (int i = 1; i <= numero; i++) {

			//Segundo bucle for para recoger las columnas.
			for (int j = 1; j <= i; j++) {

				System.out.print(i);

			}

			System.out.println();

		}

		// Cerramos el Scanner.
		sc.close();

	}

}
