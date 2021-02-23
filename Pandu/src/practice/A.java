package practice;
import java.util.*;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any name: ");
		String name = sc.next();
		System.out.println("Enter any character: ");
		char ch = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch1 = name.charAt(i);
			if(ch1==ch) {
				count++;
			}
			
		}
		if(count!=0) {
			System.out.println(ch+ " is repeated: "+count);
		}else {
			System.out.println("Your entered character was invalid");
		}
	}

}
