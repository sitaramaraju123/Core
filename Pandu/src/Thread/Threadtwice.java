package Thread;

public class Threadtwice extends Thread{

	public static void main(String[] args) {
		Threadtwice t = new Threadtwice();
		t.start();
		t.start();  //Same thread Stating Again
		
	}
	public void run() {
		System.out.println("Processing...");
	}

}
