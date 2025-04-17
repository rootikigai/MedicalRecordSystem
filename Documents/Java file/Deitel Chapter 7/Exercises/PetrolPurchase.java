public class PetrolPurchase {
	private String location;
	private String petrolType;
	private int quantity;
	private double pricePerLiter;
	private double discount;
	
	public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLiter, double discount) {
		this.location = location;
		this.petrolType = petrolType;
		this.quantity = quantity;
		this.pricePerLiter = pricePerLiter;
		this.discount = discount;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setPetrolType(String petrolType) {
		this.petrolType = petrolType;
	}

	public String getPetrolType() {
		return petrolType;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPricePerLiter(double pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}

	public double getPricePerLiter() {
		return pricePerLiter;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}
	
	public double getPurchaseAmount() {
		double netPurchaseAmount = (quantity * pricePerLiter) - (discount / 100);
		return netPurchaseAmount;
	}
}


	