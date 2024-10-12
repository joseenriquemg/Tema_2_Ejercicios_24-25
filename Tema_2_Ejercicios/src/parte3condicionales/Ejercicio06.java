package parte3condicionales;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		/*
		 * Casos de pruebas :
		 * Prueba 1: 23 : 45 : 18 -> Su hora incrementando un segundo es -> 23 : 45 : 19.
		 * Prueba 2: 47 : 34 : 59 -> Su hora incrementando un segundo es -> 47 : 35 : 0.
		 * Prueba 3: 56 : 59 : 59 -> Su hora incrementando un segundo es -> 57 : 0 : 0.
		 */
		
		// Creamos las variables para recoger la hora introducida.
		int horas;
		int minutos;
		int segundos;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos al usuario las horas y leemos del teclado.
		System.out.println("Introduzca su numero de horas:");
		horas = sc.nextInt();
		
		// Solicitamos al usuario los minutos y leemos del teclado.
		System.out.println("Introduzca su numero de minutos:");
		minutos = sc.nextInt();
		
		// Solicitamos al usuario los segundos y leemos del teclado.
		System.out.println("Introduzca su numero de segundos:");
		segundos = sc.nextInt();
		
		segundos ++;
		
		if (segundos > 59) {
			segundos = 00;
			minutos ++;  
			if (minutos > 59) {
				minutos = 00;
				horas ++;
			}
		} 
		
		// Ofrecemos el resultado al usuario.
		System.out.println("Su hora incrementando un segundo es -> " + horas + " : " + minutos + " : " + segundos);
		
		// Cerramos el Scanner.
		sc.close();

	}

}
