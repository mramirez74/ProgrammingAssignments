//OK. O.Aktunc

import java.util.Scanner;

public class PaperRockScissors {

	private static Scanner input;

	public static void main(String[] args) {

		int gameGenerator = (int) (Math.random() * 3);

		System.out.println("Play paper, rock, or scissors!");

		System.out.print("Paper (0), Rock (1), Scissors (2) : ");
		input = new Scanner(System.in);
		int decision = input.nextInt();

		switch (gameGenerator) {

		case 0:
			if (decision == 0 && gameGenerator == 0) {
				System.out.println("You tied: Paper doesn't beat paper");
				break;
			}
		case 1:
			if (decision == 0 && gameGenerator == 1) {
				System.out.println("You win: Paper beats rock");
				break;
			}
		case 2:
			if (decision == 0 && gameGenerator == 2) {
				System.out.println("You lose: Paper doesn't beat scissors");
				break;
			}
		case 3:
			if (decision == 1 && gameGenerator == 0) {
				System.out.println("You lose: Rock doesn't beat paper");
				break;
			}
		case 4:
			if (decision == 1 && gameGenerator == 1) {
				System.out.println("You tied: Rock doesn't beat rock");
				break;
			}
		case 5:
			if (decision == 1 && gameGenerator == 2) {
				System.out.println("You win: Rock beats scissors");
				break;
			}
		case 6:
			if (decision == 2 && gameGenerator == 0) {
				System.out.println("You win: Scissors beats paper");
				break;
			}
		case 7:
			if (decision == 2 && gameGenerator == 1) {
				System.out.println("You lose: Scissors doesn't beat rock");
				break;
			}
		case 8:
			if (decision == 2 && gameGenerator == 2) {
				System.out.println("You tied: Scissors doesn't beat scissors");
				break;
			}
		}
	}
}
