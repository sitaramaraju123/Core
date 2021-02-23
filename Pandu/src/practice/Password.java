package practice;
import java.util.*;
public class Password {
	public static void main(String[] args) {
		for(int j=0; j<=4; j++) {
		int count=0, count1=0, count2=0, count3=0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String name = sc.next();
		for(int i=0; i<name.length(); i++) {
		char ch = name.charAt(i); 
        if (ch >= 'A' && ch <= 'Z') 
        	count++; 
        else if (ch >= 'a' && ch <= 'z') 
        	count1++; 
        else if (ch >= '0' && ch <= '9') 
        	count2++; 
        else
        	count3++; 
		}
		if(count>0 && count1>0 && count2>0 && count3>0) {
			System.out.println("Login");
			break;
		}else {
			System.out.println("You have to give Atleast one Uppercase(A to Z), lowercase(a to z), any Numbers, And  SpecialCharacter(@  ");
		}
		}
	}
}
