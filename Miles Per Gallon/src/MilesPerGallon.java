import java.util.Scanner;

public class MilesPerGallon {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print( "Enter the miles driven: ");
		double miles = input.nextInt();
		
		System.out.print( "Enter the gallons of fuel used: ");
		double gallons = input.nextInt();
		
		double MPG = miles / gallons;
		
		System.out.print("The miles-per-gallon is: " +MPG);
		
	}

}
