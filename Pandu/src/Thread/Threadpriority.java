package Thread;

public class Threadpriority extends Thread{

	public static void main(String[] args) {
		Threadpriority t1 = new Threadpriority();
		Threadpriority t2 = new Threadpriority();
		System.out.println(t1.MIN_PRIORITY);
		t1.start();
		System.out.println(t2.MAX_PRIORITY);
		t2.start();
	}

}
