package parte7bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Solicitamos el numero al usuario.
		int numero;

		// Variable para recoger los numeros primos.
		boolean esPrimo;
		
		// Sumamos los primos paar oferecer la cantidad.
		int sumaPrimos = 0;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usaurio.
		System.out.println("Introduzca su numero y le diremos sus primos entre y este:");

		// Leemos del teclado.
		numero = sc.nextInt();

		for (int primos = 2; primos < numero; primos++) {

			esPrimo = true;

			for (int i = 2; esPrimo && i < primos; i++) {

				if (primos % i == 0) {

					esPrimo = false;

				}

			}
			if (esPrimo) {

				System.out.print(primos + ", ");
				sumaPrimos++;

			}
			
		}
		System.out.println();
		System.out.println("Hay un total de " + sumaPrimos + " entre tu numero y 1.");

		// Cerramos el Scanner.
		sc.close();

	}
}
