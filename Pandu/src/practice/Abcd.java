package practice;
import java.util.*;
public class Abcd {
	
	public static void main(String[] args) {
		cd a = new cd();
		dc b = new dc();
		dc1 b1 = new dc1();
		a.cb();
		a.d(b);
		a.d1(b1);
	}
}
class cd{
	int a=4;
	int b=5;
	
	void cb() {
		System.out.println("Addition of two: "+(a+b));
	}
	void d(dc s1) {
		System.out.println("Multiplication of two: "+(s1.a+" "+s1.b));
	}
	void d1(dc1 s2) {
		System.out.println("Substraction of two: "+(s2.a-s2.b));
	}
}

class dc{
	int a=10;
	int b=20;
}

class dc1{
	int a=5;
	int b=4;
	
	
}