public class Testleap{

public static void main(String[] args){

int i=2015;

String year=((i%4==0) && (i%100!=0) || (i%400==0))? "Leap year":"Not a leapyear";

System.out.println(year);

}

}