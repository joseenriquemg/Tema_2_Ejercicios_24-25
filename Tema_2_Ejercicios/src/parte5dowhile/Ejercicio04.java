package parte5dowhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Variable que recoge el numero.
		int numero;

		// Variable para los multiplicadores.
		int multiplicador;
		
		// Variable para el contador.
		int contador = 1;

		// Creamos el numero.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usaurio.
		System.out.println("Introduzca un numero y le diremos su tabla del multiplicar:");

		// Leemos del teclado.
		numero = sc.nextInt();

		while (contador < 11) {

			System.out.println(contador + " x " + numero + " = " + (contador * numero));

			contador++;

		}

	}

}
