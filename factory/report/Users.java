package hk_day04.report;

public abstract class Users {
	private String userName;
	private String password;
	protected int permissionLevel;
	public Users(String userName,String password) {
		this.userName = userName;
		this.password = password;
		permissionLevel = 0;
	}
	public Users() {

	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPermissionLevel() {
		return permissionLevel;
	}
	public abstract void setPermissionLevel();	
}
