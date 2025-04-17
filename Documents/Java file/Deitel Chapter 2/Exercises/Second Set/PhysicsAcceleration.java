import java.util.Scanner;

public class PhysicsAcceleration {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter v0, v1, and t: " );	
	float v0 = input.nextFloat(), v1 = input.nextFloat(), t = input.nextFloat();

	float averageAcceleration = (v1 - v0) / t;

	System.out.printf("%nThe average acceleration is %.4f", averageAcceleration);
	}
}