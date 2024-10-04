package parte1_if_else;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Variable que recoja el numero de usuario.
		int num;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos el numero al usuario.
		System.out.println("Introduzca un numero y le diremos si es par o impar:");
		
		// Leemos del teclado.
		num = sc.nextInt();
		
		// Realizamos las condiciones cortrespondientes.
		if (num % 2 == 0) {
			System.out.println("Su numero es par.");
		} else {
			System.out.println("Su numero es impar.");
		}

		// Cerramos el Scanner.
		sc.close();

	}

}
