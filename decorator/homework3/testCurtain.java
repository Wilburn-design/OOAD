package hk_day03.homework3;

public class testCurtain {
	public static void main(String[] args) {
		Room room00 = new TraditionalCurtain();
		Room room01 = new WhiteDecorator(room00);
		Room room02 = new GreyDecorator(room00);
		Room room03 = new PinkDecorator(room00);
		room00.describe();
		System.out.println(" will cost "+room00.cost()+"$");
		room01.describe();
		System.out.println(" will cost "+room01.cost()+"$");
		room02.describe();
		System.out.println(" will cost "+room02.cost()+"$");
		room03.describe();
		System.out.println(" will cost "+room03.cost()+"$");
		System.out.println();
		
		Room room10 = new RollupCurtain();
		Room room11 = new WhiteDecorator(room10);
		Room room12 = new GreyDecorator(room10);
		Room room13 = new PinkDecorator(room10);
		room10.describe();
		System.out.println(" will cost "+room00.cost()+"$");
		room11.describe();
		System.out.println(" will cost "+room01.cost()+"$");
		room12.describe();
		System.out.println(" will cost "+room02.cost()+"$");
		room13.describe();
		System.out.println(" will cost "+room03.cost()+"$");
		System.out.println();
		
		Room room20 = new VenetianCurtain();
		Room room21 = new WhiteDecorator(room20);
		Room room22 = new GreyDecorator(room20);
		Room room23 = new PinkDecorator(room20);
		room20.describe();
		System.out.println(" will cost "+room20.cost()+"$");
		room21.describe();
		System.out.println(" will cost "+room21.cost()+"$");
		room22.describe();
		System.out.println(" will cost "+room22.cost()+"$");
		room23.describe();
		System.out.println(" will cost "+room23.cost()+"$");
	}
}
