
import java.util.Scanner;
public class TwoIntegersDifferenceDisplay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int input1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int input2 = input.nextInt();

		if (input1 > input2) {
			System.out.printf("The difference is: %d", input1 - input2);
		}
	}
}
			