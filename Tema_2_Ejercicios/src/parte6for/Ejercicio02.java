package parte6for;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable para recoger el numero del usuario,
		int numero;

		// Variable para recoger los numeros multiplos de 3.
		int contador = 0;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamnos el numero al usaurio
		System.out.println("Introduzca un numero y contaremos los multiplos de 3 entre 1 y tu numero:");

		// Leemos el numero del teclado.
		numero = sc.nextInt();

		// Bucle for para imprimir numeros hasta llegar al del usaurio.
		for (int i = 1; i <= numero; i++) {

			// Condicion para que un numero sea multiplo de 3.
			if (i % 3 == 0)

				// Contador de los numeros multiplos de 3.
				contador++;
		}

		// Imprimimos el resultado al usaurio.
		System.out.println("Dentro de su numero hay " + contador + " multiplos de 3.");

		// Cerramos el Scanner.
		sc.close();

	}

}
