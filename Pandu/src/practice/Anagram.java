package practice;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st name: ");
		String s1=sc.next();
		System.out.println("Enter 2nd name: ");
		String s2 = sc.next();
		//String s3="";
		int count=0;
		char ch[] = s1.toCharArray();
    	char ch1[]= s2.toCharArray();
    	int i=0;
	    if(ch.length == ch1.length) {
	    	 for( ;i<ch.length;i++) {
	 	    	for(int j=0; j<ch1.length; j++) {
	 	    		if(ch[i]==(ch1[j])) {
	 	    		//s3=s3+ch[i];
	 	    		count++; 	
	 	    		ch1[j]='0';
	 	    		}
	 	    }
	 	    }
	   
	    if(count==ch.length) {
	    	System.out.println("Anagram");
	    }else {
	    	System.out.println("Not a Anagram");
	    }
	    }else {
	    	System.out.println("Not Anagram");
	    }
	}

}
