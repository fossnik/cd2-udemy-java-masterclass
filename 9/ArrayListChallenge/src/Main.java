import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	// Create a master class (MobilePhone) that holds the ArrayList of Contacts
	// Able to store, modify, remove and query contact names.
	// MobilePhone should do everything with Contact objects only.

	private String myNumber;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}

	public boolean addNewContact(Contact contact) {

		// When adding or updating be sure to check if the contact already exists (use name)
		if (findContact(contact.getName()) >= 0) {
			System.out.println("Contact Already Exists");
			return false;
		}

		myContacts.add(contact);
		return true;
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);
		if (foundPosition < 0) {
			System.out.println(oldContact.getName() + " was not found.");
			return false;
		}

		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName() + " was replaced with " + newContact);
	}

	private int findContact(Contact contact) {
		return myContacts.indexOf(contact);
	}

	private int findContact(String contactName) {
		for (int i = 0; i < this.myContacts.size(); i++) {
			Contact contact = this.myContacts.get(i);
			if (contact.getName().equals(contactName))
				return i;
		}
		return -1;
	}
}

public class Contact {

	// You will want to create a separate class for Contacts (name and phone number).
	// Be sure not to expose the inner workings of the Arraylist to MobilePhone

	private String name, phone;

	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public static Contact createContact(String name, String phone) {
		return new Contact(name, phone);
	}
}

public class Main {
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

		// Create a program that implements a simple mobile phone with the following capabilities.
		// Add a menu of options that are available:
		// Quit, print list, add new contact, update existing, remove, and search/find contact.
		int choice = 0;

		while (choice != 5) {
			System.out.println("\n" +
					"\t 1 - Print Contacts\n" +
					"\t 2 - Add New.\n" +
					"\t 3 - Update Existing.\n" +
					"\t 4 - Remove Contact.\n" +
					"\t 5 - QUIT\n");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					groceryList.printGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
			}
		}
    }
}
