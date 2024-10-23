package parte6for;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Variable para recoger los numeros del usuario.
		double numeros;

		// Variable que recoge el numero de numeros introducidos
		int contador = 0;

		// Variable para recoger la suma de numeros.
		double suma = 0;

		// Creamos una variable para recoger la media de la nota
		double media;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un buckle for para recoger los 10 numeros.
		for (int i = 0; i < 10; i++) {

			// Solicitamos el numero al usaurio.
			System.out.println("Introduzca numeros hasta llegar a 10.");

			// Leemos del teclado.
			numeros = sc.nextDouble();

			// If para aumentar el contador
			if (contador < 11) {

				contador++;

			}

			// Vamos sumando los numeros.
			suma += numeros;

		}

		// Opreacion para calcular la media.
		media = suma / contador;

		// Ofrecemos el resultado al usaurio.
		System.out.println("La media entre sus numeros resulta: " + media);

		// Cerramos el Scanner.
		sc.close();

	}

}
