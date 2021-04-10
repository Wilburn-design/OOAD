package hk_day03.homework3;

public class TraditionalCurtain implements Room {

	@Override
	public void describe() {
		System.out.print("To choose a tradition curtain");
	}

	@Override
	public double cost() {
		return 20;
	}
	
}
