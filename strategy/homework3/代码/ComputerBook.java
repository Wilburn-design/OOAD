package hk_day01.homework3.ДњТы;

public class ComputerBook extends Book {
	
	public ComputerBook() {
		discount = new ComputerDC();
	}
	@Override
	public void showName() {
		System.out.println("This is a ComputerBook.");
	}
	
}
