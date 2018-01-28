import java.util.HashMap;
import java.util.Map;

public class Hamburger {
	private String title;
	private int price;
	private String bread;
	private String meat;
	private String fixings;

	private Hamburger(String title, int price, String bread, String meat, String fixings) {
		this.title = title;
		this.price = price;
		this.bread = bread;
		this.meat = meat;
		this.fixings = fixings;
	}

	public void printReceipt() {
		System.out.printf(":: % Burger ::\n%s Bread\nPrice:\t%s", );
	}

}
