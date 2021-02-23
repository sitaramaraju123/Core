package practice;
import java.util.*;
import java.lang.*;
public class palendrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Palendrum name: ");
		String name = sc.next();
		String str="";
		for(int i=name.length()-1; i>=0; i--) {
			str=str+name.charAt(i);
		}if(name.equals(str)) {
			System.out.print(str+ " is a palendrum");
		}else {
			System.out.print(name+ " not a palendrum");
		}
	}

}
