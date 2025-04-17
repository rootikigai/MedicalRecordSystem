import java.util.Scanner;
	public class ArithmeticExercise{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter first integer: ");
			int no1 = input.nextInt();

			System.out.print("Enter second integer: ");
			int no2 = input.nextInt();

			int no1Sqr = no1 * no1;
			System.out.printf("Square of %d is %d%n", no1, no1Sqr);
			
			int no2Sqr = no2 * no2;
			System.out.printf("Square of %d is %d%n", no2, no2Sqr);

			int sum = no1Sqr + no2Sqr;
			System.out.printf("Sum of squares is: %d%n", sum);

			int difference = no1Sqr - no2Sqr;
			System.out.printf("Difference of squares is: %d%n", difference);
		}
	}
			
