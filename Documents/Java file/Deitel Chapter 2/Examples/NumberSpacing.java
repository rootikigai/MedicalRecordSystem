import java.util.Scanner;
	public class NumberSpacing{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter the integer: ");
			int numbers = input.nextInt();			
			
			if (numbers >= 10000){
                    System.out.print("yes, here are the solution");
                      }

			if (numbers < 99999){
			System.out.println(" sorry inser 5 numbers");
			
			

			int num5 = numbers % 10;

			int numA = numbers / 10;

			int num4 = numA % 10;
			
			int numB = numA / 10;

			int num3 = numB % 10;

			int numC = numB / 10;

			int num2 = numC % 10;

			int numD = numC / 10;

			int num1 = numD;

			System.out.printf("%d   %d   %d   %d   %d%n", num1, num2, num3, num4, num5);
}
			
		}
	}
			

			
			
			