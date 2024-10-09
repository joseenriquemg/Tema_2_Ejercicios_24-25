package parte2switch;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos una variable para la elecion del usuario,
		String eleccion = "";

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos la eleccion al usuario.
		System.out.println("Elija un tipo de carnet entre estas opciones:");
		System.out.println("E, D, C1-C5, A, B1-B2");
		
		// Leemos del teclado.
		eleccion = sc.next();
		
		switch (eleccion) {
		
		case "E" -> System.out.println("E: Remolques.");
		
		case "D" -> System.out.println("D: Autobuses.");
		
		case "C1-C5" -> System.out.println("C1-C5: Camiones.");
		
		case "A" -> System.out.println("A: Motocicletas.");
		
		case "B1-B2" -> System.out.println("B1-B2: Automoviles.");
		
		default -> System.out.println("Categoría no contemplada");
		
 		}

		// Cerramos el Scanner.
		sc.close();

	}

}
