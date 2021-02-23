package practice;
import java.util.*;
import java.lang.*;
public class buffer {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 1st name: ");
		String st = s.nextLine();
		System.out.print("Enter 2nd name: ");
		String se = s.nextLine();
		StringBuffer sb=new StringBuffer(st);
		sb.append(se);
		System.out.println(sb);
	}

}
