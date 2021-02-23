package practice;
import java.util.*;
public class elections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int seats[]=new int[5];
		System.out.println("Enter Bjp seats: ");
		seats[0]=sc.nextInt();
		System.out.println("Enter Trs seats: ");
		seats[1]=sc.nextInt();
		System.out.println("Enter Ycp seats: ");
		seats[2]=sc.nextInt();
		System.out.println("Enter Tdp seats: ");
		seats[3]=sc.nextInt();
		System.out.println("Enter Janasena seats: ");
		seats[4]=sc.nextInt();
		
		int num = 0;
		
		for(int i=0; i<seats.length; i++) {
			if(seats[i]>num) {
				num=seats[i];
			} 
		}
		
		if(seats[0]==num) {
			System.out.println("Bjp won by "+num+ " seats");
		}else if(seats[1]==num) {
			System.out.println("Trs won by "+num+ " seats");
		}else if(seats[2]==num) {
			System.out.println("Ycp won by "+num+ " seats");
		}else if(seats[3]==num) {
			System.out.println("Tdp won by "+num+" seats");
		}else if(seats[4]==num) {
			System.out.println("Janasena won by "+num+" seats");
		}
	}

}
