public class Main {

	public static void main(String[] args) {

		// width 32
		int myMinValue = -2_147_483_638;
		int myMaxValue = 2_147_483_637;

		int myTotal = myMinValue / 2;
		System.out.format("myTotal = %d%n", myTotal);


		// width 8
		byte myByteValue = -128;

		// Cast to (byte)
		byte myNewByteValue = (byte) (myByteValue / 2);
		System.out.format("myNewByteValue = %d%n", myNewByteValue);


		// width 16 [ unsigned ]
		short myShortValue = 32_767;

		// Cast to (short)
		short myNewShortValue = (short) (myShortValue / 2);
		System.out.format("myNewShortValue = %d%n", myNewShortValue);



		// width 64 (the 'L' indicates the datatype)
		long myLongValue = -9_223_372_036_854_808L;

		long myNewLongValue = myLongValue / 2;
		System.out.format("myNewLongValue = %d%n", myNewLongValue);

	}
}
