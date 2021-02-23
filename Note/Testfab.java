public class Testfab{

public static void main(String[] args){

int x=0,y=1,i=0,fab;

System.out.print(x+ " " +y);

do{

fab=(x+y);

System.out.print(" " +fab);

x=y;

y=fab;

i++;

}while(i<=10);

}

}