package parte6for;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable para recoger las notas de los usuarios.
		int notas;
		
		// Variable para recoger el total de suspensos.
		int suspensos = 0;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Bucle para pedir las 5 notas.
		for (int i = 1; i <= 5; i++) {
			
			// Solicitamos las notas al usaurio.
			System.out.println("Introduzca la nota de los 5 alumnos:");
			
			// Leemos del teclado.
			notas = sc.nextInt();
			
			if (notas < 5) {
				
				suspensos++;
				
			}
			
		}
		
		// Ofrecemos el resultado al usaurio.
		System.out.println("Hay un total de " + suspensos + " alumnos suspensos.");

		// Cerramos el Scanner.
		sc.close();

	}

}
