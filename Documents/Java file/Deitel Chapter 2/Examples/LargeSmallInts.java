import java.util.Scanner;
	public class LargestAndSmallest {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			int num1, num2, num3, num4, num5;
			int largest, smallest;

			System.out.print("Enter first integer : ");
			int num1 = input.nextInt();
			
			System.out.print("Enter second integer : ");
			int num2 = input.nextInt();

			System.out.print("Enter third integer : ");
			int num3 = input.nextInt();

			System.out.print("Enter fourth integer : ");
			int num4 = input.nextInt();

			System.out.print("Enter fifth integer : ");
			int num5 = input.nextInt();

			largest = num1;
			smallest = num1;

			if (num2 > largest) {
			num2 = largest;
			}

			if (num3 > largest) {
			num3 = largest;
			}

			if (num4 > largest) {
			num4 = largest;
			}

			if (num5 > largest) {
			num5 = largest;
			}	

			if (num2 < smallest) {
			num2 = smallest;
			}

			if (num3 < smallest) {
			num3 = smallest;
			}

			if (num4 < smallest) {
			num4 = smallest;
			}

			if (num5 < smallest) {
			num5 = smallest;
			}

			System.out.printf("Largest number is : %d%n", largest);
			
			System.out.printf("Smallest number is : %d%n", smallest);
			
		}
	}