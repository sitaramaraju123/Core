public class Palendrum{

public static void main(String [] args){

int num=151, total=0, n, original=num;

while(original!=0){

n=original%10;

total=(total*10)+(n);

original=original/10;

}

if(total==num){

System.out.println(num+" is a palendrum");

}else{

System.out.println(num+" is not a palendrum");

}

}

}