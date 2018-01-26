public class Main {

	public static void main(String[] args) {

		Printer printer1 = new Printer(1000, 0, false);

		System.out.printf("Printer Type:\nDuplex: %s\n", printer1.isDuplex());

		printer1.printpages(14);
		System.out.printf("Your Current Toner Level is %s\n", printer1.getTonerLevel());
		printer1.printpages(8);

		System.out.printf("Pages Printed: %s\nToner Level: %s\n", printer1.getPrintedPages(), printer1.getTonerLevel());

		printer1.tonerReplace(1200);

		printer1.printpages(19);
		System.out.printf("Pages Printed: %s\nToner Level: %s\n", printer1.getPrintedPages(), printer1.getTonerLevel());

	}
}
