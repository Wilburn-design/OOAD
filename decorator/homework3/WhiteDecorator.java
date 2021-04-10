package hk_day03.homework3;

public class WhiteDecorator extends CurtainDecorator {
	Room specialCurtain;
	public WhiteDecorator(Room specialCurtain) {
		this.specialCurtain = specialCurtain;
	}
	@Override
	public void describe() {
		specialCurtain.describe();
		System.out.print(" and choose white color");
	}
	@Override
	public double cost() {
		return specialCurtain.cost()+200;
	}

}
