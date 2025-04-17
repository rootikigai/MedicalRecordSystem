public class CarApplication {
	public static void main(String[] args) {
	
	Car car1 = new Car("BMW i4", "2025", 53975.00);
	Car car2 = new Car("BMW i3", "2026", 50000.00);

	System.out.printf("First Car %nModel: %s %nYear: %s %nPrice: $%.2f %n%n", 
	car1.getModel(), car1.getYear(), car1.getPrice());
	System.out.printf("Second Car %nModel: %s %nYear: %s %nPrice: $%.2f%n%n", 
	car2.getModel(), car2.getYear(), car2.getPrice());

	car1.setPrice(car1.getPrice() * 0.95);
	car2.setPrice(car1.getPrice() * 0.93);

	System.out.printf("First Car %nModel: %s %nYear: %s %nDiscounted Price: $%.2f %n%n", 
	car1.getModel(), car1.getYear(), car1.getPrice());
	System.out.printf("Second Car %nModel: %s %nYear: %s %nDiscounted Price: $%.2f", 
	car2.getModel(), car2.getYear(), car2.getPrice());
	}
}


	

	

	
	