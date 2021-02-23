package practice;
import java.util.*;
public class Table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=sc.nextInt();
		Tab s2 = new Tab();
		s2.x=a;
		s2.display();
	}
	
	
	}

class Tab{
	int x;
	void display() {
		for(int i=1;i<=10;i++) {
			System.out.println(x+" * "+i+" = "+(x*i));
		}
}
}
