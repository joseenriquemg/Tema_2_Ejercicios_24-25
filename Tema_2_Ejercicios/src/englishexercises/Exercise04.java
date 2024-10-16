package englishexercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		int number;

		Random rand = new Random();

		final int RANDOM_NUMBER = rand.nextInt();

		// We create a new Scanner.
		Scanner sc = new Scanner(System.in);

		// We ask the user to enter numbers.
		System.out.println("Search the secret number:");

		// We read from the keyboard.
		number = sc.nextInt();

		while (number != RANDOM_NUMBER) {

			if (RANDOM_NUMBER > number) {

				System.out.println("This number is less than the number to guess.");

			}

			if (RANDOM_NUMBER < number) {

				System.out.println("This number is greatest than the number to guess.");

			}

			// We ask the user to enter numbers.
			System.out.println("Try again! Search the secret number:");

			// We read from the keyboard.
			number = sc.nextInt();

		}

		System.out.println("Congratulations! You Win.");

	}

}
