public class FloatAndDouble {

	public static void main(String[] args) {
		// Demonstrate Digit Precision

		// width 32
		int		myIntValue		= 5 / 3; 	// myIntValue: 1

		// width 32
		float	myFloatValue	= 5f / 3f;	// myFloatValue: 1.6666666

		// width 64
		double	myDoubleValue	= 5d / 3d;	// myDoubleValue: 1.6666666666666667

		// width 64
		long	myLongValue		= 5l / 3l;

		System.out.println("myIntValue: " + myIntValue);
		System.out.println("myFloatValue: " + myFloatValue);
		System.out.println("myDoubleValue: " + myDoubleValue);
		System.out.println("myLongValue: " + myLongValue);
	}
}
