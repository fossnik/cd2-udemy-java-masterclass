public class Challenge {

	public static void main(String[] args) {
		System.out.printf("6 inches is equal to %s centimeters\n", calcFeetAndInchesToCentimeters(6));
		System.out.printf("5 feet and 8 inches is equal to %s centimeters\n", calcFeetAndInchesToCentimeters(5,8));
	}

	private static double calcFeetAndInchesToCentimeters(int feet, int inches) {
		if (feet < 0)
			return -1;
		if (inches < 0 || inches >= 12)
			return -1;

		return (feet * 12 + inches) * 2.54;
	}

	private static double calcFeetAndInchesToCentimeters(int inches) {
		if (inches <= 0)
			return -1;

		return inches * 2.54;
	}
}
