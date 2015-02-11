import javax.swing.JOptionPane;

public class BMI {

	public static void main(String[] args) {
		String weight = JOptionPane.showInputDialog("Enter your weight in pounds: ");
		
		String height = JOptionPane.showInputDialog("Enter your height in inces: ");
		
		double weightNumber = Double.parseDouble(weight);
		
		double firstConversion = weightNumber * 0.45359237;
		
		double heightNumber = Double.parseDouble(height);
		
		double secondConversion = heightNumber * 0.0254;
		
		double BMI = firstConversion / (secondConversion * secondConversion);
		
		JOptionPane.showMessageDialog( null, "Your Body Mass Index is: " +BMI );
	}

}
