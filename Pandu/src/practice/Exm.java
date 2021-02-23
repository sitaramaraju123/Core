package practice;

public class Exm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		System.out.println(a+" "+b);
		F s = new F(a);
		F s1 = new F(b);
		new A1().X(s,s1);
		System.out.println(s.x+" "+s1.x);
	}
}

class F{
	int x;
	F(int a) {
		x=a;
	}
}

class A1{
	int x;
	int y;
	void X(F i, F j) {
		int t;
		t = i.x;
		i.x = j.x;
		j.x = t;
	}
}