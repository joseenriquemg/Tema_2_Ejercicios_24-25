package parte6for;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Variable para recoger el numero del usuario,
		int numero;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamnos el numero al usaurio
		System.out.println("Introduzca un numero y contaremos hasta llegar:");

		// Leemos el numero del teclado.
		numero = sc.nextInt();

		// Bucle for para imprimir numeros hasta llegar al del usaurio.
		for (int i = 1; i <= numero; i++) {

			System.out.println(i);
		}

		// Cerramos el Scanner.
		sc.close();

	}

}
