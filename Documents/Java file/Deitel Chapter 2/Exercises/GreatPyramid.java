
import java.util.Scanner;
	public class GreatPyramid {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);		

			System.out.print("Enter the estimated number of stones used: ");
			double numberOfStones = input.nextDouble();

			System.out.print("Enter the average weight of each stone used in: ");
			double weightOfStones = input.nextDouble();

			System.out.print("Enter the number of years taken to build the pyramid: ");
			double numberOfYears = input.nextDouble();

			System.out.println("\nHow much of the pyramid was built, by weight:");
			System.out.printf("Per year: %.1f tons%n", (numberOfStones * weightOfStones) / numberOfYears);
			System.out.printf("Per hour: %.1f tons%n", (((numberOfStones * weightOfStones) / numberOfYears) / 365) / 24);
			System.out.printf("Per minute: %.1f tons%n", ((((numberOfStones * weightOfStones) / numberOfYears) / 365) / 24) / 60);
		}
	}	


