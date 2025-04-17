import java.util.Scanner;

public class CO {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an age: ");
	
		int num = scanner.nextInt();

		System.out.println(num <= 18 && num > 12 ? "Teenager" : "Not a teenager");
		
		if (num <= 18) {
		if (num > 12) {
		System.out.print("Teenager");
		}
		}
		else {
		System.out.print("Not a teenager");
		}
	}
}