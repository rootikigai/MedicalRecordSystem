public class Enrol {
	private String name;
	private int serialNo;
	private double accountBal;

	public Account(String name, int serialNo, double accountBal) {
		this.name = name;

		if (serialNo >= 10) {
		if (serialNo <= 99) {
		this.serialNo = serialNo;
		}
		}

		if (accountBal > 0.0) {
		this.accountBal = accountBal
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void serialDigits (int digitsAmt) {
		if (digitsAmt >= 10) {
		if (digitsAmt <= 99) {
			serialNo = serialNo;
		}
		}
	}

	public int getSerialNo() {
		return serialNo;
	} 

	public void deposit(double depositAmt) {
		if (depositAmt > 0.0) {
		accountBal = depositAmt + accountBal;
		} 
	}

	public double getaccountBal() {
		return accountBal;
	}
}