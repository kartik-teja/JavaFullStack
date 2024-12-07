package week1_4;

public class TestFruit {

	public static void main(String[] args) {
		Fruit w = new Fruit("WaterMelon","juicy","Large");
		Apple a = new Apple("small");
		Orange o = new Orange("medium");
		
		w.eat();
		a.eat();
		o.eat();

	}

}
