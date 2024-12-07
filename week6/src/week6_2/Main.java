package week6_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread even = new Thread(new EvenNumbers(),"Even Numbers");
		Thread odd = new Thread(new OddNumbers(),"Odd Numbers");

		even.start();
		
		try {
			even.join();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		odd.start();
	}

}
