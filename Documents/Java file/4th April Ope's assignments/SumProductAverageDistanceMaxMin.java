import java.util.Scanner;
public class SumProductAverageDistanceMaxMin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int input1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int input2 = input.nextInt();

		int sum = input1 + input2;
		int product = input1 * input2;
		double average = (double)sum / 2;
		int distance = input1 - input2;
		
		if (distance < 0) {
			distance = -distance;
		}
		System.out.printf("Sum: %d%n", sum);
		System.out.printf("Product: %d%n", product);
		System.out.printf("Average: %.2f%n", average);
		System.out.printf("Distance: %d%n", distance);

		if (input1 > input2) {
			int max = input1;
			int min = input2;
		System.out.printf("Max: %d%n", max);
		System.out.printf("Min: %d", min);
		}
		else if (input2 > input1) {
			int max = input2;
			int min = input1;
		System.out.printf("Max: %d%n", max);
		System.out.printf("Min: %d", min);
		}
	}
}