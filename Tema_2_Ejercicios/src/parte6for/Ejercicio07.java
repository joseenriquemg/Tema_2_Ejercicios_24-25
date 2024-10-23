package parte6for;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Variable para recoger el numero del usuario.
		int numero = 0;
		
		// Variable boolean para saber si es primo o no.
		boolean esPrimo = true;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner ( System.in);
		
		// Solicitamso el numero al usuario.
		System.out.println("Introduzca un numero y le diremos si es primo:");
		
		// Leemos del teclado.
		numero= sc.nextInt();
		
		if (numero == 1 || numero == 0) {
			
			esPrimo = false;
			
		}
		// Bucle para comprobar los numeros entre 1 y mi numero.
		for (int i = 2; i < numero && esPrimo; i++)
		
			if (numero % i == 0) {
				
				esPrimo = false;
				
			} 
		
		if (esPrimo) {
			 
			System.out.println("Su numero es primo.");		
		} else {
			
			System.out.println("Su numero no es primo.");
			
		}
			
		// Cerramos el Scanner.
		sc.close();

	}

}
