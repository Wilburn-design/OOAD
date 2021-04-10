package hk_day03.homework3;

public class GreyDecorator extends CurtainDecorator {
	Room specialCurtain;
	public GreyDecorator(Room specialCurtain) {
		this.specialCurtain = specialCurtain;
	}
	@Override
	public void describe() {
		specialCurtain.describe();
		System.out.print(" with tambour");
	}
	@Override
	public double cost() {
		return specialCurtain.cost()+250;
	}
}
