package practice;
import java.util.*;
public class Grads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total subjects: ");
		int num = sc.nextInt();
		int marks[] = new int[num];
		int total=0;
		float per=0;
		System.out.println("Enter subject marks");
		for(int i=0; i<marks.length; i++) {
			marks[i]=sc.nextInt();
			total = total+marks[i];
			per=((total/num*100)*1/100);
		}
		if(per <=30) {
			System.out.println("Total marks: "+total+" Percentage: "+per+" You are failed");
		} else if (per>30 && per <= 40){
			System.out.println("Total marks: "+total+" Percentage: "+per+
					" You got \"D\" grade");
		}else if(per>40 && per<=50) {
			System.out.println("Total marks: "+total+" Percentage: "+per+
					" You got \"C\" grade");
		}else if(per>50 && per<=60) {
			System.out.println("Total marks: "+total+" Percentage: "+per+
					" You got \"B\" grade");
		}else if(per>60 && per<=100) {
			System.out.println("Total marks: "+total+" Percentage: "+per+
					" You got \"A\" grade");
		}

	}

}
