package practice;
import java.util.*;
public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two values to Add: ");
		R add = new R();
		
		System.out.println("Enter two values to mul: ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int r = sc.nextInt();
		R mul = new R(s,r);
		
		
		System.out.println("Enter two values to div: ");
		add.I();
		
	}

}

class R{
	private int i;
	private int j;
	R(int s, int r){
		i=s;
		j=r;
		System.out.println(s+ " * " +r+" = "+(s*r));
	}
	R(){
		Scanner sc = new Scanner(System.in);
		 i = sc.nextInt();
		 j = sc.nextInt();
		System.out.println(i+ " + " +j+" = "+(i+j));
	}
	void I() {
		Scanner sc = new Scanner(System.in);
		 i = sc.nextInt();
		 j = sc.nextInt();
		System.out.println(i+ " / " +j+" = "+(i/j));
	}
}
