package Encapsulation;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	public Printer(int t, boolean d) {
		if(tonerLevel >-1 && tonerLevel <= 100) {
			this.tonerLevel = t;
		}
		else {
			this.tonerLevel = -1;
		}
		
		this.duplex = d;
		this.pagesPrinted = 0;
	}
	
	public int addToner( int tonerAmmount) {
		if(tonerAmmount > 0 && tonerAmmount <= 100 ) {
			if(this.tonerLevel + tonerAmmount > 100) {
				return -1;
			}
			this.tonerLevel += tonerAmmount;
			return this.tonerLevel;
		}else {
			return -1;
		}
	}
	
	public int printPages(int pages) {
		int pagesToPrint = pages;
		if(this.duplex) {
			pagesToPrint /=2;
			System.out.println("Printing in duplex mode");
		} 
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}

}
