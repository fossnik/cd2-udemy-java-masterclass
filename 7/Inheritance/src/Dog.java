public class Dog extends Animal {

	private int eyes, legs, tail, teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	public void chew() {
		System.out.println("Dog chew() called");
	}

	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
}