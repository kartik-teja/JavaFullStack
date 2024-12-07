 package week1_6;
import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		int n = r.nextInt(4);
		
		switch(n) {
		case 0:
			FirstClass f = new FirstClass();
			System.out.println(f.notice());
			break;
		case 1:
			Ladies lady = new Ladies();
			System.out.println(lady.notice());
			break;
		case 2:
			General g = new General();
			System.out.println(g.notice());
			break;
		case 3:
			Luggage l = new Luggage();
			System.out.println(l.notice());
			break;
		default:
			System.err.println("There occured an error in generation run again");
		}

	}
}
