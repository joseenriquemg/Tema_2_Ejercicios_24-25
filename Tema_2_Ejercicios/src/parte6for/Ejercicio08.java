package parte6for;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Variable para recoger el primer numero.
		int num1;

		// Variable para recoger el segundo numero.
		int num2;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el primer numero al usuario.
		System.out.println("Introduzca su primer numero:");

		// Leemos del teclado.
		num1 = sc.nextInt();

		// Solicitamos el segundo numero al usuario.
		System.out.println("Introduzca su segundo numero:");

		// Leemos del teclado.
		num2 = sc.nextInt();

		if (num1 > num2) {

			for (int i = num2; i < num1; i++) {

				System.out.print(i + ", ");

			}

			System.out.println(num1);

		} else {

			for (int i = num2; i > num1; i--) {

				System.out.print(i + ", ");

			}

			System.out.println(num1);
		}
		// Bucle for para contar los numeros.

		// Cerramos el Scanner.
		sc.close();

	}

}
