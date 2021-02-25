package Thread;

public class ThreadIsalive {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> 
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("Hi");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
			});
		Thread t2 = new Thread(() -> 
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
			});
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
		
		System.out.println("Before Task for t1 Thread is Alive: "+t1.isAlive());
		System.out.println("Before Task for t2 Thread is Alive: "+t2.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println("After Task for t1 Thread is Alive: "+t1.isAlive());
		System.out.println("After Task for t2 Thread is Alive: "+t2.isAlive());
		System.out.println("Bye");

	}

}
