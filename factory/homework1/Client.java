package hk_day04.homework1;

public class Client {
	public static void main(String[] args) {
		TVFactory factory = new TVFactory();
		TV tv1 = factory.produceTV("Haier");
		TV tv2 = factory.produceTV("Hisense");
		tv1.play();
		tv2.play();
	}
}
