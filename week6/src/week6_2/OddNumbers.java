package week6_2;

public class OddNumbers implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=1;i<20;i+=2) {
			System.out.println(i);
		}
	}

}
