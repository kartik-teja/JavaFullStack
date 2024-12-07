package week6_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new Task("Scooby"), "Scooby");
        Thread thread2 = new Thread(new Task("Shaggy"), "Shaggy");

        thread1.start();
        thread2.start();

        System.out.println("Thread 1 name: " + thread1.getName());
        System.out.println("Thread 2 name: " + thread2.getName());

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Both threads have finished.");
    }

}
