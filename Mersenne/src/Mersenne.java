//We'll go over this one again after Spring Break

import java.util.Scanner;

public class Mersenne {

	public static void main(String[] args) {

		System.out
				.println("Enter a number. The system will find the Mersenne numbers smaller than this number.");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		for (int i = 0; i < number; i++) {

			double mersenne = (Math.pow(2, i) - 1);
			int Mersenne = (int) mersenne;
			System.out.print(Mersenne + " ");
			Mersenne++;

		}

		System.out.print("\nThe number of Mersenne numbers are " + number);
	}

}
