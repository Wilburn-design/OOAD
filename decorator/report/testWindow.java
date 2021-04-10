package hk_day03.report;

public class testWindow {
	public static void main(String[] args) {
		
		//SimpleWindow
		Window window = new SimpleWindow();
		System.out.println(window.getDescription());
		
		//HorizontalDecorator
		Window window2 = new HorizontalDecorator(window);
		System.out.println(window2.getDescription());
		
		//VerticalDecorator
		Window window3 = new VerticalDecorator(window);
		System.out.println(window3.getDescription());

		//HorizontalDecorator and VerticalDecorator
		Window window4 = new VerticalDecorator(window2);
		System.out.println(window4.getDescription());

	}
}
