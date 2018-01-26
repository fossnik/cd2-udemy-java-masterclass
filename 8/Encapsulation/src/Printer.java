public class Printer {

	private int tonerLevel;
	private int printedPages;
	private boolean isDuplex;

	// default constructor for new printer
	public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
		this.tonerLevel = tonerLevel;
		this.printedPages = printedPages;
		this.isDuplex = isDuplex;
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		this.tonerLevel = tonerLevel;
	}

	public int getPrintedPages() {
		return printedPages;
	}

	public void setPrintedPages(int printedPages) {
		this.printedPages = printedPages;
	}

	public boolean isDuplex() {
		return isDuplex;
	}

	public void setDuplex(boolean duplex) {
		isDuplex = duplex;
	}

	public void printpages(int numPages) {
		System.out.printf("Printing %s page(s)\n", numPages);
		tonerLevel -= numPages;
		printedPages += numPages;
	}

	public void tonerReplace(int tonerSize) {
		System.out.printf("New Toner Installed\n");
		tonerLevel = tonerSize;
	}

}
