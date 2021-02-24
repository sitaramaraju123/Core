package Thread;

public class Sleepthread extends Thread{

	public static void main(String[] args) {
		Sleepthread s = new Sleepthread();
		Sleepthread s1 = new Sleepthread();
		Thread t = Thread.currentThread();
		t.setName("Before Sleeping");
		System.out.println(t);
		s.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {   //Thread Sleeping
			e.printStackTrace();
		}
		Thread t1 = Thread.currentThread();
		t1.setName("After Sleeping");
		System.out.println(t1);
		s1.start();
	}
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {   //Created Thread Sleep
				e.printStackTrace();
			}
		}
	}
}
