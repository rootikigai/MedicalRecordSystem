import java.util.Scanner;
	public class LargestSmallest {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
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

		int largest, smallest;

		if (num1 >= num2){
		if (num1 >= num3){
		if (num1 >= num4){
		if (num1 >= num5){
		System.out.printf("Largest number is : %d%n", num1);
		}
		}
		}
		}

		if (num2 >= num1){
		if (num2 >= num3){
		if (num2 >= num4){
		if (num2 >= num5){
		System.out.printf("Largest number is : %d%n", num2);
		}
		}
		}
		}

		if (num3 >= num1){
		if (num3 >= num2){
		if (num3 >= num4){
		if (num3 >= num5){
		System.out.printf("Largest number is : %d%n", num3);
		}
		}
		}
		}

		if (num4 >= num1){
		if (num4 >= num2){
		if (num4 >= num3){
		if (num4 >= num5){
		System.out.printf("Largest number is : %d%n", num4);
		}
		}
		}
		}

		if (num5 >= num1){
		if (num5 >= num2){
		if (num5 >= num3){
		if (num5 >= num4){
		System.out.printf("Largest number is : %d%n", num5);
		}
		}
		}
		}


		if (num1 <= num2){
		if (num1 <= num3){
		if (num1 <= num4){
		if (num1 <= num5){
		System.out.printf("Smallest number is : %d%n", num1);
		}
		}
		}
		}

		if (num2 <= num1){
		if (num2 <= num3){
		if (num2 <= num4){
		if (num2 <= num5){
		System.out.printf("Smallest number is : %d%n", num2);
		}
		}
		}
		}

		if (num3 <= num1){
		if (num3 <= num2){
		if (num3 <= num4){
		if (num3 <= num5){
		System.out.printf("Smallest number is : %d%n", num3);
		}
		}
		}
		}

		if (num4 <= num1){
		if (num4 <= num2){
		if (num4 <= num3){
		if (num4 <= num5){
		System.out.printf("Smallest number is : %d%n", num4);
		}
		}
		}
		}

		if (num5 <= num1){
		if (num5 <= num2){
		if (num5 <= num3){
		if (num5 <= num4){
		System.out.printf("Smallest number is : %d%n", num5);
		}
		}
		}
		}
		}
	}
		