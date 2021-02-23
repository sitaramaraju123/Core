package practice;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to get a names: ");
		int num = sc.nextInt();
		boolean n=false;
		int count = 0;
		String names[] = new String[num];
		System.out.println("Enter any names: ");
		for(int i=0; i<names.length; i++) {
			names[i]=sc.next();
		}
		
		System.out.println("Enter a name your Searching: ");
		String name = sc.next();
		for(int i=0; i<names.length; i++) {
			if(name.equalsIgnoreCase(names[i])) {
				count++;
				System.out.println("Position of given name is: "+(i+1));
				n=true;
			}
		}
		System.out.println(name+ " is repeated "+count+ " times     ");
		if(!n) {
		System.out.println("Your search was not found");
		}
			
	}

}
