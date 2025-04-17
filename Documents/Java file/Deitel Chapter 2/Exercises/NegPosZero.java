import java.util.Scanner;
	public class NegPosZero{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
		
			System.out.print("Enter first number: ");
			int firstNumber = input.nextInt();
			
			System.out.print("Enter second number: ");
			int secondNumber = input.nextInt();

			System.out.print("Enter third number: ");
			int thirdNumber = input.nextInt();
	
			System.out.print("Enter fourth number: ");
			int fourthNumber = input.nextInt();
	
			System.out.print("Enter fifth number: ");
			int fifthNumber = input.nextInt();

			int countPositive = 0;
			int countNegative = 0;
			int countZero = 0;

			if (firstNumber < 0){
			countNegative = countNegative + 1;
			}
			if (secondNumber < 0){
			countNegative = countNegative + 1;
			}
			if (thirdNumber < 0){
			countNegative = countNegative + 1;
			}
			if (fourthNumber < 0){
			countNegative = countNegative + 1;
			}
			if (fifthNumber < 0){
			countNegative = countNegative + 1;
			}

			if (firstNumber > 0){
			countPositive = countPositive + 1;
			}
			if (secondNumber > 0){
			countPositive = countPositive + 1;
			}
			if (thirdNumber > 0){
			countPositive = countPositive + 1;
			}
			if (fourthNumber > 0){
			countPositive = countPositive + 1;
			}
			if (fifthNumber > 0){
			countPositive = countPositive + 1;
			}

			if (firstNumber == 0){
			countZero = countZero + 1;
			}
			if (secondNumber == 0){
			countZero = countZero + 1;
			}
			if (thirdNumber == 0){
			countZero = countZero + 1;
			}
			if (fourthNumber == 0){
			countZero = countZero + 1;
			}
			if (fifthNumber == 0){
			countZero = countZero + 1;
			}

			System.out.printf("Number of negative inputs: %d%n", countNegative);
			System.out.printf("Number of positive inputs: %d%n", countPositive);
			System.out.printf("Number of zero inputs: %d%n", countZero);
		}
	}