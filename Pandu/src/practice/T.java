 package practice;
import java.util.*;
public class T {

	public static void main(String[] args) {
		System.out.println("Enter your name and id: ");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		int id1 = sc.nextInt();
		EmpDemo ram = new EmpDemo(name1,id1);
		
		
		System.out.println("Enter your name and id: ");
		String name = sc.next();
		int id = sc.nextInt();
		EmpDemo ashfaaq = new EmpDemo(name,id);
		
	
		System.out.println("Enter your name and id: ");
		String name2 = sc.next();
		int id2 = sc.nextInt();
		EmpDemo madhu = new EmpDemo(name2, id2);
		System.out.println();
		
       	madhu.display();
       	ram.display();
       	ashfaaq.display();
	}

}
class EmpDemo{
	 private int id;
	 private String name;
	 
	 EmpDemo(String firstname, int num){
		 name = firstname;
		 id = num;
	 }
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
}