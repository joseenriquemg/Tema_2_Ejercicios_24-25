package parte3condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos una variable para recoger el DNI del usuario.
		long numDNI;
		
		// Creamos una variable para hacer la asignacion de letra.
		int eleccion;
		
		// Variable para recoger la operacion matematica.
		String letra;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner ( System.in);
		
		// Solicitamos al usuario el numero de su DNI.
		System.out.println("Introduzca los numeros de su DNI: ");
		
		// Leemos el numero del teclado.
		numDNI = sc.nextLong();
		
		// Calcularemos la operacion para asociar con la tabla.
		eleccion = (int) (numDNI % 23);
		
		// Creamos una cadena switch para cada distinta posibilidad de letra.
		switch (eleccion) {
		
		case 0 -> letra = "T";
		
		case 1 -> letra = "R";
		
		case 2 -> letra = "W";
		
		case 3 -> letra = "A";
		
		case 4 -> letra = "G";
		
		case 5 -> letra = "M";
		
		case 6 -> letra = "Y";
		
		case 7 -> letra = "F";
		
		case 8 -> letra = "P";
		
		case 9 -> letra = "D";
		
		case 10 -> letra = "X";
		
		case 11 -> letra = "B";
		
		case 12 -> letra = "N";
		
		case 13 -> letra = "J";
		
		case 14 -> letra = "Z";
		
		case 15 -> letra = "S";
		
		case 16 -> letra = "Q";
		
		case 17 -> letra = "V";
		
		case 18 -> letra = "H";
		
		case 19 -> letra = "L";
		
		case 20 -> letra = "C";
		
		case 21 -> letra = "K"; 
		
		case 22 -> letra = "E"; 
		
		default -> System.out.println("Su numero no es de un DNI.");
		
		}
		
		// Ofrecemos el resultado al usuario.
		System.out.println("Su DNI con su letra aplicada es: " + numDNI + eleccion );
		
		// Cerramos el nuevo Scanner.
		sc.close();

	}

}
