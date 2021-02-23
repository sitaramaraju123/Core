package practice;
import java.util.*;
public class Sortabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String swap;
		System.out.println("Enter how many Strings you want: ");
		int num=sc.nextInt();
		String s[] = new String[num];
		System.out.println("Enter String names: ");
		for(int i=0; i<num; i++) {
			s[i]=sc.next();
		}
		
		for(int i=0; i<num; i++) {
			for(int j=i+1; j<num; j++) {
				if(s[i].compareTo(s[j])>0) {
					swap=s[i];
					s[i]=s[j];
					s[j]=swap;
				}
			}
		}
		for(int i=0;i<=num-1;i++) {
			System.out.println(s[i]);
		}
	}
}
