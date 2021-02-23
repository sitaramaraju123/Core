import java.util.Scanner;
class DemoScanner{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("please enter your name");

String name = sc.nextLine();

System.out.println("please enter your number");

long phone = sc.nextLong();

System.out.println("please enter your salary");

int salary = sc.nextInt();

System.out.println("please enter your HRA");

int HRA = sc.nextInt();

System.out.println("please enter your DA");

int DA = sc.nextInt();

System.out.println("please enter your P.F");

int PF = sc.nextInt();

int i=(salary+(HRA*salary/100)+(DA*salary/100)-(PF*salary/100));

System.out.println("Name :" +name);
System.out.println("Phone number :" +phone);
System.out.println("Salary :" +salary);
System.out.println("Total net salary :" +i);

if(i>=50000){

System.out.println("You are get 50k above u r able to get married");

}else{

System.out.println("You are not getting 50k above so u r not able to get marry");

}

}

}