import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		for (int i = 0; i < myIntegers.length; i++) {
			System.out.printf("Element %s, typed values was %s\n", i, myIntegers[i]);
		}

		System.out.println("The Average is: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
		System.out.printf("Enter %s integer values.\n", number);
		int[] values = new int[number];

		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

	public static double getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return (double) sum / (double) array.length;
	}
}
