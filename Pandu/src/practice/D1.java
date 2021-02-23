package practice;
import java.util.*;
public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any name: ");
		String name = sc.next();
		for(int i=0; i<name.length();i++) {
			char ch[] = name.toCharArray();
			int s = name.indexOf(ch[i]);
			System.out.println(s);
		}
	}

}
