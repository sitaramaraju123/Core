public class Character{

public static void main(String[] args){

char ch='!';

if((ch>=0 && ch<=48)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96)||(ch>=123 && ch<128)){

System.out.println("Given Char is Special Character " +ch);

}else if(ch>=65 && ch<=90){

System.out.println("Given char is Uppercase " +ch);

}else if(ch>=97 && ch<=123){

System.out.println("Given char is lowercase " +ch);

}


}


}