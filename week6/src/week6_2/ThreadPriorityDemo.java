package week6_2;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread maxP = new PriorityThread(Thread.MAX_PRIORITY, "Max");
        PriorityThread minP = new PriorityThread(Thread.MIN_PRIORITY, "Min");
        PriorityThread norP = new PriorityThread(Thread.NORM_PRIORITY, "Norm");
        maxP.start();
		minP.start();
		norP.start();
	}

}
