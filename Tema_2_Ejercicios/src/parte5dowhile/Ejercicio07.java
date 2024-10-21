package parte5dowhile;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Variable que almacena el primer numero del usuario.
		double num1;

		// Variable que almacena el segundo numero del usuario.
		double num2;

		// Creamos una variable para el bloque switch.
		String eleccion = "";

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		
		do {

		// Solicitamos al usuario su primer numero.
		System.out.println("Introduzca el primer numero con el que desea operar:");

		// Leemos el numero del teclado.
		num1 = sc.nextDouble();

		// Solicitamos al usuario su segundo numero.
		System.out.println("Introduzca el segundo numero con el que desea operar:");

		// Leemos el numero del teclado.
		num2 = sc.nextDouble();

		// Solicitamos al usaurio su opcion.
		System.out.println("Selecciones que desea realizar:");
		System.out.println("A. Sumar los numeros.");
		System.out.println("B. Restar los numeros.");
		System.out.println("C. Multiplicar los numeros.");
		System.out.println("D. Dividir los numeros.");
		System.out.println("E. Salir.");

		// Leemos del teclado.
		eleccion = sc.next();

		switch (eleccion) {
		case "A" -> System.out.println("La suma de sus numeros resulta: " + (num1 + num2));

		case "B" -> System.out.println("La resta de sus nuemros resulta: " + (num1 - num2));

		case "C" -> System.out.println("La multiplicacion de sus nuemros resulta: " + (num1 * num2));

		case "D" -> {
			if (num2 != 0) {
				System.out.println("La division de sus nuemros resulta: " + (num1 / num2));
			} else {
				System.out.println("No se puede dividir entre 0");
			}
		}

		default -> System.out.println("Saliendo...");
		}
		
		} while (!eleccion.equals("E")); 
			
		// Cerramos el Scanner.
		sc.close();

	}

}
