package hk_day02.homework3;

public class Lion implements Eudemon{
	private String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void update(Character character) {
        attack(character);
    }

    @Override
    public void attack(Character character) {
        System.out.println(character.getName() + "受到守护神" + name + "攻击，展示角色状态：\n" + character);
    }
}
