package hk_day01.homework1;

public class testMain {

	public static void main(String[] args) {
		King king = new King();
		Queen queen = new Queen();
		Knight knight = new Knight();
		Troll troll = new Troll();
		king.fight();
		king.setWeapon(new SwordBehavior());
		king.performWeapon();
		king.setWeapon(new KnifeBehavior());
		king.performWeapon();
		king.setWeapon(new BowAndArrowBehavior());
		king.performWeapon();
		king.setWeapon(new AxeBehavior());
		king.performWeapon();
		System.out.println();
	
		queen.fight();
		queen.setWeapon(new SwordBehavior());
		queen.performWeapon();
		queen.setWeapon(new KnifeBehavior());
		queen.performWeapon();
		queen.setWeapon(new BowAndArrowBehavior());
		queen.performWeapon();
		queen.setWeapon(new AxeBehavior());
		queen.performWeapon();
		System.out.println();
		
		knight.fight();
		knight.setWeapon(new SwordBehavior());
		knight.performWeapon();
		knight.setWeapon(new SwordBehavior());
		knight.performWeapon();
		knight.setWeapon(new BowAndArrowBehavior());
		knight.performWeapon();
		knight.setWeapon(new AxeBehavior());
		knight.performWeapon();
		System.out.println();
		
		troll.fight();
		troll.setWeapon(new SwordBehavior());
		troll.performWeapon();
		troll.setWeapon(new SwordBehavior());
		troll.performWeapon();
		troll.setWeapon(new BowAndArrowBehavior());
		troll.performWeapon();
		troll.setWeapon(new AxeBehavior());
		troll.performWeapon();
		System.out.println();
	}
}
