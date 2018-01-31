public class Main {

	public static void main(String[] args) {
		// You job is to create a simple banking application.

		// There should be a Bank class
		// It should have an arraylist of Branches
		// Each Branch should have an arraylist of Customers
		// The Customer class should have an arraylist of Doubles (transactions)

		// Customer:
		// Name, and the ArrayList of doubles.

		// Branch:
		// Need to be able to add a new customer and initial transaction amount.
		// Also needs to add additional transactions for that customer/branch

		// Bank:
		// Add a new branch
		// Add a customer to that branch with initial transaction
		// Add a transaction for an existing customer for that branch

		// Show a list of customers for a particular branch and optionally a list
		// of their transactions
		// Demonstration autoboxing and unboxing in your code
		// Hint: Transactions
		// Add data validation.
		// e.g. check if exists, or does not exist, etc.
		// Think about where you are adding the code to perform certain actions

		Bank bank = new Bank("WCU");

		if(bank.newBranch("Santa Monica")) {
			System.out.println("Santa Monica branch created!");
		}

		bank.newCustomer("Santa Monica", "Tim", 50.05);
		bank.newCustomer("Santa Monica", "Mike", 175.34);
		bank.newCustomer("Santa Monica", "Percy", 220.12);

		bank.newBranch("Sydney");
		bank.newCustomer("Sydney", "Bob", 150.54);

		bank.newTransaction("Santa Monica", "Tim", 44.22);
		bank.newTransaction("Santa Monica", "Tim", 12.44);
		bank.newTransaction("Santa Monica", "Mike", 1.65);

		bank.listCustomers("Santa Monica");
		bank.listCustomers("Sydney");

		bank.newBranch("Melbourne");

		if(!bank.newCustomer("Melbourne", "Brian", 5.53)) {
			System.out.println("Error! Melbourne branch does not exist!\n");
		}

		if(!bank.newBranch("Santa Monica")) {
			System.out.println("Santa Monica branch already exists!\n");
		}

		if(!bank.newTransaction("Santa Monica", "Fergus", 52.33)) {
			System.out.println("Customer \"Fergus\" does not exist at branch!\n");
		}

		if(!bank.newCustomer("Santa Monica", "Tim", 12.21)) {
			System.out.println("Customer \"Tim\" already exists!\n");
		}
	}
}
