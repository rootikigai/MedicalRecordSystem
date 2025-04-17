import java.util.Scanner;

public class PhysicsFindingRunwayLength {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter speed (in meters per second) and acceleration (in meters per second square): ");
		
		double speed = input.nextDouble(), acceleration = input.nextDouble();
		double length = (speed * speed) / (2 * acceleration);

		System.out.printf("The minimum runway length for this airplane is %.3f", length);
	}
}
	