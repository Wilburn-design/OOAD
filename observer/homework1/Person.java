package hk_day02.homework1;

import java.util.ArrayList;

public class Person extends Subject implements Observer,Member {
	private ArrayList<Observer> observers= new ArrayList<Observer>();
	private String name;
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	@Override
	public void action() {
		System.out.println("队员受到攻击，立即支援！");
		notifyObservers();
	}

	@Override
	public void update(Observer observer) {
		registerObserver(observer);
	}
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		int i=observers.indexOf(observer);
		if(i>=0) {
			observers.remove(observer);			
		}
	}
	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++) {
			Person person = (Person) observers.get(i);
			String name = person.getName();
			System.out.println(name+"已收到通知！");
		}
	}
	public void beat(String name) {
		System.out.println(name+"受到攻击！");
		action();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
