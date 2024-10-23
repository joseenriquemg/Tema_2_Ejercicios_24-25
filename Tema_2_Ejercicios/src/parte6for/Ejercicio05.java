package parte6for;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable donde recogeremos el numero del usuario.
		int numero;

		// Variable donde recogeremos el factorial.
		long factorial = 1;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usuario.
		System.out.println("Introduzca un numero y buscaremos su factorial:");

		// Leemos del teclado.
		numero = sc.nextInt();

		// Bucle for para contar las veces que entro en el bucle.
		for (int i = 1; i <= numero; i++) {

			if (i < numero) {

				System.out.print(i + " x ");

			}

			factorial *= i;

		}
		// Ofrecemos el resultado al usaurio.
		System.out.println(numero + " = " + factorial);

		// Cerramos el Scanner.
		sc.close();

	}

}
