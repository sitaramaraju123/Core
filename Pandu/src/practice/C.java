package practice;
import java.util.*;
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any Character: ");
		String s = sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if((ch>=0 && ch<=48)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<128)) {
				count++;
				System.out.println(ch+ " -> "+count);
			}
		}
		if(count!=0) {
			System.out.println("Total Special characters are : "+count);
		}else {
			System.out.println("No special characters");
		}
	}

}
