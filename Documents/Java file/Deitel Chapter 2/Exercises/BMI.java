import java.util.Scanner;
	public class BMI {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Please input your weight (in Kilograms): ");
			double weight = input.nextDouble();

			System.out.print("Please input your height (in Meters): ");
			double height = input.nextDouble();

			double bmi = weight / (height * height);

			System.out.printf("Your Body Mass Index is: %.1f%n", bmi);


			System.out.println("BMI Categories: ");	
			System.out.println("Underweight = <18.5");	
			System.out.println("Normal weight = 18.5-24.9");	
			System.out.println("Overweight = 25-29.9");	
			System.out.println("Obesity = BMI of 30 greater");	
		}	
	}
			
			