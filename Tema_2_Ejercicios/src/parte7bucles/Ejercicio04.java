package parte7bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Variable para recoger el primer numero.
		int numero1;

		// Variable para recoger el segundo numero.
		int numero2;

		// Variable para coger el mayor de los dos.
		int mayor = 0;
		int menor = 0;

		// Variable booleana para detectar el mcm.
		boolean hayMcd = false;

		// Variable para recoger el mcm.
		int mcm = 0;

		// Variable para recoger el mcd.
		int mcd = 0;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usaurio el primer numero.
		System.out.println("Introduzca el primer numero:");

		// Leemos del teclado.
		numero1 = sc.nextInt();

		// Solicitamos al usaurio el segundo numero.
		System.out.println("Introduzca el segundo numero:");

		// Leemos del teclado.
		numero2 = sc.nextInt();

		if (numero1 > numero2) {

			mayor = numero1;
			menor = numero2;

		} else if (numero2 >= numero1) {

			mayor = numero2;
			menor = numero1;

		}

		for (int i = menor; !hayMcd; i--) {

			if (numero1 % i == 0 && numero2 % i == 0) {

				hayMcd = true;

				mcd = i;

			}

		}

		mcm = (mayor / mcd) * menor;

		System.out.println("El mcm de sus numeros es : " + mcm);

		// Cerramos el Scanner.
		sc.close();

	}

}
