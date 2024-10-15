package parte4while;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Creamos una variable para recoger los numero.
		int numero;

		// Variable para ir recogiendo la suma de los numeros.
		int suma = 0;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usuario.
		System.out.println("Introduzca un numero al que le iremos sumando el resto:");

		// Leemos del teclado.
		numero = sc.nextInt();

		// Bucle while para pedir numeros al usuario.
		while (numero >= 0) {

			// Operaciones
			suma += numero;

			// Solicitamos el resto de numeros al usuario.
			System.out.println("Introduzca un numero al que le iremos sumando el resto:");
			numero = sc.nextInt();
		}

		System.out.println("Operacion finalizada. Devolviendo resultado...");

		System.out.println("El resultado de su operacion es: " + suma);

		// Cerramos el Scanner.
		sc.close();

	}

}
