package parte1ifelse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable que recogera el primer numero.
		double numA;

		// Variable que recogera el segundo numero.
		double numB;

		// Variable que recogera el tercer numero.
		double numC;

		// Variables que recogeran el resultado.
		double partePositiva;
		
		double parteNegativa;
		
		// Variables para acortar cuentas.
		double raiz;
		
		double parteAbajo;
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario los numeros para la operacion.
		System.out.println("Introduzca el valor de A:");
		numA = sc.nextInt();

		System.out.println("Introduzca el valor de B:");
		numB = sc.nextInt();

		System.out.println("Introduzca el valor de C:");
		numC = sc.nextInt();
		
		// Realizamos las operaciones correspondientes
		parteAbajo = 2 * numA;
		
		raiz = numB * numB - 4 * numA * numC;
		
		partePositiva = (- numB - Math.abs(Math.sqrt(raiz))) / parteAbajo;
		
		parteNegativa = (- numB + Math.abs(Math.sqrt(raiz))) / parteAbajo;
		
		// Condicion para q la operacion pueda ser ejecutada.
		if ( parteAbajo == 0 || raiz < 0 ) {
			System.out.println("Su ecuacion no tiene solucion.");
		} else {
			System.out.println("Las soluciones de su ecuacion es: " );
			System.out.println("x 1 = " + partePositiva );
			System.out.println("x 2 = " + parteNegativa);
		}
		
		// Cerramos el Scanner.
		sc.close();
		

	}

}
