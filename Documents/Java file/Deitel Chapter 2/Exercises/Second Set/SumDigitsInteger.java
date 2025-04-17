import java.util.Scanner;

public class SumDigitsInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();

		int firstNumber = number / 100;
		int secondNumber = (number % 100) / 10;
		int thirdNumber = number % 10;

		int sum = firstNumber + secondNumber + thirdNumber;
		
		if (number < 0) {
		System.out.print("Invalid! Enter a number between 0 and 1000");
		}

		if (number > 1000) {
		System.out.print("Invalid! Enter a number between 0 and 1000");
		}

		if (number > 0) {
		if (number < 1000) {
		System.out.printf("The sum of the digits is %d", sum);
		}
		}
	}
}
		
		