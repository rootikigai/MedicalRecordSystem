import java.util.Scanner;
	public class AdditionOfThree{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter first integer: ");
			int number1 = input.nextInt();

			System.out.print("Enter second integer: ");
			int number2 = input.nextInt();

			System.out.print("Enter third integer: ");
			int number3 = input.nextInt();

			int sum = number1 + number2 + number3;
			System.out.printf("Sum is %d%n ", + sum);
			System.out.print("Sum is ");
			System.out.println(sum);
		}
	}