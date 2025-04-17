
import java.util.Scanner;

public class CheckPositiveAndNegativeIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int input1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int input2 = input.nextInt();

		int product = input1 * input2;
		int sum = input1 + input2;

		if (input1 > 0 && input2 > 0) {
			System.out.printf("Output: %d", product);
		}
		else if (input1 < 0 && input2 < 0) {
			System.out.printf("Output: %d", product);
		}
		else {
			System.out.printf("Output: %d", sum);
		}
	}
}