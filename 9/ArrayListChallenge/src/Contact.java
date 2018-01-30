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
