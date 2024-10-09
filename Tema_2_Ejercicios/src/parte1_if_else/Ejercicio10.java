package parte1_if_else;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		// Creamos las variables
		double num1;
		double num2;
		double num3;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario tres numeros
		System.out.println("Introduzca un numero: ");
		
		// Leemos el numero del teclado
		num1 = sc.nextDouble();
		
		System.out.println("Introduzca un numero: ");
		
		// Leemos el numero del teclado
		num2 = sc.nextDouble();
		
		System.out.println("Introduzca un numero: ");
		
		// Leemos el numero del teclado
		num3 = sc.nextDouble();
		
		// Comprobamos si la suma de dos numeros es igual al otro
		if (num1 + num2 == num3 || num2 + num3 == num1 || num1 + num3 == num2) {
			System.out.println("La suma de dos numeros es igual al otro.");
		} else {
			System.out.println("No hay ninguna suma entre ellos.");
		}
		// Cerramos el Scanner
		sc.close();

	}

}
