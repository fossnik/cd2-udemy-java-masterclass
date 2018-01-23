public class Account {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;

	public Account() {
		this("56789", 2.50, "Default name", "default address", "default phone");
		System.out.println("Empty constructor called");
	}

	public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.accountNumber = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.printf("Deposit of %s made.\nNew balance is %s\n\n", depositAmount, balance);
	}

	public void withdrawal(double withdrawalAmount) {
		if (balance - withdrawalAmount < 0) {
			System.out.printf("Only %s available.\nWithdrawal not processed.\n\n", balance);
		} else {
			balance -= withdrawalAmount;
			System.out.printf("Withdrawal of %s processed.\nRemaining balance = %s\n\n", withdrawalAmount, balance);
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
}
