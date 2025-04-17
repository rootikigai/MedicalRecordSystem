import java.util.Scanner;
	public class JavaProgram{
		public static void main(String[] args){
			System.out.printf("%s%n%s%n", "This is a Java ", "program");

			int no1 = 1;
			int no2 = 2;
			int no3 = 3;
			int no4 = 4;

			System.out.println("1 2 3 4");

			System.out.print("1 ");
			System.out.print("2 ");
			System.out.print("3 ");
			System.out.print("4\n");

			System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);

			Scanner input = new Scanner(System.in);

			System.out.print("Enter integer: ");

			int number7 = input.nextInt();
			int mainNumb = 7;

			if(number7 != mainNumb){
			System.out.println("The variable is not equal to 7");
			}
		}
	}