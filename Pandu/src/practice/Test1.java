package practice;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a palendrum name: ");
		String sr=s.nextLine();
		String num="";
		StringBuffer sb = new StringBuffer(sr);
		sb.reverse();
		String se = sb.toString();
		if(sr.equals(se)) {
			System.out.print(num+ " is a palendrum");
			}else {
				System.out.print(sr+ " is not a palendrum");
			}
	}

}
