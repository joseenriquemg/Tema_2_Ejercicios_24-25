package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		// Variable that will collect the numbers.
		int height;

		// Variable for the tallest.
		int tallest = Integer.MIN_VALUE ;
		
		// Variable for the tallest.
		int smallest = Integer.MAX_VALUE;

		// We create a new Scanner.
		Scanner sc = new Scanner(System.in);

		// We ask the user to enter numbers.
		System.out.println("Enter heights and we will tell you the max and the min:");

		// We read from the keyboard.
		height = sc.nextInt();

		while (height != 0) {

			if (height > tallest) {

				tallest = height;

			}
			
			if (height < smallest) {
				
				
				smallest = height;
			}

			// We ask the user to enter numbers.
			System.out.println("Enter heights and we will tell you the max and the min:");

			height = sc.nextInt();

		}
		
		System.out.println("The tallest is: " + tallest);
		System.out.println("The smallest is: " + smallest);
		
		// We close the Scanner.
		sc.close();

	}

}
