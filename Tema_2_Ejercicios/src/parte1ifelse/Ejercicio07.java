package parte1ifelse;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Variable que recogera el numero del usuario.
		int numero = 0;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner ( System.in);
		
		// Solicitamos el numero al usuario.
		System.out.println("Introduzca su numero ( 0 - 99999) : ");
		
		// Leemos del teclado.
		numero = sc.nextInt();
		
		if (numero >= 0 && numero < 10) {
			System.out.println("Su numero tiene una cifra.");
			
		} else if (numero >= 10 && numero < 100) {
			System.out.println("Su numero tiene dos cifras.");
			
		} else if (numero >= 100 && numero < 1000) {
			System.out.println("Su numero tiene tres cifras.");
			
		} else if (numero >= 1000 && numero < 10000) {
			System.out.println("Su numero tiene cuatro cifras.");
			
		} else if (numero >= 10000 && numero < 100000) {
			System.out.println("Su numero tiene cinco cifras.");
			
		} else {
			System.out.println("Su numero esta fuera de las dimensiones establecidas.");
			
		}
		
		// Cerramos el Scanner.
		sc.close();



	}

}
