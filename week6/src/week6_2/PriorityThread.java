package week6_2;

public class PriorityThread extends Thread {
	public PriorityThread(int priority,String name) {
        super(name);
        this.setPriority(priority);
    }
    public void run() {
    	 try {
             for (int i = 0; i < 5; i++) {
                 System.out.println(this.getName() + " with priority " + this.getPriority() + " is running.");
                 Thread.sleep(100); 
             }
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
	}

}
