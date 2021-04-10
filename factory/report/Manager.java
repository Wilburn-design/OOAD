package hk_day04.report;

public class Manager extends Users {

	public Manager(String userName, String password) {
		super(userName, password);
		this.setPermissionLevel();
	}

	@Override
	public void setPermissionLevel() {
		this.permissionLevel =100;		
	}
}
