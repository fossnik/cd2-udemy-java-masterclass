import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

	public static void main(String[] args) {

		// Create a program that implements a simple mobile phone with the following capabilities.
		// Add a menu of options that are available:
		// Quit, print list, add new contact, update existing, remove, and search/find contact.
		int choice = 0;

		while (choice != 6) {
			System.out.println("\n" +
					"\t 1 - Print Contacts\n" +
					"\t 2 - Add New\n" +
					"\t 3 - Update Existing\n" +
					"\t 4 - Remove Contact\n" +
					"\t 5 - Query Contact\n" +
					"\t 6 - QUIT\n");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					mobilePhone.printContacts();
					break;
				case 2:
					addNewContact();
					break;
				case 3:
					updateContact();
					break;
				case 4:
					removeContact();
					break;
				case 5:
					queryContact();
					break;
				case 6:
					System.out.println("Goodbye");
				default:
			}
		}
	}

	private static void addNewContact() {
		System.out.println("Enter contact name:");
		String name = scanner.nextLine();

		System.out.println("Enter contact phone:");
		String phone = scanner.nextLine();

		Contact newContact = Contact.createContact(name, phone);

		if (mobilePhone.addNewContact(newContact))
			System.out.println("New contact added: name = " + name + ", phone = " + phone);
		else
			System.out.println("Cannot add. '" + name + "' already exists.");
	}

	private static void updateContact() {
		System.out.println("Enter existing contact name:");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);

		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}

		System.out.println("Enter new contact name:");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact number:");
		String newNumber = scanner.nextLine();

		Contact newContact = Contact.createContact(newName, newNumber);
		if (mobilePhone.updateContact(existingContactRecord, newContact))
			System.out.println("Successfully updated record.");
		else
			System.out.println("Error updating record");
	}

	private static void removeContact() {
		System.out.println("Enter existing contact name:");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);

		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}

		if (mobilePhone.removeContact(existingContactRecord))
			System.out.println("Successfully deleted.");
		else
			System.out.println("Error deleting contact.");
	}

	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}

		System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhone());
	}
}
