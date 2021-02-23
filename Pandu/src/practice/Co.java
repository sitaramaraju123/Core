package practice;
import java.util.*;
import java.lang.*;
public class Co {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d = new Scanner(System.in);
		System.out.print("Enter any value: ");
		String s = d.nextLine();
		System.out.print("Enter same value: ");
		String se = new String(d.nextLine());
	//=================================================	
		//Equals method:-
		
		if(s.equals(se)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	//=================================================
		//EqualsIgnoreCase method:- 
		
		if(s.equalsIgnoreCase(se)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		}
}
