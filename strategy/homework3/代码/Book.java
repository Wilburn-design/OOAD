package hk_day01.homework3.ДњТы;

public abstract class Book {
	Discount discount;
	public Book() {

	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public abstract void showName(); 
	public void performDiscount() {
		discount.discount();
	}
}
