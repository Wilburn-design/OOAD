package hk_day02.homework1;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		person.update(new Person("小明"));
		person.update(new Person("小红"));
		person.update(new Person("小强"));
		person.update(new Person("小刚"));
		person.beat("小明");
	}
}
