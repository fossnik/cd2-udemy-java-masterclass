import java.util.ArrayList;

// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch

public class Bank {

	private String bankName;
	private ArrayList<Branch> branches;

	public Bank(String bankName) {
		this.bankName = bankName;
		this.branches = new ArrayList<Branch>();
	}

	public boolean newBranch(String location) {
		if (findBranch(location) != null)
			return false;
		else
			this.branches.add(new Branch(location));

		return true;
	}

	public boolean newCustomer(String branchLocation, String customerName, double initialBalance) {
		Branch branch = findBranch(branchLocation);

		if (branch == null)
			return false;
		else
			return branch.newCustomer(customerName, initialBalance);
	}

	public boolean newTransaction(String branchLocation, String customerName, double amount) {
		Branch branch = findBranch(branchLocation);

		if (branch == null)
			return false;
		else
			return branch.newTransaction(customerName, amount);
	}

	private Branch findBranch(String location) {
		for (Branch b : this.branches)
			if (b.getLocation().equals(location))
				return b;

		return null;
	}

	public boolean listCustomers(String branchLocation) {
		Branch branch = findBranch(branchLocation);

		if (branch == null)
			return false;
		else {
			System.out.println("[ " + this.bankName + ' ' + branch.getLocation() + " ]");

			for (Customer c : branch.getCustomers())
				System.out.println("\t> " + c.getCustomerName());
		}

		return true;
	}
}
