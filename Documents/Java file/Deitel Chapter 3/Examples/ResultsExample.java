import java.util.Scanner;

public class ResultsExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int countPassed = 0;
		int countFailed = 0;
		int sumCounter = 1;

		while (sumCounter <= 10) {			

			System.out.print("\nEnter a result (1 for passed or 2 for failed): ");
			int result = input.nextInt();

			if (result == 1) {
				countPassed = countPassed + 1;
			}
			else if (result == 2) {
				countFailed = countFailed + 1;
			}

			sumCounter = sumCounter + 1;
		}

		System.out.printf("Out of 10 students, %d passed and %d failed", countPassed, countFailed);

		if (countPassed > 8) {
			System.out.println("\nBonus to instructor!");
		}
		else {
			System.out.println("\nNo bonus! Instructor could do better");
		}
	}
}
		
		