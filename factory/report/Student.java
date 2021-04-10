package hk_day04.report;

public class Student extends Users {

	public Student(String userName, String password) {
		super(userName, password);
		this.setPermissionLevel();
	}

	@Override
	public void setPermissionLevel() {
		this.permissionLevel = 20;	
	}
	
}
