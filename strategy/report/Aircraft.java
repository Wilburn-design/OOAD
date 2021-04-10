package hk_day01.report;

public abstract class Aircraft {
	protected FlyingCharacters flycharacter;
	protected LandingCharacters landcharacter;
	protected TakeoffCharacters takeoffcharacter;
	public Aircraft() {
		
	}
	public FlyingCharacters getFlycharacter() {
		return flycharacter;
	}
	public void setFlycharacter(FlyingCharacters flycharacter) {
		this.flycharacter = flycharacter;
	}
	public LandingCharacters getLandcharacter() {
		return landcharacter;
	}
	public void setLandcharacter(LandingCharacters landcharacter) {
		this.landcharacter = landcharacter;
	}
	public TakeoffCharacters getTankeoffcharacter() {
		return takeoffcharacter;
	}
	public void setTankeoffcharacter(TakeoffCharacters tankeoffcharacter) {
		this.takeoffcharacter = tankeoffcharacter;
	}
	public abstract void showName();
	public void perform() {
		flycharacter.fly();
		landcharacter.landon();
		takeoffcharacter.takeoff();
	}
}
