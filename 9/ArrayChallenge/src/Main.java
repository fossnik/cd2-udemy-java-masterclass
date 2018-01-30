import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.

        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.


		int[] myIntegers = getIntegers(5);
		int[] sorted = sortIntegers(myIntegers);
		printArray(sorted);

    }

    public static int[] getIntegers(int number) {
		int[] values = new int[number];

		System.out.printf("Enter %s integer values.\n", number);

		for (int i = 0; i < values.length; i++)
			values[i] = scanner.nextInt();

		return values;
	}

	public static void printArray(int[] values) {
		for (int i = 0; i < values.length; i++)
			System.out.printf("Element: %s\tcontents: %s\n", i, values[i]);
	}

	public static int[] sortIntegers(int[] array) {
    	Arrays.sort(array);
    	return array;
	}
}
