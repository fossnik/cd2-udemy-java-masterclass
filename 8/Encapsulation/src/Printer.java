public class Printer {

	private int tonerLevel;
	private int printedPages;
	private boolean isDuplex;

	// default constructor for new printer
	public Printer(int tonerLevel, boolean isDuplex) {
		this.tonerLevel = tonerLevel;
		this.printedPages = 0;
		this.isDuplex = isDuplex;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPrintedPages() {
		return printedPages;
	}

	public boolean isDuplex() {
		return isDuplex;
	}

	public void printpages(int numPages) {
		if (tonerLevel - numPages > 0) {
			System.out.printf("Printing %s page(s)\n", numPages);
			tonerLevel -= numPages;
			printedPages += numPages;
		}
		else System.out.printf("Insufficient Toner to print %s page(s)\n", numPages);
	}

	public void tonerReplace(int tonerSize) {
		System.out.printf("New Toner Installed\n");
		tonerLevel = tonerSize;
	}

}
