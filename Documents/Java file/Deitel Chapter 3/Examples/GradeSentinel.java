import java.util.Scanner;

public class GradeSentinel {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int total = 0;
		int gradeCounter = 0;

		System.out.print("Enter the first grade or -1 to quit: ");
		int grade = input.nextInt();

		while (grade != -1) {
			total = total + grade;
			gradeCounter = gradeCounter + 1;
			
			System.out.print("Enter the next grade or -1 to quit: ");
			grade = input.nextInt();
		}

		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;

			System.out.printf("The total of the %d grades entered are %d", gradeCounter, total);		
			System.out.printf("%nThe average of the grades is %.2f", average);
		}
		else {
			System.out.print("%nNo grades were entered");
		}
	}
}