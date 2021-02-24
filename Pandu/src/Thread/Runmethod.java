package Thread;

public class Runmethod extends Thread{

	public static void main(String[] args) {
		Runmethod r = new Runmethod();
		r.run();        //if Not Calling With Start() then it can't be called as Thread object...
		                // it just called as normal object..
	}
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}

}
