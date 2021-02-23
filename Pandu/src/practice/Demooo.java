package practice;
import java.util.*;
public class Demooo {
	int a=20;
	int b=30;
	int c=100;
	int d=200;
	Demooo(int i, int j){
		a=i;
		b=j;
	}
	Demooo(){
		System.out.println(a+ " + " +b+ " = " +(a+b));
	}
	
	public void main() {
		System.out.println(c+" + "+d+" = "+(c+d));
	}
	
	public static void main(String[] args) {
		
		System.out.println("Default constructer: ");
		Demooo i = new Demooo();
		System.out.println("Method values: ");
		i.main();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter parameterized constructer values: ");
		int a=s.nextInt();
		int b=s.nextInt();
		Demooo I = new Demooo(a,b);
		
		System.out.println(I.a+ " + " +I.b+ " = " +(I.a + I.b));
		
		}

}
