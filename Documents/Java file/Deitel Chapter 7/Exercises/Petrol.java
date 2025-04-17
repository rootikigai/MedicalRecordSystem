public class Petrol {
	public static void main(String[] args) {
		PetrolPurchase petrol1 = new PetrolPurchase("Lagos", "Diesel", 50, 1819.76, 10);

		System.out.printf("Location: %s %nPetrol Type: %s %nQuantity: %d %nPrice per liter: %.2fnaira %nPercentage discount: %.2f%%%n", petrol1.getLocation(), petrol1.getPetrolType(), petrol1.getQuantity(), petrol1.getPricePerLiter(), petrol1.getDiscount());

		System.out.printf("The net purchase amount you had to pay was %.2f", petrol1.getPurchaseAmount());
	}
}

	