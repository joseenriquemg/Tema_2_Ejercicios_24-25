package parte4while;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos una variable para recoger los numero.
		int numero;
		
		// Variable para ir recogiendo la suma de los numeros.
		double suma = 0;
		
		// Variable para recoger el contador de numeros.
		int contador = 0;
		
		// Variable para recoger la nota media.
		double media;

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
			
			contador ++;

			// Solicitamos el resto de numeros al usuario.
			System.out.println("Introduzca un numero al que le iremos sumando el resto:");
			numero = sc.nextInt();
		}
		
		// Operaciones para la media.
		media = suma / contador;
		
		// Ofrecemos el resultado al usuario.
		System.out.println("Operacion finalizada. Devolviendo resultado...");

		System.out.println("El resultado de su media es: " + media);
		
		// Cerramos el Scanner.
		sc.close();

	}

}
