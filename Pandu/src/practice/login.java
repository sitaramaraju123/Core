package practice;
import java.util.*;
public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "sitaramaraju@gmail.com";
		String password = "ramaraju";
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter your email id: ");
		String name = sc.next();
		System.out.print("Enter your password: ");
		String pass = sc.next();
		int count=0;
		if(name.equals(username) && password.equals(pass)) {
			System.out.println("Login Successfull");
			count++;
		}else if(name!=username || pass!=password) {
			System.out.println("You entred Wrong id or password");
			for(int i=1; i<4;i++) {
				System.out.println("please re-enter your email: ");
				name=sc.next();
				System.out.println("please re-enter your password: ");
				pass=sc.next();
				if(name.equals(username) && password.equals(pass)) {
					System.out.println("Login Successfull");
					count++;
					break;
				}
				else {
					System.out.println("You entred Wrong id or password");
				}
			}
		}
		if(count==0) {
		System.out.println("Time out");
		}
	}
}
