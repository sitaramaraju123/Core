package practice;
import java.util.*;
public class Del {
	
	public static void main(String args[]) 
    { 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your 6 Subjects marks");
	System.out.print("English: ");
	int english =sc.nextInt();
	
	System.out.print("Social: ");
	int social = sc.nextInt();
	
	System.out.print("Maths: ");
	int maths = sc.nextInt();
	
	System.out.print("Hindi: ");
	int hindi = sc.nextInt();
	
	System.out.print("Telugu: ");
	int telugu = sc.nextInt();
	
	System.out.print("Physics: ");
	int physics = sc.nextInt();
	
	Del s = new Del();
	objDemo sp = new objDemo();
    	s.obj(sp);
    	sp.english = english;
    	sp.social = social;
    	sp.maths = maths;
    	sp.hindi = hindi;
    	sp.telugu = telugu;
    	sp.physics=physics;
    	int total = sp.english+sp.social+sp.maths+sp.hindi+sp.telugu+sp.physics;
    	System.out.println("Total marks: "+total);
    	float per=total/6;
    	System.out.println("percentage: "+per);
    } 
    void obj(objDemo s2) {
    }

}
class objDemo{
	
	int english;
	int social;
	int maths;
	int hindi;
	int telugu;
	int physics;
	} 
