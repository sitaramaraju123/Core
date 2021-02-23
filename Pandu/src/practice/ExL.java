package practice;

public class ExL {

	 public static void main(String[] args) {
		 G a = new G();
		 try {
			 a.m1();
		 }
		 catch(H e) {
			 System.out.println(e.getMessage());
		 }
}
}

class G{
	void m1() throws H {
		H b = new H("Tarun");
		try {
			b.m();
		} catch (Just e) {
			System.out.println(e.getMessage());
		}
		throw b;
	}
}

class H extends Exception{
	void m() throws Just {
		Just a  = new Just("Kalyan");
		try {
			a.o();
		}catch(Break e) {
			System.out.println(e.getMessage());
		}
		throw a;
	}
	H(String name){
		super(name);
	}
}

class Just extends Exception{
	Just(String name){
		super(name);
	}
	void o() throws Break {
		Break a = new Break("Break the rules...");
		throw a;
	}
}

class Break extends Exception{
	Break(String name){
		super(name);
	}
}
