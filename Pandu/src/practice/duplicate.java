package practice;
import java.util.*;
import java.lang.*;
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any value: ");
		String name=sc.nextLine();
		System.out.print("Enter any character: ");
		char ch = sc.next().charAt(0);
		int count=0;
		for(int i=0; i<=name.length()-1; i++) {
			char ch1=name.charAt(i);
			if(ch==ch1) {
				count++;
			}
		}
		System.out.println(ch+ " is repeated " +count);

	}

}
