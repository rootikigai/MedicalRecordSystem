import java.util.Scanner;
public class ClockTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
			Clock time1 = new Clock(0, 0, 0);
	
			System.out.print("Enter the hour, minute, and second: ");
			int hour = input.nextInt();
			time1.setHour(hour);
			int minute = input.nextInt();
			time1.setMinute(minute);
			int second = input.nextInt();
			time1.setSecond(second);


			time1.displayTime();			
	}
}