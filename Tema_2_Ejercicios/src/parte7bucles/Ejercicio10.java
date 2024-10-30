package parte7bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int numero = 0;
		int numeroInv = 0;
		int digito = 0;
		int numeroOriginal;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Introduzca un número:");
			numero = sc.nextInt();

		} while (numero < 0);

		numeroOriginal = numero;
		while (numero > 0) {
			digito = numero % 10;
			numeroInv = numeroInv * 10 + digito;
			numero /= 10;
		}

		if (numeroOriginal == numeroInv) {
			System.out.println("Su número es capicúa");
		} else {
			System.out.println("Su número no es capicúa");
		}

		sc.close();
	}

}
