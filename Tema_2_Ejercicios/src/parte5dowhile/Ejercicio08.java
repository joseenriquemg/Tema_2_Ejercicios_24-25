package parte5dowhile;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Creamos una variable para recoger la primera tirada.
		String tirada1 = "";

		// Creamos una variable para recoger la segunda tirada.
		String tirada2 = "";

		// Variable que recogera la suma de sus tiradas.
		int suma;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		do {

			// Solicitamos al usuario el valor de su tirada 1.
			System.out.println("Introduzca el valor de su tirada 1 (UNO, DOS,...)");

			// Leemos del teclado.
			tirada1 = sc.next();

		} while (!tirada1.equals("UNO") || !tirada1.equals("DOS") || !tirada1.equals("TRES")
				|| !tirada1.equals("CUATRO") || !tirada1.equals("CINCO") || !tirada1.equals("SEIS"));

		do {

			// Solicitamos al usuario el valor de su tirada 2.
			System.out.println("Introduzca el valor de su tirada 2 (UNO, DOS,...)");

			// Leemos del teclado.
			tirada2 = sc.next();

		} while (!tirada2.equals("UNO") || !tirada2.equals("DOS") || !tirada2.equals("TRES")
				|| !tirada2.equals("CUATRO") || !tirada2.equals("CINCO") || !tirada2.equals("SEIS"));

		// Creamos el primer switch para el dado 1.
		int dado1 = switch (tirada1) {

		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};

		// Creamos el segundo switch para el dado 2.
		int dado2 = switch (tirada2) {

		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};

		// Operacion para sumar las dos tiradas.
		suma = dado1 + dado2;

		// Devolvemos el resultado al usuario.
		if (dado1 == 0 || dado2 == 0) {
			System.out.println("Su dado no esta permitido.");
		} else {
			System.out.println("La suma de los dados resulta: " + suma);
		}

		// Cerramos el Scanner.
		sc.close();

	}

}
