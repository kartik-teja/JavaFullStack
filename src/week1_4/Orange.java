package week1_4;

public class Orange extends Fruit {
	Orange(String size){
		super("Orange","Sour",size);
	}
	@Override
    public void eat() {
        System.out.println("This is an Orange and it tastes sour.");
    }

}
