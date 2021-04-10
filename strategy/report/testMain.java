package hk_day01.report;

public class testMain {
	public static void main(String[] args) {
		Helicopter helicopter = new Helicopter();
		helicopter.showName();
		helicopter.perform();
		System.out.println();
		
		Fighter fighter = new Fighter();
		fighter.showName();
		fighter.perform();
		System.out.println();
		
		Airplane airplane = new Airplane();
		airplane.showName();
		airplane.perform();
		System.out.println();
		
		SupersonicAircraft aircraft = new SupersonicAircraft();
		aircraft.showName();
		aircraft.perform();
	}
}
