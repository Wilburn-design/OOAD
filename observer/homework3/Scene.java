package hk_day02.homework3;

import java.util.ArrayList;

public class Scene {
	public Cage cage = new Cage();
    public ArrayList<Tiger> tigers = new ArrayList<>();
    public ArrayList<Lion> lions = new ArrayList<>();
    public ArrayList<Gold> golds = new ArrayList<>();
    public ArrayList<Diamond> diamonds = new ArrayList<>();

    public Scene() {
        for (int i = 0; i < StaticCount.TIGER_COUNT_; i++) {
            tigers.add(new Tiger("tiger -> " + i));
        }
        for (int i = 0; i < StaticCount.LION_COUNT_; i++) {
            lions.add(new Lion("Lion -> " + i));
        }
        for (int i = 0; i < StaticCount.GOLD_COUNT_; i++) {
            Gold gold = new Gold(100);
            tigers.forEach((Tiger tiger) -> {
                gold.guard(tiger);
            });
            lions.forEach((Lion lion) -> {
                gold.guard(lion);
            });
            golds.add(gold);
        }
        for (int i = 0; i < StaticCount.DIAMOND_COUNT_; i++) {
            Diamond diamond = new Diamond(100);
            tigers.forEach((Tiger tiger) -> {
                diamond.guard(tiger);
            });
            lions.forEach((Lion lion) -> {
                diamond.guard(lion);
            });
            diamonds.add(diamond);
        }
    }
}
