import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	Student firstStudent = new Student();
	
	System.out.println("Please enter the ID number:");
	int userID = input.nextInt();

	firstStudent.setNumber(userID);
	System.out.println("Student's ID number is: " + firstStudent.getNumber());
	}
}