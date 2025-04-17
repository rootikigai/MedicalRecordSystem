public class PetrolPurchase1 {
	private String location;
	private String type;
	private int quantity;
	private double price;
	private double discount;

	public PetrolPurchase1(String location, String type, int quantity, double price, double discount) {
	
		this.location = location;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getDiscount() {
		return discount;
	}
	
	public double getPurchaseAmount() {
		double netAmount = (quantity * price) - discount;
			return netAmount;
	}
}

	

		












