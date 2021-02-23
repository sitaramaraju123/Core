public class Armstrong{

public static void main(String [] args){

int num=153,org=num,n,result=0;

while(org!=0){

n=org%10;

result = result+(n*n*n);

org=org/10;

}

if(result==num){

System.out.println(num+ " is a Armstrong number");

}else{

System.out.println(num+ " is not a Armstrong number");

} 


}


}