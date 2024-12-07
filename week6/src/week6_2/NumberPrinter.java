package week6_2;

public class NumberPrinter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started");
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
			if (i ==5) {				
				try {
					Thread.sleep(5000);
				}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		System.out.println("Thread ended");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new NumberPrinter(),"NumberStream1-10");
		System.out.println("Thread name: " + t.getName());

		t.start();
	}

}
