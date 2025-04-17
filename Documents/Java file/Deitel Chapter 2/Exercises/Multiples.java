import java.util.Scanner;
	public class Multiples{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter first integer : ");
			int num1 = input.nextInt();
			
			System.out.print("Enter second integer : ");
			int num2 = input.nextInt();
			
			int trpl = num1 * 3;
			int dbl = num2 * 2;
			int result = trpl / dbl;

			if (trpl % dbl == 0){
			System.out.printf("%d (times three) is a multiple of %d (times two)%n", num1, num2);
			System.out.printf("Result is : %d%n", result);
			}			

			if (trpl % dbl != 0){	
			System.out.printf("Not a multiple");
			}	
		}
	}