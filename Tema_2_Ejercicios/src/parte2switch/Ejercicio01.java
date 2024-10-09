package parte2switch;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Creamos una variable para recoger la nota del usuario.
		int nota;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos su nota al usuario.
		System.out.println("Introduzca su nota (1 - 10):");
		
		// Leemos la nota del teclado.
		nota = sc.nextInt();
		
		switch (nota) {
		
		case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente.");
		
		case 5 -> System.out.println("Suficiente.");
		
		case 6 -> System.out.println("Bien.");
		
		case 7, 8 -> System.out.println("Notable.");	
		
		case 9, 10 -> System.out.println("Sobresaliente.");
		
		default -> System.out.println("Su nota no esta entre los rangos establecidos.");
		}
		// Cerramos el Scanner.
		sc.close();

	}

}
