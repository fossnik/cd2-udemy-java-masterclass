class Car {
	private boolean engine;
	private int cylinders;
	private int wheels;
	private String name;

	public Car(String name, int cylinders) {
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.name = name;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public String getName() {
		return name;
	}

	public void startEngine() {
		System.out.println("Engine Started!");
	}

	public void accelerate() {
		System.out.println("Car Accelerated!");
	}

	public void brake() {
		System.out.println("Car Braked!");
	}
}

class Altima extends Car {
	public Altima(String name, int cylinders) {
		super(name, cylinders);
	}
}

class Defender extends Car {
	public Defender(String name, int cylinders) {
		super(name, cylinders);
	}
}

class Plymouth extends Car {
	public Plymouth(String name, int cylinders) {
		super(name, cylinders);
	}
}

public class Challenge {

	public static void main(String[] args) {
		Altima car1 = new Altima("Altima", 4);
		Defender car2 = new Defender("Defender", 6);
		Plymouth car3 = new Plymouth("Plymouth", 6);

		System.out.printf("The %s has %s cylinders\n", car1.getName(), car1.getCylinders());
		System.out.printf("Starting the %s ..\n", car2.getName());
		System.out.printf("The %s has %s wheels\n", car3.getName(), car3.getWheels());
	}
}

