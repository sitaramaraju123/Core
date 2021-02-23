package practice;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=s.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==0 || j==5 || i==num-1) {
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
		
		System.out.println();
	}
		System.out.println();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==i+2 && i<4 || i+j==num-3 && j-1>=5 || i==0 && j<3 || i==0 && j>7
						|| j==0 && i<num/2 || j==num-1 && i<=num/2 || i-j==num/2 && j<5 
						|| i+j==num+num/2-1 && j>=5){
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
		
		System.out.println();  
	}
		System.out.println();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0 || i==num-1 || j==num-1) {
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
		
		System.out.println();
	}
		System.out.println();
	}

}
