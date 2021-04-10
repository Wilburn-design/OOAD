package hk_day02.report;

public class Test {
	public static void main(String[] args) {
		Stock stock = new Stock();
		Shareholder1 shareholder1 = new Shareholder1(stock);
		Shareholder2 shareholder2 = new Shareholder2(stock);
		Shareholder3 shareholder3 = new Shareholder3(stock);
		stock.setPrice(98);
		stock.setPrice(92);
	}
}
