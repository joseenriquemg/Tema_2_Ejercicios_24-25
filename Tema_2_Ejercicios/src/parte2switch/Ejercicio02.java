package parte2switch;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Creamos una variable para recoger el dia de la semana.
		int dia;
				
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
				
		// Solicitamos el dia al usuario.
		System.out.println("Introduzca un dia de la semana (1 - 7):");
				
		// Leemos la nota del teclado.
		dia = sc.nextInt();
				
		switch (dia) {
				
		case 1 -> System.out.println("Lunes.");
				
		case 2 -> System.out.println("Martes.");
				
		case 3 -> System.out.println("Miercoles.");
				
		case 4 -> System.out.println("Jueves.");	
				
		case 5 -> System.out.println("Viernes.");
		
		case 6 -> System.out.println("Sabado.");
		
		case 7 -> System.out.println("Domingo.");
				
		default -> System.out.println("Su dia no esta entre los rangos establecidos.");
		}
		// Cerramos el Scanner.
		sc.close();

		

	}

}
