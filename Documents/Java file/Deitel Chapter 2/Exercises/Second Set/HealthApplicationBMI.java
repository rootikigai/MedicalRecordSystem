import java.util.Scanner;

public class HealthApplicationBMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();

		weight = weight * 0.45359237;
		height = height * 0.0254;
		
		double BMI = weight / (Math.pow(height, 2));

		System.out.printf("BMI is %.4f", BMI);
	}
}