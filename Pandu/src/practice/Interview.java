package practice;

public class Interview {

	public static void main(String[] args) {
		B3 b = new B3();
		System.out.println(b.i);
	}

}
class A2{
	static int i=1111;
	static {
		i=i-- - --i;
		System.out.println(i);
	}
	{
		System.out.println("Inside A");
		i=i++ + ++i;
		System.out.println(i);
	}
}

class B3 extends A2{
	static {
		i=--i - i--;
	}
	{
		System.out.println("Inside B");
		i=++i + i++;
	}
}