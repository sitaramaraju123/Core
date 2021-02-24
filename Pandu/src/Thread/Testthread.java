package Thread;

public class Testthread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		for(int i=0;i<=4;i++) {
			System.out.println(t);
			System.out.println(t.getName());
			Get g = new Get("One");
			g.setPriority(10);
			g.start();
		}

	}

}
class Get extends Thread{
	Get(String name){
		super(name);
	}
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
	}
}
