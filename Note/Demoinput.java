import java.io.*;

public class Demoinput{

public static void main(String[] args) throws IOException {

InputStreamReader obj = new InputStreamReader(System.in);

BufferedReader br = new BufferedReader(obj);

System.out.println("Please enter your Name:");

String num1 = br.readLine();

System.out.println("Please enter your phone number");

String num2 = br.readLine();

System.out.println("please enter your salary");

String salary = br.readLine();

int sal=Integer.parseInt(salary);

System.out.println("please enter your HRA");

String Hra = br.readLine();

int HRA=Integer.parseInt(Hra);

System.out.println("please enter your DA");

String Da = br.readLine();

int DA=Integer.parseInt(Da);

System.out.println("please enter your P.F");

String Pf = br.readLine();

int PF=Integer.parseInt(Pf);


int i=(sal+(HRA*sal/100)+(DA*sal/100)-(PF*sal/100));


System.out.println("Name :" +num1);

System.out.println("Phone :" +num2);

System.out.println("Salary :" +sal);

System.out.println("Total of salary :" +i);

if(i>=50000){

System.out.println("You can eligible to get married");

}else{

System.out.println("You are not eligible to get married");

}

}

}