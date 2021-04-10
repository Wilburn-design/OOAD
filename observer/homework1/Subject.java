package hk_day02.homework1;

import java.util.ArrayList;

public abstract class Subject {
	public abstract void registerObserver(Observer observer);
	public abstract void removeObserver(Observer observer);
	public abstract void notifyObservers();
}
