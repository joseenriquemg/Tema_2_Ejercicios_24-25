package parte4while;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Creamos una variable para recoger los numero.
		int numero;

		// Variable para ir recogiendo la suma de los numeros.
		double suma = 0;
		
		// Variable para recoger la suma de los negativos.
		double sumaNegativos = 0;

		// Variable para recoger el contador de numeros.
		int contador = 0;
		
		// Variable para el contador de numeros negativos.
		int contadorNegativos = 0;

		// Variable para recoger la nota media.
		double media;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usuario.
		System.out.println("Introduzca un numero al que le iremos sumando el resto:");

		// Leemos del teclado.
		numero = sc.nextInt();

		// Bucle while para pedir numeros al usuario.
		while (contador < 10) {

			if (numero > 0) {

				suma += numero;

			} else if (numero < 0) {

				sumaNegativos += numero;

				contadorNegativos++;

			} else {
				
				contador ++;
				
			}

			// Solicitamos el resto de numeros al usuario.
			System.out.println("Introduzca otro numero:");
			numero = sc.nextInt();
		}

		// Operaciones para la media.
		media = sumaNegativos / contadorNegativos;

		// Ofrecemos el resultado al usuario.
		System.out.println("Operacion finalizada. Devolviendo resultado...");

		System.out.println("El resultado de la suma de sus positivos es: " + suma);
		System.out.println("El resultado de la media de sus negativos es: " + media);
		System.out.println("El contador de 0 introducidos es: " + contador);

		// Cerramos el Scanner.
		sc.close();

	}

}
