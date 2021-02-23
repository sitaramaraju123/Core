package practice;

public class Newex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun d = new fun();
		d.T();
	
	}

}
class fun{
	String job="Web developer";
	int salary = 50000;
	void T() {
		cufk c=new cufk();
		c.main();
		System.out.println("Job: "+job);
		System.out.println("Salary: "+salary);
	}
}
class cufk{
	String name="Raj";
	int id = 552;
	void main() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
}