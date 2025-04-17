public class Petrol1 {
	public static void main(String[] args) {

		Petrol1 diesel = new Petrol1("Sabo", "Diesel", 10, 1900.00, 50);

		System.out.printf("Location: %s %nType: %s %nQuantity: %d liters %nPrice: %.2f naira %nDiscount: %.2f", diesel.getLocation(), diesel.getType(), diesel.getQuantity(), diesel.getPrice(), diesel.getDiscount());



		System.out.printf("The Net Purchase Amount is: %.2f", diesel.getPurchaseAmount());
	}
}
		

		




	
		