package parte7bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Variable para recoger el primer numero.
		int numero1;
		
		// Variable para recoger el segundo numero.
		int numero2;
		
		// Variable para coger el menor de lso dos.
		int menor = 0;
		
		// Variable booleana para detectar el MCD.
		boolean hayMcd = false;
		
		//Variable para recoger el mcd.
		int mcd = 0;
		
		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner (System.in);
		
		// Solicitamos al usaurio el primer numero.
		System.out.println("Introduzca el primer numero:");
		
		// Leemos del teclado.
		numero1 = sc.nextInt();
		
		// Solicitamos al usaurio el segundo numero.
		System.out.println("Introduzca el segundo numero:");
		
		// Leemos del teclado.
		numero2 = sc.nextInt();
		
	
		
		if (numero1 > numero2) {
			
			menor = numero2;
			
		} else if (numero2 >= numero1) {
			
			menor = numero1;
			
		}
		
		for (int i = menor; !hayMcd ; i--) {
			
			if (numero1 % i == 0 && numero2 % i == 0) {
				
				hayMcd = true;
				
				mcd = i;
				
			}
			
		}
		
		System.out.println("El MCD de sus numeros es : " + mcd);
		
		// Cerramos el Scanner.
		sc.close();

	}

}
