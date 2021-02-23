package practice;
import java.util.*;
public class hari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Name: ");
		String s1=sc.next();
		String s2="hari";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Full form of Hari: ");
			System.out.println("H :- 'Handsome' ");
			System.out.println("A :- 'Attractive' ");
			System.out.println("R :- 'Romantic' ");
			System.out.println("I :- 'Inteligent' ");
		}else {
			System.out.println("Because your not a handsome guy like " + s2);
		}
	}

}
