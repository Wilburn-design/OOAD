package hk_day03.homework1;

public class NuttyDecorator extends IcecreamDecorator {
	
	private Icecream specialIcecream;
	public NuttyDecorator(Icecream specialIcecream) {
		this.specialIcecream = specialIcecream;
	}
	@Override
	public String makeIcecream() {
		return specialIcecream.makeIcecream()+addNuts();
	}
	public String addNuts() {
		return " with nuts";
	}

}
