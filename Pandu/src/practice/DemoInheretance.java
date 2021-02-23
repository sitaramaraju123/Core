package practice;
import java.util.*;
public class DemoInheretance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person details: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Age: ");
		int age = sc.nextInt();
		System.out.print("Height: ");
		float height = sc.nextFloat();
		System.out.print("Weight: ");
		int weight = sc.nextInt();
		System.out.print("Job: ");
		String job = sc.next();
		System.out.print("Salary: ");
		int salary = sc.nextInt();
		System.out.println("Check out your details...........");
		Per p = new Per(name, age, height, weight, job, salary);
		p.result();
		System.out.println("------------------");
		System.out.println();
		System.out.println("Enter person details: ");
		System.out.print("Name: ");
		String name1 = sc.next();
		System.out.print("Age: ");
		int age1 = sc.nextInt();
		System.out.print("Height: ");
		float height1 = sc.nextFloat();
		System.out.print("Weight: ");
		int weight1 = sc.nextInt();
		System.out.print("Job: ");
		String job1 = sc.next();
		System.out.print("Salary: ");
		int salary1 = sc.nextInt();
		System.out.println("Check out your details...........");
		System.out.println();
		Per p1 = new Per(name1,age1,height1,weight1,job1,salary1);
		p1.result();
	}

}
class Human{
	String name;
	int age;
	float height;
	int weight;
//	public Human(String name,int age, float height, int weight) {
//		this.name = name;
//		this.age=age;
//		this.height = height;
//		this.weight = weight;
//		}
	void D(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
	}	
}

class Per extends Human{
	String job;
	int salary;
	public Per(String name, int age, float height, int weight, String job, int salary) {
		super.name = name; 
		super.age=age; 
		super.height=height; 
		super.weight=weight;
		this.job = job;
		this.salary = salary;
	}
	void result() {
		super.D();
		System.out.println("Job: "+job);
		System.out.println("Salary: "+salary);
	}
}