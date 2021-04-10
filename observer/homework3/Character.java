package hk_day02.homework3;

public abstract class Character {
	protected String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void take(int quantity, Treasure treasure);

    @Override
    public String toString() {
        return "Character{" +
                "name=" + name + '}';
    }
    
}
