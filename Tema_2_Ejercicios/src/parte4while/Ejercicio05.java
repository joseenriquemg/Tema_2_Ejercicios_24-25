package parte4while;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Creamos una variable para recoger los numero.
		int edades;

		// Variable para ir recogiendo la suma de los numeros.
		int sumaEdades = 0;
		
		// Variable para recoger la media de las edades.
		double media;
		
		// Variable para recoger el numero de Alumnos.
		double contadorAlumnos = 0;
		
		// Variable para los mayores de edad.
		int contadorAdultos = 0;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el numero al usuario.
		System.out.println("Vayan introduciendo sus edades:");

		// Leemos del teclado.
		edades = sc.nextInt();

		// Bucle while para pedir numeros al usuario.
		while (edades >= 0) {

			// Operaciones
			sumaEdades += edades;
			
			contadorAlumnos ++;
			
			if (edades > 17) {
				
				contadorAdultos ++;
				
			}

			// Solicitamos el resto de numeros al usuario.
			System.out.println("Introduzca un numero al que le iremos sumando el resto:");
			edades = sc.nextInt();
		}
		
		// Opreacion para calcular la media.
		media = sumaEdades / contadorAlumnos;

		System.out.println("Operacion finalizada. Devolviendo resultado...");

		System.out.println("La suma de las edadades resulta: " + sumaEdades);
		System.out.println("La media de sus edades es: " + media);
		System.out.println("Han ofrecido su edad un total de: " + contadorAlumnos + " alumnos.");
		System.out.println("Y de esos hay: " + contadorAdultos + " mayores de edad.");
		
		// Cerramos el Scanner.
		sc.close();

	}

}
