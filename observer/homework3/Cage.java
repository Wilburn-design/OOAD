package hk_day02.homework3;

public class Cage extends Character {
	public Cage() {
        super("����");
    }

    public Cage(String name) {
        super(name);
    }

    @Override
    public void take(int quantity, Treasure treasure) {
        System.out.println(name + "������" + quantity+ "�����أ����������ػ���");
        treasure.setQuantity(treasure.getQuantity() - quantity);
        treasure.notifyEudemon(this);
    }
}
