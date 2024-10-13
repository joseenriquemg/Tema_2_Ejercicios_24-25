package parte3condicionales;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		/*
		 * Caso de pruebas:
		 * Prueba 1: 56 -> El número en letras es: cincuenta y seis.
		 * Prueba 2: 12 -> El número en letras es: doce.
		 * Prueba 3: 20 -> El número en letras es: veinte.
		 */

		// Creamos una variable para recoger el numero del usuario.
		int numero;

		// Creamos una variable para asignar el resultado.
		String numeroEnLetras = "";

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos un número entero entre 1 y 99
		System.out.println("Introduzca un número entero entre 1 y 99:");

		// Leemos del teclado.
		numero = sc.nextInt();

		// Validamos que el número esté en el rango correcto
		if (numero < 1 || numero > 99) {
			System.out.println("El número debe estar entre 1 y 99.");
		} else {

			// Números entre 1 y 15
			if (numero <= 15) {
				switch (numero) {
				case 1:
					numeroEnLetras = "uno";
					break;
				case 2:
					numeroEnLetras = "dos";

					break;
				case 3:
					numeroEnLetras = "tres";

					break;
				case 4:
					numeroEnLetras = "cuatro";

					break;
				case 5:
					numeroEnLetras = "cinco";

					break;
				case 6:
					numeroEnLetras = "seis";

					break;
				case 7:
					numeroEnLetras = "siete";

					break;
				case 8:
					numeroEnLetras = "ocho";

					break;
				case 9:

					numeroEnLetras = "nueve";
					break;
				case 10:

					numeroEnLetras = "diez";
					break;
				case 11:

					numeroEnLetras = "once";
					break;
				case 12:

					numeroEnLetras = "doce";
					break;
				case 13:

					numeroEnLetras = "trece";
					break;
				case 14:
					numeroEnLetras = "catorce";
					break;
				case 15:

					numeroEnLetras = "quince";
					break;
				}
			}
			// Números entre 16 y 19
			else if (numero < 20) {
				numeroEnLetras = "dieci";
				switch (numero - 10) {
				case 6:
					numeroEnLetras += "seis";
					break;
				case 7:
					numeroEnLetras += "siete";
					break;
				case 8:
					numeroEnLetras += "ocho";
					break;
				case 9:
					numeroEnLetras += "nueve";
					break;
				}
			}
			// Número 20
			else if (numero == 20) {
				numeroEnLetras = "veinte";
			}
			// Números entre 21 y 29
			else if (numero < 30) {
				numeroEnLetras = "veinti";
				switch (numero - 20) {
				case 1:
					numeroEnLetras += "uno";
					break;
				case 2:
					numeroEnLetras += "dos";
					break;
				case 3:
					numeroEnLetras += "tres";
					break;
				case 4:
					numeroEnLetras += "cuatro";
					break;
				case 5:
					numeroEnLetras += "cinco";
					break;
				case 6:
					numeroEnLetras += "seis";
					break;
				case 7:
					numeroEnLetras += "siete";
					break;
				case 8:
					numeroEnLetras += "ocho";
					break;
				case 9:
					numeroEnLetras += "nueve";
					break;
				}
			}
			// Números de 30 a 99
			else {
				int decenas = numero / 10;
				int unidades = numero % 10;

				// Determinar la decena
				switch (decenas) {
				case 3:
					numeroEnLetras = "treinta";
					break;
				case 4:
					numeroEnLetras = "cuarenta";
					break;
				case 5:
					numeroEnLetras = "cincuenta";
					break;
				case 6:
					numeroEnLetras = "sesenta";
					break;
				case 7:
					numeroEnLetras = "setenta";
					break;
				case 8:
					numeroEnLetras = "ochenta";
					break;
				case 9:
					numeroEnLetras = "noventa";
					break;
				}

				// Si hay unidades, agregar "y" + unidad
				if (unidades > 0) {
					numeroEnLetras += " y ";
					switch (unidades) {
					case 1:
						numeroEnLetras += "uno";
						break;
					case 2:
						numeroEnLetras += "dos";
						break;
					case 3:
						numeroEnLetras += "tres";
						break;
					case 4:
						numeroEnLetras += "cuatro";
						break;
					case 5:
						numeroEnLetras += "cinco";
						break;
					case 6:
						numeroEnLetras += "seis";
						break;
					case 7:
						numeroEnLetras += "siete";
						break;
					case 8:
						numeroEnLetras += "ocho";
						break;
					case 9:
						numeroEnLetras += "nueve";
						break;
					}
				}
			}

			// Mostramos el número en letras
			System.out.println("El número en letras es: " + numeroEnLetras);
		}

		sc.close();
	}

}
