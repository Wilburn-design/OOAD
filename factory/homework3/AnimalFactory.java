package hk_day04.homework3;

public class AnimalFactory {
	private Animals animals = null;
	public Animals createAnimals(String sound) {
		if(sound.equals("quack")) {
			animals = new Duck();
		}else if(sound.equals("bark")) {
			animals = new Dog();
		}else if(sound.equals("meow")) {
			animals = new Cat();
		}else {
			animals = new Unrecognized();
		}
		return animals;
	}
}
