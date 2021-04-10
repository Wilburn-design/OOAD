package hk_day04.homework3;

public class AnimalTestDrive {
	public static void main(String[] args) {		
		AnimalFactory animalFactory = new AnimalFactory();
		Animals animal1 = animalFactory.createAnimals("quack");
		Animals animal2 = animalFactory.createAnimals("bark");
		Animals animal3 = animalFactory.createAnimals("meow");
		animal1.show();
		animal2.show();
		animal3.show();
	}
}
