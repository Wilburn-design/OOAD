package hk_day02.report;

import java.util.ArrayList;
import java.util.List;


public class Stock implements Subject {
	private List observers;
	private float price;
	public Stock() {
		observers = new ArrayList(); 
	}
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if(i>=0) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this.price);
		}
	}
	public void measurementsChanged() {
		notifyObserver();
	}
	public void setPrice(float price) {
		this.price = price;
		measurementsChanged();
	}

}
