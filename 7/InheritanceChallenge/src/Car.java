public class Car extends Vehicle {
	private int wheels, doors, gears, currentGear;
	private boolean isManual;

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.printf("Car.changeGear(): Changed to %s\n", currentGear);
	}

	public void changeVelocity(int speed, int direction) {
		System.out.printf("Car.changeVelocity():\n Velocity is %s, and Direction is %s\n", speed, direction);
		move(speed, direction);
	}
}
