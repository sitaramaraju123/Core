package Thread;

public class Joinmethods extends Thread{

	public static void main(String[] args) {
		Joinmethods j = new Joinmethods();
		Joinmethods j1 = new Joinmethods();
		Joinmethods j2 = new Joinmethods();
		j.start();
		try {j.join();}catch(Exception e) {e.printStackTrace();}  //The join() method waits for a thread to die
		j1.start();
		j2.start();

	}
	 public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(i);  
		  }  
		 }  
}
