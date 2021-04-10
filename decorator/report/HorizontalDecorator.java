package hk_day03.report;

public class HorizontalDecorator extends WindowDecorator {

	private Window window;
	public HorizontalDecorator(Window window) {
		this.window = window;
	}
	@Override
	public String getDescription() {
		return window.getDescription()+setDecorator();
	}
	public String setDecorator() {
		return " with horizontal scrollbars";
	}

}
