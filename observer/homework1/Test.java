package hk_day02.homework1;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		person.update(new Person("С��"));
		person.update(new Person("С��"));
		person.update(new Person("Сǿ"));
		person.update(new Person("С��"));
		person.beat("С��");
	}
}
