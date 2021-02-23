public class Fibonacci{

public static void main(String[] args){

int x=0,y=1,fib;

System.out.print(x+ " " +y);

for(int i=2; i<10; i++){

fib =(x+y);

System.out.print(" " + fib);

x=y;

y=fib;
	
}

}


}