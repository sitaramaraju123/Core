package Thread;

public class Threadpriority extends Thread{

	public static void main(String[] args)
	{	Thread t1 = new Thread(() -> 
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hi ->"+ Thread.currentThread().MIN_PRIORITY);
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
		},"Raj");
	Thread t2 = new Thread(() -> 
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello ->"+ Thread.currentThread().MAX_PRIORITY);
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
	},"Ram");
//	t1.setName("hai Thread");
//	t2.setName("Hello Thread");
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
	}

}
