package practice;
import java.util.*;
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter1 a =new Outter1();
		a.m416();
	}

}
class Outter1{
	void m416() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name: ");
		String name = sc.nextLine();
		Inner1 a =new Inner1(name);
		a.M1();
	}
	private class Inner1{
		String name;
		Inner1(String name){
			this.name=name;
		}
		void M1() {
			if(name.equalsIgnoreCase("Madhu")) {
				System.out.println("Tell me Your self Madhu");
				System.out.println("1.Hai My Self MadhuSudhan");
				System.out.println("2.I am From Karnool");
				System.out.println("3.I Completed My B-tech in 2016 from one Collage");
				System.out.println("4.Currently I am Working As a Softerware Develpoer in "
						+ "Regnent Softeware pvt since 2 years");
				System.out.println("5.My hobies are Doing Programs every Day..");
			}
		}
	}
}
