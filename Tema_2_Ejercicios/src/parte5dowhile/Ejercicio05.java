package parte5dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		int numero;

		String respuesta = "";
		
		int menorQue = 1;
		
		int mayorQue = 101;

		Random rand = new Random();

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		do {

			numero = rand.nextInt(menorQue, mayorQue);
			
			if (numero == mayorQue) {
				
				numero = mayorQue++;
				
			}  
				
			if (numero == menorQue) {
				
				numero = menorQue++;
				
			}

			System.out.println("¿Su numero es el " + numero + "?");

			respuesta = sc.next();

			if (respuesta.equals("Menor")) {

				mayorQue = numero;

			} else if (respuesta.equals("Mayor")) {

				menorQue = numero;

			}
			

		} while (!respuesta.equals("Correcto"));

		System.out.println("¡Acerteee!");

		sc.close();

	}

}
