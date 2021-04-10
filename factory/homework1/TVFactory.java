package hk_day04.homework1;

public class TVFactory {
	public TV produceTV(String brand) {
		TV tv = null;
		if(brand.equals("Hisense")) {
			tv = new HisenseTV();
		}else if(brand.equals("Haier")) {
			tv = new HaierTV();
		}
		return tv;
	}
}
