import java.util.Scanner;

public class ThreeIntegersCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();
		System.out.print("Enter third integer: ");
		int num3 = input.nextInt();

		if (num2 > num1 && num3 > num2) {
			System.out.print("The result is: true");
		}
		else {
			System.out.print("The result is: false");
		}
	}
}