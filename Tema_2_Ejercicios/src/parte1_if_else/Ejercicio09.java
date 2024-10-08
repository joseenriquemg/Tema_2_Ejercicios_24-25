package parte1_if_else;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Ponemos nuestras variables
		int jugador1, jugador2;
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Pedimos a los dos jugadores su eleccion y leemos del teclado
		System.out.println("Elija entre: Piedra = 1, Tijeras = 2 y Papel = 3");
		// Dejamos una linea en blanco
		System.out.println();
		// Solicitamos su respueta al usuario 1
		System.out.println("Elija JUGADOR 1: ");
		// Leemos la respueta del Scanner
		jugador1 = sc.nextInt();
		// Solicitamos la respuesrta al usuario 2
		System.out.println("Elija JUGADOR 2: ");
		// Leemos las respuesta del Scanner
		jugador2 = sc.nextInt();
		// Añadimos el resultado mediante un if-else
		if (jugador1 == jugador2) {
			System.out.println("EMPATE");
		} else if (jugador1 == 1 && jugador2 == 2 || jugador1 == 2 && jugador2 == 3 || jugador1 == 3 && jugador2 == 1) {
			System.out.println("Gana JUGADOR 1");
		} else
			System.out.println("Gana JUGADOR 2");
		// Cerramos el Scanner
		sc.close();

	}

}
