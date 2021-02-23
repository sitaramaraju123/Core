package practice;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub a = new Sub();
		Super b = a;    // Upper case //widening
		b.m();
		
		System.out.println();
		Super a1 = new  Sub();  // Down case //narrowing
		Sub b1 = (Sub) a1;
		b1.m();
		b1.m1(); 
		
		System.out.println();
		Subsub c = new Subsub(); // Upper case Override
		Super d = new Subsub();
		d.m();
	}

}
class Super{
	void m() {
		System.out.println("Super class");
	}
}

class Sub extends Super{
	void m1() {
		System.out.println("Sub Class");
	}
}

class Subsub extends Super{
	void m() {
		System.out.println("Super to Sub ");
	}
}