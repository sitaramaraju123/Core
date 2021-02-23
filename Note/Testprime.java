public class Testprime{

public static void main(String [] args){

int i=15;

int j=2;

int count=0;

while(j<=i/2){

if(i%j==0){

count++;

}

j++;

}

if(count==0){

System.out.println(i+ " is a prime");

}else{

System.out.println(i+ " Not a prime");

}

}

}