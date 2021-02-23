public class Switch{

public static void main(String[] args){

int x=10;

int y=20;

char ch = 'c';

switch(ch){

  case 'a':
       System.out.println("Addition of 2 numbers:" + (x+y));
       break;
  
  case 'b':
       System.out.println("multiplication of 2 numbers:" + (x*y));
       break;

  case 'c':
       System.out.println("substraction of 2 numbers:" + (x-y));
       break;
  
  case 'd':
       System.out.println("division of 2 numbers:" + (x%y));
       break;

  case 'e':
       System.out.println("module of 2 numbers:" + (x/y));
       break;
  
  default:
       System.out.println("your selected wrong option");
       break;
}

}

}
