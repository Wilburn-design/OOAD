package hk_day02.homework3;

public class test {
    public static void main(String[] args) {
        Scene scene = new Scene();
        Gold gold_13_50 = scene.golds.get(13);
        Diamond diamond_3_100 = scene.diamonds.get(3);
        scene.cage.take(50, gold_13_50);
        scene.cage.take(100, diamond_3_100);
    }
}
