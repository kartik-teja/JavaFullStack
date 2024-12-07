package week1_3;

public class Bird extends Animal {
	
	@Override
	public void eat() {
		System.out.println("Bird is eating");
	}
	@Override
	public void sleep() {
		System.out.println("Bird is sleeping");
	}
	public void fly() {
		System.out.println("Bird is flying");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Animal ab = new Bird();
		Bird b = new Bird();
		
		a.eat();
		a.sleep();
		ab.eat();
		ab.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}

}
