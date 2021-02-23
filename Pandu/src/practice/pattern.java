package practice;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=s.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==0 || j==0 && i<num/2 || i==5 || j==num-1 && i>num/2 || i==num-1) {
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
		//=======================================
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
		//========================================
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==0 || j==5 ) {
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
		//========================================
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0 || i==0 || j==num-1 || i==5 ) {
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
		
		//=========================================
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0|| i==0 && j<num-2 || j==num-2 && i<num/2 || i==4 && j<num-2|| i-3==j) {
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
	//================================================	
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0 || i==0 || j==num-1 || i==5){
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
		//===========================================
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0 && i>=num/2 || i-j==num/2 || i+j==num+num/2-1 || j==num-1 && i>num/2){
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
		//===========================================
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0 || i==0 || j==num-1 || i==5 ) {
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
		//==============================================
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0|| i==0 && j<num-2 || j==num-2 && i<num/2 || i==4 && j<num-2|| i-3==j) {
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
		//===========================================
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==0 || i==0 || j==num-1 || i==5 ) {
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
		//===========================================
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(j==5 || i==0 || i==num-1 && j<num/2 || j==0 && i>num/2) {
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
		//===========================================
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
