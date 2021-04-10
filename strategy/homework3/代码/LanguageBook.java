package hk_day01.homework3.ДњТы;

public class LanguageBook extends Book {
	
	public LanguageBook() {
		discount = new LanguageDC();
	}
	@Override
	public void showName() {
		System.out.println("This is a LanguageBook.");
	}

}
