package practice;
import java.util.*;
public class Studentgetset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name = sc.next();
		System.out.print("Enter Student Age: ");
		int age = sc.nextInt();
		System.out.print("Enter Student Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Student Address: ");
		String Address = sc.next();
		System.out.print("Enter your Marks: ");
		int marks = sc.nextInt();
		Student c = new Student();
		c.setname(name);
		c.setint(age);
		c.setid(id);
		c.setaddress(Address);
		c.setmarks(marks);
		System.out.println("Student Name: "+c.getname());
		System.out.println("Student Age: "+c.getage());
		System.out.println("Student Id: "+c.getid());
		System.out.println("Student Address: "+c.getaddress());
		System.out.println("Student Marks: "+c.getmarks());
		System.out.println();
		c.name();
		c.age();
		c.id();
		c.address();
		c.marks();

	}

}
class Student{
	String name;
	int age;
	int id;
	String address;
	int marks;
	void setname(String name) {
		this.name = name;
	}
	String getname() {
		return name;
	}
	void name(){
		System.out.println(getname());
	}
	void setint(int age) {
		this.age=age;
	}
	int getage() {
		return age;
	}
	void age() {
		System.out.println(getage());
	}
	void setid(int id) {
		this.id=id;
	}
	int getid() {
		return id;
	}
	void id() {
		System.out.println(getid());
	}
	void setaddress(String address) {
		this.address=address;
	}
	String getaddress() {
		return address;
	}
	void address() {
		System.out.println(getaddress());
	}
	void setmarks(int marks) {
		this.marks=marks;
	}
	int getmarks() {
		return marks;
	}
	void marks() {
		System.out.println(getmarks());
	}
}