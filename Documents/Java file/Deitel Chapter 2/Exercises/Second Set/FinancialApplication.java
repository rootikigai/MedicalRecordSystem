import java.util.Scanner;

public class FinancialApplication {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double interestRate = input.nextDouble();

		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();

		interestRate = interestRate / 1200;

		double futureInvestmentValue = investmentAmount * Math.pow((1 + interestRate), numberOfYears * 12);
	
		System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
	}
}