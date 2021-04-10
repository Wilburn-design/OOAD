package hk_day01.report;

public class Helicopter extends Aircraft {
	public Helicopter() {
		takeoffcharacter = new VerticalTakeOff();
		landcharacter = new VerticalLand();
		flycharacter = new SubSonicFly();
		
	}
	@Override
	public void showName() {
		System.out.println("I am a helicopter.");
	}

}
