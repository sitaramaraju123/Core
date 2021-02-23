package practice;

public class DemoAbstract {
	public static void main(String[] args) {
		
	Carss A = new Audii("Ap-26-Ap-1996", 4);
	Audii.name();
	System.out.println("Regno: "+A.regno);
	System.out.println("Wheels: "+A.wheels);
	A.Tank();
	A.steering();
	A.breaking_System();
	System.out.println("---------------------------");
	Carss B = new Aulto("Ap-20-as-2323",4);
	Aulto.name();
	System.out.println("Regno: "+B.regno);
	System.out.println("Wheels: "+B.wheels);
	B.Tank();
	B.steering();
	B.breaking_System();
	System.out.println("----------------------------");
	Carss C = new Ducati("Ap-16-at-7717",2);
	Ducati.name();
	System.out.println("Regno: "+C.regno);
	System.out.println("Wheels: "+C.wheels);
	C.Tank();
	C.steering();
	C.breaking_System();
}
}
abstract class Carss{
	String regno;
	int wheels;
	public Carss(String regno, int wheels) {
		this.regno=regno;
		this.wheels=wheels;
	}
	void Tank() {
		System.out.println("Fuel Tank");
	}
	abstract void steering();
	abstract void breaking_System();
}
class Audii extends Carss{
	public Audii(String regno, int wheels) {
		super (regno,wheels);
	}
	
	static void name() {
		System.out.println("Car name: Audi Q8");
	}

	@Override
	void steering() {
		System.out.println("Power steering");
		
	}

	@Override
	void breaking_System() {
		System.out.println("Abs Breaking System");
		
	}
}
class Aulto extends Carss{

	public Aulto(String regno, int wheels) {
		super(regno, wheels);
		
	}
	static void name() {
		System.out.println("Car name: Maruti Suzuki Alto 800");
	}
	@Override
	void steering() {
		System.out.println("Manuel steering");
		
	}

	@Override
	void breaking_System() {
		System.out.println("Drum Breaking System");
		
	}
	
}
class Ducati extends Carss{

	public Ducati(String regno, int wheels) {
		super(regno, wheels);
		
	}
	
	static void name() {
		System.out.println("Bike Name: Ducati Panigale V2");
	}
	
	@Override
	void steering() {
		System.out.println("Short Handle");
		
	}

	@Override
	void breaking_System() {
		System.out.println("Disk breaking System");
		
	}
	
}