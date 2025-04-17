import java.util.Scanner;

public class GeometryAreaOfTriangle {
	public static void main(String[] arggs) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for a triangle: ");
		double x1 = input.nextDouble(),  y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble(), x3 = input.nextDouble(), y3 = input.nextDouble();

		double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		double side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));

		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s*(s - side1) * (s - side2) * (s - side3));

		System.out.printf("The area of the triangle is %.1f", area);
	}
}	



