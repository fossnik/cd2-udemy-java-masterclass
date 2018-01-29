public class HealthyBurger extends Hamburger{

	private String healthyExtra1Name, getHealthyExtra2Name;
	private double healthyExtra1Price, getHealthyExtra2Price;


	public HealthyBurger(String title, double price, String bread, String meat) {
		super("Healthy", price, "Whole Grain", meat);
	}

	public void addHealthAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}

	public void addHealthAddition2(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}

	@Override
	public double printReceipt() {
		super.printReceipt();
		return 0;
	}
}
