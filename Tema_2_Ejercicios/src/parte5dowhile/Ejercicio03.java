package parte5dowhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Variable que recogera el numero del usuario.
		int numero;

		// Variable que recogera el contador de numeros.
		int contador = 0;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usuario.
		System.out.println("Introduzca un numero:");

		// Leemos del teclado.
		numero = sc.nextInt();
		
		// Creamos un bucle do while.
		do {

			contador++;

			if (contador == numero) {

				System.out.println(contador);
			} else {

				System.out.print(contador + " + ");
			}

		} while (contador < numero);

		// Cerramos el Scanner.
		sc.close();

	}

}
