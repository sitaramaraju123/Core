package practice;
import java.util.*;
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Word: ");
		String name = sc.nextLine();
		String str="";
		int count=0;
		for(int i=name.length()-1;i>=0;i--) {
			str+=name.charAt(i);
			if(name.equals(str)) {
				count++;
			}
		}
		if(count!=0) {
		System.out.println(str);
	}else {
		System.out.println("Not a palendrum");
	}
	}
}
