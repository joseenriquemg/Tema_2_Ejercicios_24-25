package parte1_if_else;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Variable donde recogeremos al nota del usuario.
		double nota;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usaurio.
		System.out.print("Ingrese la nota de su examen (1 - 10): ");

		// Leemos el numero del usuario.
		nota = sc.nextDouble();

		// Creamos nuestras condiciones.
		if (nota < 5) {
			System.out.println("INSUFICIENTE");

		} else if (nota >= 5 && nota <= 6) {
			System.out.println("SUFICIENTE");

		} else if (nota >= 6 && nota <= 7) {
			System.out.println("BIEN");

		} else if (nota >= 7 && nota < 9) {
			System.out.println("NOTABLE");

		} else if (nota >= 9 && nota <= 10) {
			System.out.println("SOBRESALIENTE");

		} else {
			System.out.println("Su nota no esta comprendida entre 1 y 10.");
		}

		// Cerramos el Scanner
		sc.close();

	}

}
