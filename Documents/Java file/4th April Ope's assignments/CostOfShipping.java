/*import Scanner
Declare CostOfShipping class
Declare main method
Create scanner object

prompt the user to enter the weight in pounds
initialize in double 'weight'

if the weight is less than 0
   print the 'package cannot be shipped'
else if the weight is greater than 0 and less than or equal to 1
   print 3.5 as the cost
else if the weight is greater than 1 and less than or equal to 3
   print 5.5 is the cost
else if the weight is greater than 3 and less than or equal to 10
   the print 8.5 as the cost
else if the weight is greater than 10 and less than or equal to 20
   the print 10.5 as the cost
else if weight is greater than 20
   print "the package cannot be shipped"*/


import java.util.Scanner;
public class CostOfShipping {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the package weight (in pounds): ");
		double weight = input.nextDouble();
		if (weight <= 0) {
			System.out.print("Weight should be greater than 0");
		}
		if (weight > 0 && weight <= 1) {
			System.out.print("Shipping cost: $3.5");
		}
		else if (weight > 1 && weight <= 3) {
			System.out.print("Shipping cost: $5.5");
		}
		else if (weight > 3 && weight <= 10) {
			System.out.print("Shipping cost: $8.5");
		}
		else if (weight > 10 && weight <= 20) {
			System.out.print("Shipping cost: $10.5");
		}
		else if (weight > 20) {
			System.out.print("the package cannot be shipped");
		}
	}
}