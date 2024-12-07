package week1_4;

public class Apple extends Fruit {
	Apple(String size){
		super("Apple","Sweet",size);
	}
	@Override
    public void eat() {
        System.out.println("This is an Apple and it tastes sweet.");
    }
}
