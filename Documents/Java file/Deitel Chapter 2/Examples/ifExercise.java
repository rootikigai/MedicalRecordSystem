 
import java.util.Scanner;
	public class ifExercise {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Chemistry: ");
			int grade = input.nextInt();
			
	
if (grade >= 90) {
	System.out.println("A");
}
	else {
	if (grade >= 80) {
	System.out.println("B");
	}
		else { 
		if (grade >= 70) {
		System.out.println("C");
		}
			else {
			if (grade >= 60) {
			System.out.println("D");
			}
				else {
				System.out.println("Failed");
				}
					System.out.println(grade <= -1 ? "Rusticated" : "Carryover");
			}
		}
	}
		}
	}