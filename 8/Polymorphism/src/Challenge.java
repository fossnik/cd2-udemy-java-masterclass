public class Challenge {
	public class Car {
		private boolean engine;
		private int cylinders;
		private int wheels;
		private String name;

		private Car(String name, int cylinders) {
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
		private Altima() {
			super("Altima", 4);
		}
	}

	class Defender extends Car {
		private Defender() {
			super("Defender", 6);
		}

	}

	class Plymouth extends Car {
		private Plymouth() {
			super("Plymouth", 6);
		}

	}

	public static void main(String[] args) {
		Car car1 = new Altima();
		Car car2 = new Defender();
		Car car3 = new Plymouth();

		System.out.printf("The %s has %s cylinders\n", car1.getName(), car1.getCylinders());
		System.out.printf("Starting the %s ..\n", car2.getName());
		System.out.printf("The %s has %s wheels\n", car3.getName(), car3.getWheels());

	}
}
