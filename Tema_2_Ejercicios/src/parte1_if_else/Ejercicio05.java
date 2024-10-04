package parte1_if_else;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Variable que recoja el primer numero de usuario.
		int num1;

		// Variable que recoja el segundo numero de usuario.
		int num2;
		
		// Variable que recoja el tercer numero de usuario.
		int num3;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos el primer numero al usuario.
		System.out.println("Introduzca su primer numero:");

		// Leemos del teclado.
		num1 = sc.nextInt();

		// Solicitamos el segundo numero al usuario.
		System.out.println("Introduzca su segundo numero:");

		// Leemos del teclado.
		num2 = sc.nextInt();
		
		// Solicitamos el tercer numero al usuario.
		System.out.println("Introduzca su tercer numero:");
		
		// Leemos del teclado.
		num3 = sc.nextInt();

		// Creamos las condiciones correspondientes.
		if (num1 >= num2 && num2 >= num3) {
			System.out.println("Sus numeros ordenados quedan asi: " + num1 + ", " + num2 + " y " + num3);
			
		} else if (num3 >= num2 && num2 >= num1){
			System.out.println("Sus numeros ordenados quedan asi: " + num3 + ", " + num2 + " y " + num1);
			
		} else if (num3 >= num1 && num1 >= num2){
			System.out.println("Sus numeros ordenados quedan asi: " + num3 + ", " + num1 + " y " + num2);
			
		} else if (num2 >= num1 && num1 >= num3){
			System.out.println("Sus numeros ordenados quedan asi: " + num2 + ", " + num1 + " y " + num3);
			
		} else if (num2 >= num3 && num3 >= num1){
			System.out.println("Sus numeros ordenados quedan asi: " + num2 + ", " + num3 + " y " + num1);
			
		} else{
			System.out.println("Sus numeros ordenados quedan asi: " + num1 + ", " + num3 + " y " + num2);
		}

		// Cerramos el Scanner.
		sc.close();

	}

}
