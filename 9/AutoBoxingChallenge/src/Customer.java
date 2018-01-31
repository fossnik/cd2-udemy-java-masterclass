import java.util.ArrayList;

// Customer:
// Name, and the ArrayList of doubles.

public class Customer {
	private String customerName;
	private ArrayList<Double> transactions = new ArrayList<>();

	public Customer(String customerName, double initialBalance) {
		this.customerName = customerName;
		this.transactions.add(Double.valueOf(initialBalance));
	}

	public String getCustomerName() {
		return customerName;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public boolean newTransaction(double transactionAmount) {
		this.transactions.add(Double.valueOf(transactionAmount));
		return true;
	}
}
