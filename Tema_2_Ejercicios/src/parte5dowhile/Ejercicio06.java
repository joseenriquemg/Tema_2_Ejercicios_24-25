package parte5dowhile;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Ponemos nuestras variables
		String jugador1, jugador2;

		String seguirJugando;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		do {
		
			// Pedimos a los dos jugadores su eleccion y leemos del teclado
			System.out.println("Elija entre: Piedra = 1, Tijeras = 2 y Papel = 3");

			// Dejamos una linea en blanco
			System.out.println();

			do {
				
				// Solicitamos su respueta al usuario 1
				System.out.println("Elija JUGADOR 1: ");

				// Leemos la respueta del Scanner
				jugador1 = sc.next();

			} while (!jugador1.equals("1") && !jugador1.equals("2") && !jugador1.equals("3"));

			do {
				// Solicitamos la respuesrta al usuario 2
				System.out.println("Elija JUGADOR 2: ");

				// Leemos las respuesta del Scanner
				jugador2 = sc.next();

			} while (!jugador2.equals("1") && !jugador2.equals("2") && !jugador2.equals("3"));

			// Añadimos el resultado mediante un if-else
			if (jugador1 == jugador2) {
				System.out.println("EMPATE");
			} else if (jugador1 == "1" && jugador2 == "2" || jugador1 == "2" && jugador2 == "3"
					|| jugador1 == "3" && jugador2 == "1") {
				System.out.println("Gana JUGADOR 2");
			} else
				System.out.println("Gana JUGADOR 1");

			System.out.println("¿Desea jugar de nuevo? Pulse S:");

			seguirJugando = sc.next();
			

		} while (seguirJugando.equals("S"));

		// Cerramos el Scanner
		sc.close();

	}

}
