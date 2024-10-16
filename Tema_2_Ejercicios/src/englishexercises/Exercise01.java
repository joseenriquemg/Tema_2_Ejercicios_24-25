package englishexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// Variable that will collect the numbers.
		int number;
		
		// We create a new Scanner.
		Scanner sc = new Scanner (System.in);
		
		// We ask the user to enter numbers.
		System.out.println("Enter numbers and we will tell you if it is even or odd (-1 for go out):");
		
		// We read from the keyboard.
		number = sc.nextInt();
		
		while (number >= 0) {
			
			if (number % 2 == 0) {
				
				System.out.println("Even");
				
			} else {
				
				System.out.println("Odd");
				
			}
			
			// We ask the user to enter numbers.
			System.out.println("Enter numbers and we will tell you if it is even or odd (-1 for go out):");
			
			// Leemos del teclado.
			number = sc.nextInt();
			
		}
		
		System.out.println("Leaving the program...");
		
		// We close the Scanner.
		sc.close();
				

	}

}
