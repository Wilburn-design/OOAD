package hk_day03.homework3;

public class RollupCurtain implements Room{

	@Override
	public void describe() {
		System.out.print("To choose a roll-up curtain");
	}

	@Override
	public double cost() {
		return 25;
	}
	
}
