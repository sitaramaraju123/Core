package practice;
import java.util.*;
public class DemogetsetInheretance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to add: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Y s = new Y();
		s.setA(a,b);
		s.r();
		s.setB(a,b);
		s.result();
		
	}

}
class X{
	int a;
	int b;

	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}

	public void setA(int a, int b) {
		this.a = a;
		this.b=b;
	}
	public void r() {
		System.out.println(a+b);
	}
	
}

class Y extends X{
	int c;
	int d;

	public int getC() {
		return c;
	}
	public int getD() {
		return d;
	}

	public void setB(int c,int d) {
		this.c= c;
		this.d = d;
	}
	public void result() {
		System.out.println(c*d);
	}
}