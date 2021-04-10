package hk_day01.homework3.ДњТы;

public class testMain {
	public static void main(String[] args) {
		ComputerBook book1 = new ComputerBook();
		book1.showName();
		book1.performDiscount();
		System.out.println();
		
		LanguageBook book2 = new LanguageBook();
		book2.showName();
		book2.performDiscount();
		System.out.println();
		
		NovelBook book3 = new NovelBook();
		book3.showName();
		book3.performDiscount();
	}
}
