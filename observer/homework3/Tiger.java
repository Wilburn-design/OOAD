package hk_day02.homework3;

public class Tiger implements Eudemon{
	private String name;

    public Tiger(String name) {
        this.name = name;
    }
    
    @Override
    public void update(Character character) {
        attack(character);
    }
    
    @Override
    public void attack(Character character) {
        System.out.println(character.getName() + "�ܵ��ػ���" + name + "������չʾ��ɫ״̬��\n" + character);
    }

}