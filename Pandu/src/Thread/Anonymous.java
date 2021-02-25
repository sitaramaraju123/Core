package Thread;
public class Anonymous 
{
	public static void main(String[] args)
	{	
		Runnable obj1=new Runnable()        
		{
			public void run() 
			{
				for(int i=1; i<=5; i++)
				{
					System.out.println("Hi");
					try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
					}
				}
		};
		Runnable obj2=new Runnable() {
			public void run() 
			{
				for(int i=1; i<=5; i++)
				{
					System.out.println("Hello");
					try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
					}
				}
		};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
	}
}
