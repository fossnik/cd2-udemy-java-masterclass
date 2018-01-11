public class Challenge {

	public static void main(String[] args) {
		byte	zbyte	= 10;
		short	zshort	= 20;
		int		zint	= 30;

		long zlong = 50000L;

		long longTotal = 10L * (zbyte + zshort + zint);
		System.out.println("longTotal equals: " + longTotal);

		short shortTotal = (short) longTotal;
		System.out.println("shortTotal equals: " + shortTotal);

	}
}
