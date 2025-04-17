
import java.util.Scanner;
	public class ArithmeticSL{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter first integer: ");
			int num1 = input.nextInt();	

			System.out.print("Enter second integer: ");
			int num2 = input.nextInt();

			System.out.print("Enter third integer: ");
			int num3 = input.nextInt();			
			
			int sum = num1 + num2 + num3;
			int average = (num1 + num2 + num3)/3;
			int product = num1 * num2 * num3;

			System.out.printf("Sum is : %d%n", sum);
			System.out.printf("Average is : %d%n", average);
			System.out.printf("Product is : %d%n", product);
		

			if (num1 < num2 && num1 < num3){
			System.out.printf("Smallest number is : %d%n", num1);
			}

			if (num2 < num1 && num2 < num3){
			System.out.printf("Smallest number is : %d%n", num2);
			}

			if (num3 < num1 && num3 < num2){
			System.out.printf("Smallest number is : %d%n", num3);
			}

			if (num1 > num2 && num1 < num3){
			System.out.printf("Largest number is : %d%n", num1);
			}

			if (num2 > num1 && num2 < num3){
			System.out.printf("Largest number is : %d%n", num2);
			}

			if (num3 > num1 && num3 > num2){
			System.out.printf("Largest number is : %d%n", num3);
			}
		}
	}