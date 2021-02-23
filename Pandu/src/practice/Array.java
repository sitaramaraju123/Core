package practice;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many elements to store: ");
		int num = sc.nextInt();
		int n[] = new int[num];
		int sum=0;
		System.out.println("enter elements: ");
		for(int i=0; i<n.length; i++) {
			n[i]=sc.nextInt();
			sum=sum+n[i];
		}
		System.out.println(sum);
	}

}
