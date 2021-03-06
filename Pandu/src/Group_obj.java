package Collections;
import java.util.*;
class Student{
	int rollno;
	String name, Address;
	Student(int rollno, String name, String Address){
		this.rollno=rollno;
		this.name=name;
		this.Address=Address;
	}
	public String toString() {
		return " "+rollno+" "+name+" "+Address;
	}
}

public class Group_obj {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
		int num = sc.nextInt();
		String name=sc.next();
		String address = sc.next();
		Student s1 = new Student(num, name, address);
		std.add(s1);
		if(1==num) {
			System.out.println(std.toString());
		}
		}
		System.out.println(std.toString());
		for(Student s:std) {                 
			System.out.println(s.rollno+" "+s.name+" "+s.Address);
		}
	}

}
