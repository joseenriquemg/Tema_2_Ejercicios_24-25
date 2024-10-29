package parte7bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable paera recoger el numero del usuario.
		int numero;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		do {
		// Solicitamos el numero al usaurio.
		System.out.println("Introduzca un numero:");
		
		// Leemos del teclado.
		numero = sc.nextInt();
		
		} while (numero < 1);
		
		for (int i = 0; i < numero; i++) {
			
			for (int j = i; j <= numero; j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
			
		}
		
		// Cerramos el Scanner.
		sc.close();

	}

}
