package practice;
import java.util.*;

public class Ash {
	Scanner sc= new Scanner(System.in);
	private int a = sc.nextInt();
	private int b = sc.nextInt();
	
	public Ash(){
	}
	
	public Ash(int a, int b){
	}

	public static void main(String[] args) {
		System.out.println("Enter two values for addition:");
		Ash add = new Ash();
		System.out.println("Ans: " + (add.a + add.b));
		
		System.out.println("Enter two values for substraction:");
		Ash sub = new Ash(add.a, add.b);
		System.out.println("Ans: " + (sub.a - sub.b));
		
		System.out.println("Enter two values for division:");
		Ash div = new Ash(add.a, add.b);
		System.out.println("Ans: " + (div.a / div.b));
		
		System.out.println("Enter two values for percentail:");
		Ash per = new Ash(add.a, add.b);
		System.out.println("Ans: " + (per.a % per.b));
	
	}
	}
