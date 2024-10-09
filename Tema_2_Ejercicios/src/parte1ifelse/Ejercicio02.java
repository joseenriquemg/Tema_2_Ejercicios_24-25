package parte1ifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable que recoja el primer numero de usuario.
		int num1;
		
		// Variable que recoja el segundo numero de usuario.
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

		// Realizamos las condiciones correspondientes.
		if (num1 == num2) {
			System.out.println("Sus numeros son iguales.");
		} else {
			System.out.println("Sus numeros son distintos.");
		}

		// Cerramos el Scanner.
		sc.close();

	}

}
