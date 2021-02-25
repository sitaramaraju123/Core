package Thread;
class A
{
	int num;
	boolean valueSet = false;
	public synchronized void put(int num) 
	{
		while(valueSet)
		{
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("Put: "+num);
		this.num = num;
		valueSet=true;
	}
	public synchronized void get() 
	{
		while(!valueSet) {
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("Get: "+num);
		valueSet=false;
		notify();
	}
	
}
class Parents implements Runnable{
	A a;
	public Parents(A a) {
		this.a = a;
		Thread t = new Thread(this,"Parents");
		t.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}

class Child implements Runnable{
	A a;

	public Child(A a) {
		this.a = a;
		Thread t = new Thread(this,"Child");
		t.start();
	}
	public void run() {
		while(true) {
			a.get();
			try {Thread.sleep(5000);}catch(Exception e) {}
		}
	}
	
}
public class WaitNotify {

	public static void main(String[] args) {
	A a=new A();
	new Parents(a);
	new Child(a);
	}

}
