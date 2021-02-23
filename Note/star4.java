public class Star4{

public static void main(String[] args){

int num=0;

for(int i=1;i<=5;i++){
if(i==3){

continue;

}

for(int j=1;j<=i;j++){

num=num+1;

System.out.print(num+" ");
}
System.out.println(" ");
}

}

}