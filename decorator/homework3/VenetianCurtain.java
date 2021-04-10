package hk_day03.homework3;

public class VenetianCurtain implements Room {

	@Override
	public void describe() {
		System.out.print("To choose a venetian curtain");
	}

	@Override
	public double cost() {
		return 30;
	}

}
