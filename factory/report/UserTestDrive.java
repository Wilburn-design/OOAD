package hk_day04.report;

public class UserTestDrive {
	public static void main(String[] args) {
		UserFactory factory = new UserFactory();
		//参数：账号，密码，职业
		Users user1 = factory.createUsers("student123", "123456789", "student");
		Users user2 = factory.createUsers("teacher123", "12345", "teacher");
		Users user3 = factory.createUsers("admin123", "admin", "manager");
		Users user4 = factory.createUsers("unknown", "12345", "stranger");
		System.out.println("user:"+user1.getUserName()+"==>permissionlevel:"+user1.getPermissionLevel());
		System.out.println("user:"+user2.getUserName()+"==>permissionlevel:"+user2.getPermissionLevel());
		System.out.println("user:"+user3.getUserName()+"==>permissionlevel:"+user3.getPermissionLevel());
		System.out.println("user:"+user4.getUserName()+"==>permissionlevel:"+user4.getPermissionLevel());
	}
}
