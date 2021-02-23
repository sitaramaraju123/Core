package practice;
import java.util.*;
import java.lang.*;
public class vowels{

public static void main(String[] args){
	
Scanner s = new Scanner(System.in);

System.out.print("Enter few Alphabets: ");

char ch[]=s.nextLine().toCharArray();

char ch1[]={'a','e','i','o','u'};

for(int i=0;i<ch1.length;i++){

int count=0;

for(int j=0;j<ch.length;j++){

if(ch1[i]==ch[j]){

count++;

}

}

System.out.println(ch1[i]+ " -> " +count);

}

}

}

