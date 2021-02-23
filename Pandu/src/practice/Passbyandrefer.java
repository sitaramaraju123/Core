package practice;
import java.util.*;
public class Passbyandrefer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers to Swap: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before Swapping: "+x+ " "+y);
		new change().swap(x, y);
		System.out.println("After Swapping: "+x+ " "+y);
	}

}
class change{
	int temp;
	void swap(int x, int y) {
		
		  temp=x; 
		  x=y; 
		  y=temp;
		 
			/*
			 * x=x-y; y=x+y; x=y-x;
			 * 
			 */
	}
}