import java.util.Scanner;

public class SumEvenAndOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter ten integers: ");
		int first = input.nextInt(), second = input.nextInt(), third = input.nextInt(), 
		fourth = input.nextInt(), fifth = input.nextInt(), sixth = input.nextInt(), 
		seventh = input.nextInt(), eight = input.nextInt(), ninth = input.nextInt(),
 		tenth = input.nextInt();

		int evenNumbers = 0; 
		int oddNumbers = 0;

		if (first % 2 == 0) {
			evenNumbers = evenNumbers + first;
		}
		if (first % 2 != 0) {
			oddNumbers = oddNumbers + first;
		} 
		
		if (second % 2 == 0) {
			evenNumbers = evenNumbers + second;
		}
		if (second % 2 != 0) {
			oddNumbers = oddNumbers + second;
		} 

		if (third % 2 == 0) {
			evenNumbers = evenNumbers + third;
		}
		if (third % 2 != 0) {
			oddNumbers = oddNumbers + third; 
		}

		if (fourth % 2 == 0) {
			evenNumbers = evenNumbers + fourth;
		}
		if (fourth % 2 != 0) {
			oddNumbers = oddNumbers + fourth;
		}

		if (fifth % 2 == 0) {
			evenNumbers = evenNumbers + fifth;
		}
		if (fifth % 2 != 0) {
			oddNumbers = oddNumbers + fifth;
		} 

		if (sixth % 2 == 0) {
			evenNumbers = evenNumbers + sixth;
		}
		if (sixth % 2 != 0) {
			oddNumbers = oddNumbers + sixth;
		} 

		if (seventh % 2 == 0) {
			evenNumbers = evenNumbers + seventh;
		}
		if (seventh % 2 != 0) {
			oddNumbers = oddNumbers + seventh;
		} 

		if (eight % 2 == 0) {
			evenNumbers = evenNumbers + eight;
		}
		if (eight % 2 != 0) {
			oddNumbers = oddNumbers + eight;
		} 

		if (ninth % 2 == 0) {
			evenNumbers = evenNumbers + ninth;
		}
		if (ninth % 2 != 0) {
			oddNumbers = oddNumbers + ninth;
		} 

		if (tenth % 2 == 0) {
			evenNumbers = evenNumbers + tenth;
		}
		if (tenth % 2 != 0) {
			oddNumbers = oddNumbers + tenth;
		} 

		System.out.printf("%nSum of the even numbers is: %d", evenNumbers);
		System.out.printf("%nSum of the odd numbers is: %d", oddNumbers);
	}
}
		