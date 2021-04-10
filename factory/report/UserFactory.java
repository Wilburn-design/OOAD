package hk_day04.report;

public class UserFactory {
	Users user = null;
	public Users createUsers(String userName,String password,String career) {
		if(career.equals("student")) {
			user = new Student(userName, password);
		}else if(career.equals("teacher")) {
			user = new Teacher(userName, password);
		}else if(career.equals("manager")) {
			user = new Manager(userName, password);
		}else {
			user = new Unrecognized();
		}
		return user;
	}
}
