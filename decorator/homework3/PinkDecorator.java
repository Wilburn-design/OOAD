package hk_day03.homework3;

public class PinkDecorator extends CurtainDecorator {
	Room specialCurtain;
	public PinkDecorator(Room specialCurtain) {
		this.specialCurtain = specialCurtain;
	}
	@Override
	public void describe() {
		specialCurtain.describe();
		System.out.print(" with pure color");
	}
	@Override
	public double cost() {
		return specialCurtain.cost()+300;
	}
}
