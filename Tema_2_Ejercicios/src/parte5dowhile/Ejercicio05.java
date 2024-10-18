package parte5dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		int numero;

		String respuesta = "";

		Random rand = new Random();

		

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		do {
			
			numero = rand.nextInt(1, 101);

			System.out.println("¿Su numero es el " + numero + "?");

			respuesta = sc.next();

			if (respuesta == "Menor") {

				numero = rand.nextInt(1, numero);

				System.out.println("¿Su numero es el " + numero + "?");

				respuesta = sc.next();

			} else if (respuesta == "Mayor") {

				numero = rand.nextInt(numero, 101);

				System.out.println("¿Su numero es el " + numero + "?");

				respuesta = sc.next();

			}

		} while (respuesta != "Correcto.");

		System.out.println("¡Acerteee!");

	}

}
