public class Challenge {

	public static void main(String[] args) {
		byte	zbyte	= 10;
		short	zshort	= 20;
		int		zint	= 30;

		long zlong = 50000L;

		zlong += 10 * (zbyte + zshort + zint);

		System.out.println("zbyte equals: " + zlong);
	}
}
