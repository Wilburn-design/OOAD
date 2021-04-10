package hk_day02.report;

public interface Subject {
	public void registerObserver(Observer observe);
	public void deleteObserver(Observer observe);
	public void notifyObserver();
}
