package practice;
import java.util.*;
public class IsinRelationSetget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter Bike name: ");
		String bike = sc.next();
		System.out.print("Enter Mobile name: ");
		String mobile = sc.next();
		Child c = new Child();
		c.setname(name, bike);
		c.setname(name, bike, mobile);
		
	}

}
class Parents{
	String name;
	String bike;
	String mobile;
	void setname(String name,String bike) {
		this.name=name;
		this.bike=bike;
	}
	String getname() {
		return name;
	}
	String getbike() {
		return bike;
	}
	void setname(String name, String bike,String mobile) {
		System.out.println("Name: "+name);
		System.out.println("Bike: "+bike);
	}
}  
class Child extends Parents{
	@Override
	void setname(String name, String bike, String mobile) {
		super.name=name;
		super.bike=bike;
		super.mobile=mobile;
		System.out.println("Name: "+name);
		System.out.println("Bike: "+bike);
		System.out.println("Mobile: "+mobile);
	}
}