package hk_day01.report;

public class SupersonicAircraft extends Aircraft {
	public SupersonicAircraft() {
		takeoffcharacter = new LongDistanceTakeOff();
		landcharacter = new LongDistanceLand();
		flycharacter = new SuperSonicFly();
	}

	@Override
	public void showName() {
		System.out.println("I am a supersonic aircraft.");
	}
}
