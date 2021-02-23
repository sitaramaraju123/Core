package practice;
import java.util.*;
public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Ram", "sita", "Ashfaaq", "madhu","hari"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		String s1="";
		int count=0;
		for(int i=0; i<=name.length()-1; i++) {
			
			for(int j=0; j<=names.length-1;j++) {
				if(name.equalsIgnoreCase(names[j])) {
					s1=names[j];
					count++;
				}
			}
			
		}if(count==name.length()) {
		System.out.println("Your given name is in Array: " +s1);
		}else {
			System.out.println("Your given name is not in the given Array");
		}
	}

}
