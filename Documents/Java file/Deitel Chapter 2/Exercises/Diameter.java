import java.util.Scanner;
	public class Diameter{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the radius : ");
			int radius = input.nextInt();
			
			float pi = 3.14159f;		
			
			System.out.printf("Diameter is : %d%n", 2 * radius);
			System.out.printf("Circumference is : %.2f%n", 2 * pi * radius);
			System.out.printf("Area is : %.2f%n", pi * (radius * radius));
		}
	}