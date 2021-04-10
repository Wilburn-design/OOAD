package hk_day01.report;

public class Fighter extends Aircraft {
	public Fighter() {
		takeoffcharacter = new LongDistanceTakeOff();
		landcharacter = new LongDistanceLand();
		flycharacter = new SubSonicFly();
	}

	@Override
	public void showName() {
		System.out.println("I am a fighter.");
	}
}
