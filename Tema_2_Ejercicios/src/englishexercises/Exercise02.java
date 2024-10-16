package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		// Variable that will collect the numbers.
		int number;
		
		// Variable that will multiply the numbers.
		int multiplier;
		
		int contador = 1;

		// We create a new Scanner.
		Scanner sc = new Scanner(System.in);

		// We ask the user to enter numbers.
		System.out.println("Enter number and we will tell you the multiplication:");

		// We read from the keyboard.
		number = sc.nextInt();
		
		while (contador < 11) {
			
			System.out.println(contador + " x " + number  + " = " + (contador * number));
			
			contador ++;
			
		}
		
		

	}

}
