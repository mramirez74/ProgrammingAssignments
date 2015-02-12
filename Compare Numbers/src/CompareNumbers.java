import java.util.Scanner;

public class CompareNumbers {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int num1 = input.nextInt();

		System.out.print("Enter the second integer: ");
		int num2 = input.nextInt();

		System.out.print("Enter the third integer: ");
		int num3 = input.nextInt();

		int largest;
		int smallest = num1;

		System.out.println("For the numbers " + num1 + ", " + num2 + " and "
				+ num3);
		if (num1 > num2) {
			largest = num1;
			System.out.println("Largest is " + largest);
		} else if (num2 > num3) {
			largest = num2;
			System.out.println("Largest is " + largest);
		} else {
			largest = num3;
			System.out.println("Largest is " + largest);
		}
			
		if(num1 < num2 && num1 < num3){
			smallest = num1;
			System.out.println("Smallest is " + smallest);
		}
		else if(num2 < num3 && num2 < num1){
			smallest = num2;
			System.out.println("Smallest is " + smallest);
		}
		else{
			System.out.println("Smallest is " + num3);
		}
		
		int sum = num1 + num2 + num3;
		System.out.println("Sum is " +sum);
		
		int product = num1 * num2 * num3;
		System.out.println("Product is " +product);
		
		double average = sum / 3;
		System.out.println("Average is " +average);
	}
}
