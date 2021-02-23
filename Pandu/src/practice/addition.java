package practice;
import java.util.*;
public class addition {
	Scanner sc=new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 public addition(int a, int b) {
		 
	 }
	addition(){
		System.out.println(a+" + "+b+" = " +(a+b));
	}

	public static void main(String[] args) {
		System.out.println("Addition of two numbers: ");
		addition obj = new addition();
		System.out.println("Multiplication of two number: ");
		addition obj1 = new addition(obj.a,obj.b);
		System.out.println(+obj1.a+" * "+obj1.b+" = "  +(obj1.a*obj1.b));
		System.out.println("Division of two numbers: ");
		addition obj2 = new addition();
		System.out.println((obj2.a)/(obj2.b));
	}

}
//class division {
//	Scanner sc=new Scanner(System.in);
//	 int a = sc.nextInt();
//	 int b = sc.nextInt();
//	public division(int a, int b) {
//		
//	}
//}
