
import java.util.Scanner;
public class TwoIntegersProductDisplay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int input1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int input2 = input.nextInt();
	
		System.out.printf("The product is: %d", input1 * input2);
	}
}
			