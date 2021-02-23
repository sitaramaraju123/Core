package practice;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chain s = new chain();
		s.m();
	}

}

class chain{
	int id;
	String name;
	String last;
	int age;
	chain(String name, String last){
		this(123, 24);
		System.out.println("Hai");
		this.name=name;
		this.last=last;
	}
	chain(int id,int age){
		System.out.println("Hello");
		this.id=id;
		this.age=age;
	}
	chain(){
		this("Sitaramaraju" , "vadapalli");
		System.out.println("Bye");
	}
	void m() {
		System.out.println(id);
		System.out.println(age);
		m1();
	}
	void m1() {
		System.out.println(name+ " " +last);
	}
}
