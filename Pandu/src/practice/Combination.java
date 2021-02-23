package practice;
import java.util.*;
public class Combination {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value: ");
		String s=sc.next();
		int fact =1;
		//int count=0;
		for(int i=1; i<=s.length();i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
