package hk_day03.homework1;

public class HoneyDecorator extends IcecreamDecorator {
	private Icecream specialIcecream;
	public HoneyDecorator(Icecream specialIcecream) {
		this.specialIcecream = specialIcecream;
	}
	@Override
	public String makeIcecream() {
		return specialIcecream.makeIcecream()+addHoney();
	}
	public String addHoney() {
		return " with honey";
	}
}
