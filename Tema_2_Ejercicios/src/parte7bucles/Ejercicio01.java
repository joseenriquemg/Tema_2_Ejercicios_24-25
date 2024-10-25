package parte7bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Variable para recoger las horas del usaurio.
		int horas;

		// Variable para recoger los minutos del usuario.
		int minutos;

		// Variable para recoger los segundos del usaurio.
		int segundos;

		// Variable para recoger los segundos a incrementar.
		int incrementoSegundos;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		do {
			// Solicitamos las horas al usuario.
			System.out.println("Introduzca las horas:");

			// Leemos del teclado.
			horas = sc.nextInt();

		} while (horas < 0 || horas > 23);

		do {
			// Solicitamos los minutos al usuario.
			System.out.println("Introduzca los minutos:");

			// Leemos del teclado.
			minutos = sc.nextInt();

		} while (minutos < 0 || minutos > 59);

		do {
			// Solicitamos los segundos al usuario.
			System.out.println("Introduzca los segundos:");

			// Leemos del teclado.
			segundos = sc.nextInt();

		} while (segundos < 0 || segundos > 59);

		// Solicitamos al usuario los segundos a incrementar.
		System.out.println("¿Cuantos segundos desea incrementar?");

		// Leemos del teclado.
		incrementoSegundos = sc.nextInt();

		for (int i = 0; i < incrementoSegundos; i++) {
			
			// Vamos incrementando los segundos.
			segundos++;
			
			// Creamos una condición para los segundos.
			if (segundos == 60) {
				segundos = 0;
				minutos++;

				// Creamos una condición para los minutos.
				if (minutos == 60) {
					minutos = 0;
					horas++;
					
					// Creamos uan condicion para las horas.
					if (horas == 24) {
						horas = 0;
						segundos ++;
					}
					
				}
			}
		}

		System.out.println(horas + " : " + minutos + " : " + segundos);

		// Cerramos el Scanner.
		sc.close();

	}

}
