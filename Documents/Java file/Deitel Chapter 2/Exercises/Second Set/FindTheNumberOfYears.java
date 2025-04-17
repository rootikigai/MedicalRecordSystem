import java.util.Scanner;

public class FindTheNumberOfYears {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of minutes: ");
	Long numberOfMinutes = input.nextLong();

	Long numberOfYears = numberOfMinutes / (60 * 24 * 365);
	Long extraDays = (numberOfMinutes % (60 * 24 * 365)) / (60 * 24);

	System.out.printf("%n%d minutes is approximately %d years and %d days", numberOfMinutes, numberOfYears, extraDays);
	}
}