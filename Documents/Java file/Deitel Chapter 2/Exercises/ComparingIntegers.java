import java.util.Scanner;
	public class ComparingIntegers{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the integer: ");
			int myNum = input.nextInt();

			int square1 = myNum * myNum;

			int num = 100;

			if(myNum > num){
			System.out.printf("The Number : %d > %d%n", myNum, num);
			}
		
			if(myNum < num){
			System.out.printf("The Number : %d < %d%n", myNum, num);
			}

			if(myNum == num){
			System.out.printf("The Number : %d == %d%n", myNum, num);
			}

			if(myNum != num){
			System.out.printf("The Number : %d != %d%n", myNum, num);
			}

			if(square1 > num){
			System.out.printf("The Square : %d > %d%n", square1, num);
			}

			if(square1 < num){
			System.out.printf("The Square : %d < %d%n", square1, num);
			}

			if(square1 == num){
			System.out.printf("The Square : %d == %d%n", square1, num);
			}

			if(square1 != num){
			System.out.printf("The Square : %d != %d%n", square1, num);
			}
		}
	}