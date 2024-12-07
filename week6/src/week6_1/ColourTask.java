package week6_1;
import java.util.Random;

public class ColourTask implements Runnable {
	private String colours[]={"white", "blue", "black ", "green", "red", "yellow"};
	private Random r = new Random();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started");
		int ran = r.nextInt(0, colours.length);
		
		while(!colours[ran].equals("red")){
			System.out.println("Colour :"+colours[ran]);
			ran = r.nextInt(0, colours.length);
	
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}System.out.println("Colour :"+colours[ran]);
		
		System.out.println("Thread Ended");

	}
	public static void main(String args[]) {
		Thread ct = new Thread(new ColourTask(),"colour");
		
		System.out.println("Thread name: " + ct.getName());

		ct.start();

        
	}
}
