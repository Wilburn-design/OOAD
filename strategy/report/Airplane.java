package hk_day01.report;

public class Airplane extends Aircraft {
	public Airplane() {
		takeoffcharacter = new LongDistanceTakeOff();
		landcharacter = new LongDistanceLand();
		flycharacter = new SubSonicFly();
	}

	@Override
	public void showName() {
		System.out.println("I am an aircraft.");
	}
}
