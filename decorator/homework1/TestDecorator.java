package hk_day03.homework1;

public class TestDecorator {

	public static void main(String[] args) {
		
		//SimpleIcecream
		Icecream icecream = new SimpleIcecream();
		System.out.println(icecream.makeIcecream());
		
		//Add nuts
		Icecream icecream2 = new NuttyDecorator(icecream);
		System.out.println(icecream2.makeIcecream());
		
		//Add honey
		Icecream icecream3 = new HoneyDecorator(icecream);
		System.out.println(icecream3.makeIcecream());
		
		//Add nuts and honey
		Icecream icecream4 = new HoneyDecorator(icecream2);
		System.out.println(icecream4.makeIcecream());
		
	}

}
