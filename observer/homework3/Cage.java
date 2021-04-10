package hk_day02.homework3;

public class Cage extends Character {
	public Cage() {
        super("凯奇");
    }

    public Cage(String name) {
        super(name);
    }

    @Override
    public void take(int quantity, Treasure treasure) {
        System.out.println(name + "拿走了" + quantity+ "个宝藏！并惊动了守护神");
        treasure.setQuantity(treasure.getQuantity() - quantity);
        treasure.notifyEudemon(this);
    }
}
