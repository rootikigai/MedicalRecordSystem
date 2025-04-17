import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int total = 0;
		int gradeCounter = 1;

		while (gradeCounter <= 10) {
			System.out.print("Enter a grade: ");
			int grade = scanner.nextInt();
			total = total + grade;
			gradeCounter = gradeCounter + 1;
		}
	
		int average = total / (gradeCounter - 1);
		System.out.println("The total grades are " + total);
		System.out.println("\nThe average grade is " + average);
	}
}