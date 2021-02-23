package practice;

public class Abstractmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demoreturn a = new Demoreturn();
		System.out.println(a.method());
		a.method1();
	}

}
class Demoreturn{
	String name = "Ganesh";
	String name1="Ashfaaq";
	
	String method() {
		return name;
	}
	void method1() {
		System.out.println(name);
		System.out.println(name1);
	}
}