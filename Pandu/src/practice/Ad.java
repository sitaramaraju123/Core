package practice;
import java.util.*;
public class Ad {

		public static void main(String[] args) {
			System.out.println("Enter any two number: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int num1 = sc.nextInt();
			Add ram = new Add(num,num1);
			
			
			System.out.println("Enter any two number: ");
		    int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			Add ashfaaq = new Add(num2,num3);
			
		
			System.out.println("Enter any two number: ");
		    int num4 = sc.nextInt();
			int num5 = sc.nextInt();
			Add madhu = new Add(num4, num5);
			System.out.println();
			
	       	madhu.display();
	       	ram.display();
	       	ashfaaq.display();
		}

	}
	class Add{
		 private int num1;
		 private int num2;
		 private int num3;
		 Add(int i, int j){
			 num1 = i;
			 num2 = j;
		 }
		 
		 Add(int i, int j, int k){
			 num1 = i;
			 num2 = j;
			 num3 = k;
		 }
		public void display() {
			System.out.println(num1+ " + " +num2+ " = " +(num1+num2)+" * "+(num1*num2));
		}
		
	}