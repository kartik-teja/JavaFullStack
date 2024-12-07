package week6_1;

public class Task implements Runnable {
	private String threadName;
	Task(String threadName){
		this.threadName =threadName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread " + threadName + " starting");
		try {
            
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " finishing");
	}

}
