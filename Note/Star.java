public class Star{

public static void main(String[] args){

int i=9,j=2,count=0;

while(j<=i/2){

if(i%j==0){

count++;

}

j++;

}

if(count==0){

System.out.println(i+" is a prime");

}else if(i%2==0){

System.out.println(i+" is a even");

}else{

System.out.println(i+" is a odd");

}

}

}