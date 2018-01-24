public class Vehicle {
	private String name, size;

	private int currentVelocity, currentDirection;

	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}

	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.printf("Vehicle.steer(): Steering at %s degrees.\n", currentDirection);
	}

	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.printf("Vehicle.move(): Moving at %s in direction %s\n", currentVelocity, currentDirection);
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void stop() {
		this.currentVelocity = 0;
	}
}
