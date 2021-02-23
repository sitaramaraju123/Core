package practice;
import java.util.*;
public class div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x[][]=new int[3][3];
		int y[][]=new int[3][3];
		int z[][]=new int[3][3];
		System.out.println("Enter 1st Table: ");
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x.length; j++) {
			x[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x.length; j++) {
				System.out.print(x[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Enter 2st Table: ");
		for(int i=0; i<y.length; i++) {
			for(int j=0; j<y.length; j++) {
			y[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<y.length; i++) {
			for(int j=0; j<y.length; j++) {
				System.out.print(y[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Division of 2 arrays:");
		for(int i=0;i<z.length;i++) {
			
			for(int j=0; j<z.length; j++) {
				z[i][j]=x[i][j]/y[i][j];
		}
	}
		for(int i=0;i<z.length;i++) {
			for(int j=0; j<z.length; j++) {
				System.out.print(z[i][j]+ "   ");
			}
			System.out.println();
			}
			
		}
}
