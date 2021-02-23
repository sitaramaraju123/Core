package practice;
import java.util.*;
public class Randomotp {

	public static void main(String[] args) {
		NewOne a = new NewOne();
		a.registration();
	}

}

class NewOne{
	void registration() {
		System.out.println("Welcome to Registration Form");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		for(int l=1; l<=3; l++) {
		System.out.print("Enter your Phone number: ");
		long num = sc.nextLong();
		Long m = Long.valueOf(num);
		String num2=m.toString();
		if(num2.length()==10) {
		System.out.print("Create Password: ");
		String password = sc.next();
		for(int k=1; k<=3; k++) {
		System.out.print("Conform Password");
		String con_password = sc.next();
		if(password.equalsIgnoreCase(con_password)) {
		System.out.println("Send the OTP to your Registerd Mobile");
		int randomNum = getRandomInteger(9999,1000); 
		System.out.println("Your OTP: "+randomNum);
		for(int j=1; j<3; j++) {
		System.out.println("Please enter your OTP");
		int num1 = sc.nextInt();
		if(num1==randomNum) {
			System.out.println("You have Successfully Registerd");
			System.out.println("You can Login now");
			System.out.println();
			System.out.println("Login Form");
			for(int i=0; i<3; i++) {
			System.out.print("Enter your Registred Phone Number (or) User name: ");
			String nu = sc.next();
			System.out.print("Enter your Password: ");
			String pass = sc.next();
			if(nu.equals(num2) || nu.equals(name) && pass.equalsIgnoreCase(con_password)) {
				System.out.println("Welcome "+name);
				break;
			}else {
				System.out.println("Please Check your Registred number (or) password");
			}
			}break;
		} else {
			System.out.println("Your entered OTP is Wrong");
		}
		}break;
		}else {
			System.out.println("Created password And Conform Password Must be Same...");
		}
		}
		break;
		}else {
			System.out.println("Please Check you Mobile Number With in the 10 Digits or Not...");
		}
		}
			
	}

	private int getRandomInteger(int i, int j) {
		return ((int) (Math.random()*(i-j)))+j;
	}
}