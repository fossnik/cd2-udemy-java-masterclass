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

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.printf("Car.setCurrentGear(): Changed to %s\n", currentGear);
	}

	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
		System.out.printf("Car.changeVelocity():\n Velocity is %s, and Speed is %s\n", speed, direction);
	}
}
