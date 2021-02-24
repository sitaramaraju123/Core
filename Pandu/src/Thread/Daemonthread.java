package Thread;

//Daemon thread in java is a service provider thread that provides services to the user thread. 
//Its life depend on the mercy of user threads i.e. 
//when all the user threads dies, JVM terminates this thread automatically.

public class Daemonthread extends Thread{
	public static void main(String[] args) {
		Daemonthread d=new Daemonthread();
		Daemonthread d1=new Daemonthread();
		Daemonthread d2=new Daemonthread();
		d.setDaemon(true);
		d.start();
		d1.start();
		d2.start();
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread..");
		}else {
			System.out.println("User Thread");
		}
	}
}
