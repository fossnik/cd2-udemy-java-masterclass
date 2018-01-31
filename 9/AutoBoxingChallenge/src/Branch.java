import java.util.ArrayList;

// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch

public class Branch {
	private String location;
	private ArrayList<Customer> customers;

	public Branch(String location) {
		this.location = location;
		this.customers = new ArrayList<Customer>();
	}

	public String getLocation() {
		return this.location;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public boolean newCustomer(String customerName, double initialBalance) {
		if (findCustomer(customerName) != null)
			return false;
		else
			this.customers.add(new Customer(customerName, initialBalance));

		return true;
	}
	
	public boolean newTransaction(String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);

		if (existingCustomer == null)
			return false;
		else
			return existingCustomer.newTransaction(amount);
	}

	private Customer findCustomer(String customerName) {
		for (Customer c : customers)
			if (c.getCustomerName().equals(customerName))
				return c;

		return null;
	}
}
