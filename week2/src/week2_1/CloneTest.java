package week2_1;

public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Bhanu",24,52000.23);
		
		try {
			Employee eClone = e.clone();
			eClone.setName("Kartik");
			System.out.println(e);
			System.out.println(eClone);
		} catch (CloneNotSupportedException e1) {
			e1.printStackTrace();
		}		
		}

}
