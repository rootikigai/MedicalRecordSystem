	
import java.util.Scanner;
public class LargestValueDisplay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int input1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int input2 = input.nextInt();

		int rem1 = input1 % 6;
		int rem2 = input2 % 6;

		if (input1 > input2) {
			System.out.printf("Largest number is: %d", input1);
		}
		else if (input2 > input1) {
			System.out.printf("Largest number is: %d", input2);
		}
		else if (input1 == input2) {
			System.out.print(0);
		}
		else if (rem1 == rem2) {
			if (input1 < input2) {
				System.out.printf("Smallest number is: %d", input1);
			}
			else if (input2 < input1) {
				System.out.printf("Smallest number is: %d", input2);
			}
		}
	}
}
			