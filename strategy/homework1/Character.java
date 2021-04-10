package hk_day01.homework1;

public abstract class Character {
	private WeaponBehavior Weapon;
	public Character() {
		
	}
	abstract void fight();
	public WeaponBehavior getWeapon() {
		return Weapon;
	}
	public void setWeapon(WeaponBehavior weapon) {
		Weapon = weapon;
	}
	public void performWeapon() {
		Weapon.useWeapon();
	}
}
