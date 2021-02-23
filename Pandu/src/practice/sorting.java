package practice;
import java.util.*;
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int n[] = new int[num];
		int swap=0;
		System.out.println("Enter sorting numbers: ");
		for(int i=0; i<n.length; i++) {
			n[i]=sc.nextInt();
		}
		for(int i=0; i<n.length; i++) {
			for(int j=i+1; j<n.length; j++) {
				if(n[i]>n[j]) {
			        swap=n[i];
					n[i]=n[j];
					n[j]=swap;
					
				} 
				
			}
			
	}
		for(int i=0; i<n.length; i++) {
		System.out.println(n[i]);
		}
	}

}
