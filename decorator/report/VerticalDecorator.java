package hk_day03.report;

public class VerticalDecorator extends WindowDecorator {
	
	private Window window;
	public VerticalDecorator(Window window) {
		this.window = window;
	}
	@Override
	public String getDescription() {
		return window.getDescription()+setDecorator();
	}
	public String setDecorator() {
		return " with vertical scrollbars";
	}

}
