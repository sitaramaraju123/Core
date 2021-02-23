package Thread;

public class ExampleThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setPriority(1);
		t.setName("ram");
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		
		Dthread t1 =  new Dthread("Raj");
		t1.start();
		t1.setPriority(5);
		System.out.println(t1.getPriority());
		
		Exam f = new Exam();
		Thread g = new Thread(f);
		g.start();
		g.setName("Ash");
		g.setPriority(10);
		System.out.println(g.getPriority());
	
	}

}
class Dthread extends Thread{
	public Dthread(String name) {
		super(name);
	}
	
		public void run() {
			Thread t = Thread.currentThread();
			System.out.println(t.getName());
		
			
		}
	
}
class Exam implements Runnable{

	@Override
	public void run() {
		Thread e=  Thread.currentThread();
		System.out.println(e.getName());
		
		
	}
}

	
