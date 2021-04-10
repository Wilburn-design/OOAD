package hk_day04.report;

public class Unrecognized extends Users {
	
	public Unrecognized() {
		this.setUserName("unrecognized");
		this.setPermissionLevel();
	}
	@Override
	public void setPermissionLevel() {
		this.permissionLevel = -1;
	}

}
