package practice;
import java.util.*;
public class DemoInnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName: ");
		String name = sc.next();
		System.out.println("Enter Password: ");
		String pwd = sc.next();
		Outer a = new Outer();
		a.En(name,pwd);
	}

}

class Outer{
  private String name;
  void En(String name ,String pwd) { 
	  this.name=name;
	  if(name.equals(name) && pwd.equals("ramaraju")) {
		  System.out.println("Admin Login Success");
		  Inner c = new Inner();
		  c.out();
	  }else if(name.equals(name) && pwd.equals("user")){
		  System.out.println("User Login Success");
		  Inner c = new Inner();
		  c.out();
	  }else {
		  System.out.println("Invalid details");  
	  }
	  }
  private class Inner{
	  void out() {
		  System.out.println("Welcome "+name);
	  }
  }

}