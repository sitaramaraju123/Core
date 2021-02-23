package practice;
import java.util.*;
public class trial {
	static int a =7;
	int c =8;
	void m4() {
		System.out.println(a);
		System.out.println(c);
	}
	static void m1() {
		int x=10;                //Static method
		System.out.println(x);
	}
	
	void m2() {          //Instance method
		
		int y=20;          //local variable
		System.out.println(y);
	}
	
	static int x1=30;     //Static variable 
	
	int x2 = 40;          //Instance variable      
	public static void main(String[] args) {  //Static method
		
		 //main method storage
		
		trial s = new trial(); //heap storage
		
		++s.a;      //static variable using per increment
		++s.c;     //instance variable using per increment
		s.m4();
		
		trial.m1(); 
		
		s.m2();
		
		System.out.println(trial.x1);  //main method area
		
		System.out.println(s.x2);  // heap
		T1 s1 = new T1(50,60);  //heap
		s1.m3(80, 90);    //heap
		System.out.println();
		s.m4(s1);   //heap
	}
	
	void m4(T1 s3) {
		System.out.println(s3.a);
		System.out.println(s3.b);
	}

}

class T1{          //Instance class
	int a;
	int b;
	T1(int a,int b){  //2 parameter Constructor
		this.a=a;    //this statement
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
	
	void m3(int a1, int b1) {   // 2 parameter method
		a=a1;
		b=b1;
		System.out.println(a);
		System.out.println(b);
	}
	
}

