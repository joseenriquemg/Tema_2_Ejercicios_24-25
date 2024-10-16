package parte4while;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Variable para recoger las alturas.
		int alturas;
		
		// Variable para seleccionar el maximo valor.
		int masAlto = 0;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos el nuemro al usuaruio y leemos del teclado.
		System.out.println("Introduzca la altura de sus arboles en cm (-1 para salir)");
		
		alturas = sc.nextInt();
		
		while (alturas >= 0) {
			
			if (alturas > masAlto) {
				
				masAlto = alturas;
				
			}
			
			// Solicitamos el nuemro al usuaruio y leemos del teclado.
			System.out.println("Introduzca la altura de sus arboles en cm (-1 para salir)");
			
			alturas = sc.nextInt();
			
		}
				
		System.out.println("Su arbol mas alto mide un total de " + masAlto + " centrimetros");
		
		
		
		// Cerramos el Scanner.
		sc.close();
		

	}

}
