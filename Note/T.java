public class T{

public static void main(String[] args){

int i=100;

switch('a'){

  case 'a':if(i>80 && i<=100){
       System.out.println("A");
       }else if(i>65 && i<=80){
       System.out.println("B");
       }else if(i>50 && i<=65){
       System.out.println("C");
       }else if(i>30 && i<=50){
       System.out.println("D");
       }else{
       System.out.println("Fail");
       }
break;

default:

System.out.println("invalid switch case");

}

}

}