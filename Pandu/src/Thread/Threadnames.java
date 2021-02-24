package Thread;

public class Threadnames extends Thread {

	public static void main(String[] args) {
		Threadnames t1=new Threadnames();  
		Threadnames t2=new Threadnames();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		   
		  t1.start();  
		  t2.start();  
		  
		  t1.setName("Raj..");  
		  System.out.println("After changing name of t1:- "+t1.getName());  
		 } 
}
