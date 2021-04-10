package hk_day04.report;

public class Teacher extends Users {
	
	public Teacher(String userName, String password) {
		super(userName, password);
		this.setPermissionLevel();
	}

	@Override
	public void setPermissionLevel() {
		this.permissionLevel = 50;				
	}

}
