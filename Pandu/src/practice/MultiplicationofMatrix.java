package practice;

import java.util.Scanner;

public class MultiplicationofMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n[][] = new int[3][3];
		int n1[][]=new int[3][3];
		int n2[][]=new int[3][3];
		System.out.println("Enter 1st Table: ");
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n.length; j++) {
			n[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n.length; j++) {
				System.out.print(n[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Enter 2st Table: ");
		for(int k=0; k<n1.length; k++) {
			for(int l=0; l<n1.length; l++) {
				n1[k][l]=sc.nextInt();
			}
		}
		
		for(int k=0; k<n1.length; k++) {
			for(int l=0; l<n1.length; l++) {
				System.out.print(n1[k][l]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("multiplication of 2 arrays: ");
		for(int x=0;x<n2.length;x++) {
			
			for(int m=0; m<n2.length; m++) {
				int sum=0;
			for(int s=0;s<n2.length;s++) {
				sum+=n[x][s]*n1[s][m];
			}
			n2[x][m]=sum;
			}
		}
		for(int x=0; x<n2.length; x++) {
			for(int m=0; m<n2.length; m++) {
				System.out.print(n2[x][m]+ " ");
			}
			System.out.println();
		}
		
	}

}
