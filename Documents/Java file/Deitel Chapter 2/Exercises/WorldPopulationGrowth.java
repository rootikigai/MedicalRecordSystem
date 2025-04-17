import java.util.Scanner;
public class WorldPopulationGrowth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter current world population: ");
		double worldPopulation = input.nextDouble();

		System.out.print("Enter the annual world population growth rate (in percentage): ");
		double annualGrowthRateInPercentage = input.nextDouble();
		
		double estimatedPopulationAfterOneYear = ((worldPopulation * annualGrowthRateInPercentage) / 100) + worldPopulation;
		double estimatedPopulationAfterTwoYears = ((estimatedPopulationAfterOneYear * annualGrowthRateInPercentage) / 100) + estimatedPopulationAfterOneYear;
		double estimatedPopulationAfterThreeYears = ((estimatedPopulationAfterTwoYears * annualGrowthRateInPercentage) / 100) + estimatedPopulationAfterTwoYears;
		double estimatedPopulationAfterFourYears = ((estimatedPopulationAfterThreeYears * annualGrowthRateInPercentage) / 100) + estimatedPopulationAfterThreeYears;
		double estimatedPopulationAfterFiveYears = ((estimatedPopulationAfterFourYears * annualGrowthRateInPercentage) / 100) + estimatedPopulationAfterFourYears;
		
		System.out.printf("%nEstimated world population after one year is: %.0f%n", estimatedPopulationAfterOneYear);
		System.out.printf("Estimated world population after two years is: %.0f%n", estimatedPopulationAfterTwoYears);
		System.out.printf("Estimated world population after three years is: %.0f%n", estimatedPopulationAfterThreeYears);
		System.out.printf("Estimated world population after four years is: %.0f%n", estimatedPopulationAfterFourYears);
		System.out.printf("Estimated world population after five years is: %.0f%n", estimatedPopulationAfterFiveYears);
	}
}