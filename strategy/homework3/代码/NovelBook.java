package hk_day01.homework3.ДњТы;

public class NovelBook extends Book {
	
	public NovelBook() {
		discount = new NovelDC();
	}

	@Override
	public void showName() {
		System.out.println("This is a NovelBook");
	}
}
