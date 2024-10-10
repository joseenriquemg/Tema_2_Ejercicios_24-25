package parte3condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		/*
		 * Casos de pruebas: 
		 * Prueba 1: 1 -> 1
		 * Prueba 2: -3 -> 3
		 * Prueba 3: 0 -> 0
		 */

		// Creamos una primera variable para recoger el numero del usuario.
		int numero;
		
		// Creamos una variable para recoger el valor absoluto.
		int valorAplicado;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usuario comprendido entre 1-9999:
		System.out.println("Introduzca un numero y calcularemos el valor absoluto:");

		// Leemos del teclado.
		numero = sc.nextInt();
		
		// Operador ternario para obtener el valor absoluto.
		valorAplicado = numero < 0 ? Math.abs(numero)  : numero;
		
		// Ofrecemos el resultado al usuario.
		System.out.println("Su numero en valor absoluto es: " + valorAplicado);
		
		// Cerramos el Scanner.
		sc.close();
		
		

	}

}
