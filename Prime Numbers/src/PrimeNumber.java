//OK. O.Aktunc

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int prime = 0;
		System.out
				.println("Enter a number. The system will find the prime numbers smaller than this number.");

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		System.out.println("These are the prime numbers smaller than " + number
				+ ":\n");

		if (number <= 1) {
			System.out.println("There are no prime numbers less than 1!");
		}

		for (int i = 2; i < number; i++) {

			for (int j = 2; j <= i; j++) {

				if (j == i) {
					System.out.print(i + " ");
					prime++;
				}
				if (i % j == 0) {
					break;
				}

			}
		}

		System.out.println("\nThere are a total of " + prime
				+ " prime numbers.");
	}

}
