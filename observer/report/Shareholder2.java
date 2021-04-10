package hk_day02.report;

public class Shareholder2 implements Observer {
	private float priceold = 100;
	private float price;
	private Stock stock;
	public Shareholder2(Stock stock) {
		this.stock = stock;
		stock.registerObserver(this);
	}
	@Override
	public void update(float price) {
		this.price = price;
		if(priceold+priceold*0.05<=price||priceold-priceold*0.05>=price)
			display();
		this.priceold = price;
	}
	public void display(){
		System.err.println("Warning to Shareholder2!");
	}
}
