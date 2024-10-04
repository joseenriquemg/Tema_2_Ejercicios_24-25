package parte1_if_else;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Variable que recoja el numero de usuario.
		double num;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usuario.
		System.out.println("Introduzca un numero y le diremos si es un casi cero:");

		// Leemos del teclado.
		num = sc.nextDouble();

		// Realizamos las condiciones correspondientes.
		if (num > -1 && num < 0 || num > 0 && num < 1) {
			System.out.println("Su numero es un casi-cero.");
		} else {
			System.out.println("Su numero no es un casi-cero.");
		}

		// Cerramos el Scanner.
		sc.close();

	}

}
